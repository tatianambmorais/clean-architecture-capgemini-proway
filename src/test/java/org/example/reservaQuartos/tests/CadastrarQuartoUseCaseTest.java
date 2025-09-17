package org.example.reservaQuartos.tests;

import org.example.reservaQuartos.domain.Quarto;
import org.example.reservaQuartos.repository.QuartoRepositoryEmMemoria;
import org.example.reservaQuartos.useCases.CadastrarQuartoUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CadastrarQuartoUseCaseTest {
    private QuartoRepositoryEmMemoria quartoRepositoryEmMemoria;
    private CadastrarQuartoUseCase cadastrarQuartoUseCase;
    @BeforeEach
    public void setup(){
        quartoRepositoryEmMemoria = new QuartoRepositoryEmMemoria();
        cadastrarQuartoUseCase = new CadastrarQuartoUseCase(quartoRepositoryEmMemoria);
    }

    @Test
    public void deveCadastrarUmQuarto(){
        cadastrarQuartoUseCase.executar(101L, "Solteiro", false);
        assertNotNull(quartoMock());
        assertEquals(101L, quartoMock().getNumero());
        assertEquals("Solteiro", quartoMock().getTipo());
        assertEquals(false, quartoMock().isStatusOcupado());
    }

    private Quarto quartoMock() {
        return quartoRepositoryEmMemoria.buscarPorNumero(101L);
    }
}
