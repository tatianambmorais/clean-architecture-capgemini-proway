package org.example.gerenciarTarefas.tests;

import org.example.gerenciarTarefas.domain.Tarefa;
import org.example.gerenciarTarefas.repository.TarefaRepositoryEmMemoria;
import org.example.gerenciarTarefas.useCases.ListarTarefasPendentesUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListarTarefasPendentesUseCaseTest {
    private TarefaRepositoryEmMemoria repository;
    private ListarTarefasPendentesUseCase listarTarefasPendentesUseCase;

    @BeforeEach
    void setUp() {
        repository = new TarefaRepositoryEmMemoria();
        listarTarefasPendentesUseCase = new ListarTarefasPendentesUseCase(repository);
    }

    @Test
    void deveListarApenasTarefasPendentes() {
        repository.salvar(new Tarefa("Tarefa 1", false));
        repository.salvar(new Tarefa("Tarefa 2", true));
        repository.salvar(new Tarefa("Tarefa 3", false));

        var tarefasPendentes = listarTarefasPendentesUseCase.executar();

        assertEquals(2, tarefasPendentes.size());
        assertEquals(false, tarefasPendentes.get(0).isTarefaConcluida());
        assertEquals(false, tarefasPendentes.get(1).isTarefaConcluida());
    }
}
