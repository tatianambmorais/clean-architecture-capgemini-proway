package org.example.gerenciarTarefas.useCases;

import org.example.gerenciarTarefas.domain.Tarefa;
import org.example.gerenciarTarefas.repository.TarefaRepository;

public class CriarTarefaUseCase {
    private final TarefaRepository repository;

    public CriarTarefaUseCase(TarefaRepository repository) {
        this.repository = repository;
    }

    public void executar(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao, false);
        repository.salvar(novaTarefa);
        System.out.println("Tarefa criada: " + descricao);
    }
}
