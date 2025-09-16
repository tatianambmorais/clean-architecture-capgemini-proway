package org.example.listagemFuncionarios.tests;

import org.example.listagemFuncionario.model.Funcionario;
import org.example.listagemFuncionario.repository.FuncionarioRepositoryEmMemoria;
import org.example.listagemFuncionario.useCases.ListarFuncionarioUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ListarFuncionarioUseCaseTest {

    private FuncionarioRepositoryEmMemoria repositoryEmMemoria;
    private ListarFuncionarioUseCase useCase;

    @BeforeEach
    void setUp(){
        repositoryEmMemoria = new FuncionarioRepositoryEmMemoria();
        useCase = new ListarFuncionarioUseCase(repositoryEmMemoria);

    }
    @Test
    void deveListarFuncionarios(){
        List<Funcionario> funcionarios = useCase.executar();
        assertEquals("Tatiana", funcionarios.get(0).getNome());
        assertEquals("Consultora", funcionarios.get(0).getCargo());
        assertEquals(new BigDecimal(8500), funcionarios.get(0).getSalario());

        assertEquals("Carlos", funcionarios.get(1).getNome());
        assertEquals("Analista", funcionarios.get(1).getCargo());
        assertEquals(new BigDecimal(6500), funcionarios.get(1).getSalario());

    }
}
