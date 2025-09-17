package org.example.gerenciarTarefas.useCases;

import org.example.gerenciarTarefas.domain.Tarefa;
import org.example.gerenciarTarefas.repository.TarefaRepository;

public class ConcluirTarefaUseCase {
    private final TarefaRepository repository;

    public ConcluirTarefaUseCase(TarefaRepository repository) {
        this.repository = repository;
    }

    public void executar(Tarefa tarefa) {
        tarefa.setTarefaConcluida(true);
        repository.salvar(tarefa);
        System.out.println("Tarefa concluída: " + tarefa.getDescricao());
    }
}
