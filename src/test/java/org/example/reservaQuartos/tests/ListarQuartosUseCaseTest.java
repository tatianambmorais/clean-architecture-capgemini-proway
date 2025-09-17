package org.example.reservaQuartos.tests;

import org.example.reservaQuartos.domain.Quarto;
import org.example.reservaQuartos.repository.QuartoRepositoryEmMemoria;
import org.example.reservaQuartos.useCases.ListarQuartosUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ListarQuartosUseCaseTest {
    private QuartoRepositoryEmMemoria quartoRepositoryEmMemoria;
    private ListarQuartosUseCase listarQuartosUseCase;
    @BeforeEach
    public void setup(){
        quartoRepositoryEmMemoria = new QuartoRepositoryEmMemoria();
        listarQuartosUseCase = new ListarQuartosUseCase(quartoRepositoryEmMemoria);
        quartoRepositoryEmMemoria.salvarQuarto(new Quarto(1L, "Simples", true));
        quartoRepositoryEmMemoria.salvarQuarto(new Quarto(2L, "Duplo", false));
        quartoRepositoryEmMemoria.salvarQuarto(new Quarto(3L, "Suíte", true));
    }

    @Test
    public void deveListarQuartos(){
        List<Quarto> quartos = listarQuartosUseCase.executar();
        assertNotNull(quartoRepositoryEmMemoria.listarTodos());
        assertEquals(3, quartoRepositoryEmMemoria.listarTodos().size());
        assertEquals("Simples", quartos.get(0).getTipo());
        assertEquals("Duplo", quartos.get(1).getTipo());
        assertEquals("Suíte", quartos.get(2).getTipo());

    }


}
