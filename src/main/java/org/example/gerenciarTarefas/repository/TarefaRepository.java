package org.example.gerenciarTarefas.repository;

import org.example.gerenciarTarefas.domain.Tarefa;

import java.util.List;

public interface TarefaRepository {
    void salvar(Tarefa tarefa);
    List<Tarefa> listarTodos();
    List<Tarefa> listarPendentes();
}
