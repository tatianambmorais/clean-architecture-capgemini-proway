package org.example.gerenciarTarefas.tests;

import org.example.gerenciarTarefas.repository.TarefaRepositoryEmMemoria;
import org.example.gerenciarTarefas.useCases.CriarTarefaUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CriarTarefaUseCaseTest {
    private TarefaRepositoryEmMemoria repository;
    private CriarTarefaUseCase criarTarefaUseCase;

    @BeforeEach
    void setUp() {
        repository = new TarefaRepositoryEmMemoria();
        criarTarefaUseCase = new CriarTarefaUseCase(repository);
    }

    @Test
    void deveCriarTarefaComDescricao() {
        String descricao = "Nova tarefa";
        criarTarefaUseCase.executar(descricao);

        var tarefas = repository.listarTodos();
        assertEquals(1, tarefas.size());
        assertEquals(descricao, tarefas.get(0).getDescricao());
        assertEquals(false, tarefas.get(0).isTarefaConcluida());
    }
}
