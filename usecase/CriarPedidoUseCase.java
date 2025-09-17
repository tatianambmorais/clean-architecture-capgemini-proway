package usecase;

import domain.*;

import java.util.List;

public class CriarPedidoUseCase {
    private final PedidoRepository pedidoRepo;
    private final LancheRepository lancheRepo;

    public CriarPedidoUseCase(PedidoRepository pedidoRepo, LancheRepository lancheRepo) {
        this.pedidoRepo = pedidoRepo;
        this.lancheRepo = lancheRepo;
    }

    public Pedido executar(List<String> nomesLanches) {
        Pedido pedido = new Pedido();
        for (String nome : nomesLanches) {
            Lanche lanche = lancheRepo.buscarPorNome(nome);
            if (lanche == null)
                throw new IllegalArgumentException("Lanche não encontrado: " + nome);
            pedido.adicionarLanche(lanche); // regras já validadas na entidade
        }
        pedidoRepo.salvar(pedido);
        return pedido;
    }
}

