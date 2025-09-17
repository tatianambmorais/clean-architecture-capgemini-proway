package org.example.sistemaLanchonete.tests;

import org.example.sistemaLanchonete.domain.Lanche;
import org.example.sistemaLanchonete.domain.Pedido;
import org.example.sistemaLanchonete.repository.LancheRepositoryEmMemoria;
import org.example.sistemaLanchonete.repository.PedidoRepositoryEmMemoria;
import org.example.sistemaLanchonete.useCases.CriarPedidoUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CriarPedidoUseCaseTest {
    private LancheRepositoryEmMemoria lancheRepository;
    private PedidoRepositoryEmMemoria pedidoRepository;
    private CriarPedidoUseCase criarPedidoUseCase;

    @BeforeEach
    void setUp() {
        lancheRepository = new LancheRepositoryEmMemoria();
        pedidoRepository = new PedidoRepositoryEmMemoria();
        criarPedidoUseCase = new CriarPedidoUseCase(pedidoRepository, lancheRepository);

        lancheRepository.salvar(new Lanche("X-Burger", 15.90, true));
        lancheRepository.salvar(new Lanche("X-Salada", 17.90, true));
    }

    @Test
    void deveCriarPedidoComLanchesExistentes() {
        Pedido pedido = criarPedidoUseCase.executar(Arrays.asList("X-Burger", "X-Salada"));

        assertEquals(2, pedido.getLanches().size());
        assertEquals(33.80, pedido.getValorTotal());
    }

    @Test
    void deveLancarExcecaoAoTentarCriarPedidoComLancheInexistente() {
        assertThrows(IllegalArgumentException.class, () ->
                criarPedidoUseCase.executar(Arrays.asList("X-Burger", "X-Invalid")));
    }
}
