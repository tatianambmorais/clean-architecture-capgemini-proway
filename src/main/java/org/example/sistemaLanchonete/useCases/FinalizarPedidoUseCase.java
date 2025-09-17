package org.example.sistemaLanchonete.useCases;

import org.example.sistemaLanchonete.domain.Pedido;
import org.example.sistemaLanchonete.repository.PedidoRepository;

public class FinalizarPedidoUseCase {
    private final PedidoRepository repository;

    public FinalizarPedidoUseCase(PedidoRepository repository) {
        this.repository = repository;
    }

    public void executar(int pedidoId) {
        Pedido pedido = repository.buscarPorId(pedidoId);
        if (pedido == null)
            throw new IllegalArgumentException("Pedido não encontrado.");
        pedido.finalizar();
        repository.salvar(pedido);
    }
}



