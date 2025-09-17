        Pedido pedido = repository.buscarPorId(pedidoId);
        if (pedido == null)
            throw new IllegalArgumentException("Pedido não encontrado.");
        pedido.finalizar();
        repository.salvar(pedido);
    }
}
package usecase;

import domain.Pedido;
import domain.PedidoRepository;

public class FinalizarPedidoUseCase {
    private final PedidoRepository repository;

    public FinalizarPedidoUseCase(PedidoRepository repository) {
        this.repository = repository;
    }

    public void executar(int pedidoId) {

