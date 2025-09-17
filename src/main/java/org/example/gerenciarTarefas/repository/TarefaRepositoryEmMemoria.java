package org.example.gerenciarTarefas.repository;

import org.example.gerenciarTarefas.domain.Tarefa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TarefaRepositoryEmMemoria implements TarefaRepository {
    private final Set<Tarefa> tarefas = new HashSet<>();

    @Override
    public void salvar(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    @Override
    public List<Tarefa> listarTodos() {
        return tarefas.stream().collect(Collectors.toList());
    }

    @Override
    public List<Tarefa> listarPendentes() {
        return tarefas.stream()
                .filter(tarefa -> !tarefa.isTarefaConcluida())
                .collect(Collectors.toList());
    }
}
