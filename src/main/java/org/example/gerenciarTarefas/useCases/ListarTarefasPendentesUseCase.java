package org.example.gerenciarTarefas.useCases;

import org.example.gerenciarTarefas.domain.Tarefa;
import org.example.gerenciarTarefas.repository.TarefaRepository;
import java.util.List;

public class ListarTarefasPendentesUseCase {
    private final TarefaRepository repository;

    public ListarTarefasPendentesUseCase(TarefaRepository repository) {
        this.repository = repository;
    }

    public List<Tarefa> executar() {
        List<Tarefa> tarefasPendentes = repository.listarPendentes();
        System.out.println("Tarefas pendentes:");
        tarefasPendentes.forEach(tarefa ->
                System.out.println("- " + tarefa.getDescricao())
        );
        return tarefasPendentes;
    }
}
