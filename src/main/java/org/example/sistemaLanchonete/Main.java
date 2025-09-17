package org.example.sistemaLanchonete;

import org.example.sistemaLanchonete.controller.LanchoneteController;
import org.example.sistemaLanchonete.repository.*;
import org.example.sistemaLanchonete.useCases.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LancheRepository lancheRepo = new LancheRepositoryEmMemoria();
        PedidoRepository pedidoRepo = new PedidoRepositoryEmMemoria();

        CadastrarLanchesUseCase cadastrarLanchesUseCase = new CadastrarLanchesUseCase(lancheRepo);
        ListarLanchesUseCase listarLanchesUseCase = new ListarLanchesUseCase(lancheRepo);
        CriarPedidoUseCase criarPedidoUseCase = new CriarPedidoUseCase(pedidoRepo, lancheRepo);
        FinalizarPedidoUseCase finalizarPedidoUseCase = new FinalizarPedidoUseCase(pedidoRepo);

        LanchoneteController controller = new LanchoneteController(
                cadastrarLanchesUseCase,
                listarLanchesUseCase,
                criarPedidoUseCase,
                finalizarPedidoUseCase
        );

        System.out.println("Cadastrando lanches...");
        controller.cadastrarLanche("X-Burger", 15.90, true);
        controller.cadastrarLanche("X-Salada", 17.90, true);
        controller.cadastrarLanche("X-Bacon", 19.90, false);

        System.out.println("\nLanches disponíveis:");
        controller.listarLanchesDisponiveis().forEach(lanche ->
                System.out.println(lanche.getNome() + " - R$ " + lanche.getPreco()));

        System.out.println("\nCriando pedido...");
        var pedido = controller.criarPedido(Arrays.asList("X-Burger", "X-Salada"));
        System.out.println("Pedido criado com " + pedido.getLanches().size() + " itens");

        System.out.println("\nFinalizando pedido...");
        controller.finalizarPedido(0);
        System.out.println("Pedido finalizado!");
    }
}
