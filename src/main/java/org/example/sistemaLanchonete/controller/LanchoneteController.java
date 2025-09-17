package org.example.sistemaLanchonete.controller;

import org.example.sistemaLanchonete.domain.Lanche;
import org.example.sistemaLanchonete.domain.Pedido;
import org.example.sistemaLanchonete.useCases.*;

import java.util.List;

public class LanchoneteController {
    private final CadastrarLanchesUseCase cadastrarLanchesUseCase;
    private final ListarLanchesUseCase listarLanchesUseCase;
    private final CriarPedidoUseCase criarPedidoUseCase;
    private final FinalizarPedidoUseCase finalizarPedidoUseCase;

    public LanchoneteController(
            CadastrarLanchesUseCase cadastrarLanchesUseCase,
            ListarLanchesUseCase listarLanchesUseCase,
            CriarPedidoUseCase criarPedidoUseCase,
            FinalizarPedidoUseCase finalizarPedidoUseCase) {
        this.cadastrarLanchesUseCase = cadastrarLanchesUseCase;
        this.listarLanchesUseCase = listarLanchesUseCase;
        this.criarPedidoUseCase = criarPedidoUseCase;
        this.finalizarPedidoUseCase = finalizarPedidoUseCase;
    }

    public void cadastrarLanche(String nome, double preco, boolean disponivel) {
        cadastrarLanchesUseCase.executar(nome, preco, disponivel);
    }

    public List<Lanche> listarLanchesDisponiveis() {
        return listarLanchesUseCase.executar();
    }

    public Pedido criarPedido(List<String> nomesLanches) {
        return criarPedidoUseCase.executar(nomesLanches);
    }

    public void finalizarPedido(int pedidoId) {
        finalizarPedidoUseCase.executar(pedidoId);
    }
}
