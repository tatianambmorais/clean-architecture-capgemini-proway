package org.example.gerenciarTarefas;
import org.example.gerenciarTarefas.controller.TarefaController;
import org.example.gerenciarTarefas.domain.Tarefa;
import org.example.gerenciarTarefas.repository.TarefaRepositoryEmMemoria;
import org.example.gerenciarTarefas.useCases.CriarTarefaUseCase;
import org.example.gerenciarTarefas.useCases.ListarTarefasPendentesUseCase;
import org.example.gerenciarTarefas.useCases.ConcluirTarefaUseCase;

public class Main {
    public static void main(String[] args) {
        // Inicialização
        TarefaRepositoryEmMemoria repository = new TarefaRepositoryEmMemoria();
        CriarTarefaUseCase criarTarefaUseCase = new CriarTarefaUseCase(repository);
        ListarTarefasPendentesUseCase listarTarefasPendentesUseCase = new ListarTarefasPendentesUseCase(repository);
        ConcluirTarefaUseCase concluirTarefaUseCase = new ConcluirTarefaUseCase(repository);

        TarefaController controller = new TarefaController(
                criarTarefaUseCase,
                listarTarefasPendentesUseCase,
                concluirTarefaUseCase
        );

        controller.criarTarefa("Estudar Java");
        controller.criarTarefa("Fazer exercícios");
        controller.listarTarefasPendentes();

        Tarefa primeiraTarefa = repository.listarTodos().get(0);
        controller.concluirTarefa(primeiraTarefa);

        controller.listarTarefasPendentes();
    }
}
