package org.example.sistemaLanchonete.useCases;

import org.example.sistemaLanchonete.domain.Lanche;
import org.example.sistemaLanchonete.domain.Pedido;
import org.example.sistemaLanchonete.repository.LancheRepository;
import org.example.sistemaLanchonete.repository.PedidoRepository;

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
            pedido.adicionarLanche(lanche);
        }
        pedidoRepo.salvar(pedido);
        return pedido;
    }
}