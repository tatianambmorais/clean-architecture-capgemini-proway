package org.example.gerenciarTarefas.controller;

import org.example.gerenciarTarefas.domain.Tarefa;
import org.example.gerenciarTarefas.useCases.CriarTarefaUseCase;
import org.example.gerenciarTarefas.useCases.ListarTarefasPendentesUseCase;
import org.example.gerenciarTarefas.useCases.ConcluirTarefaUseCase;

import java.util.List;

public class TarefaController {
    private final CriarTarefaUseCase criarTarefaUseCase;
    private final ListarTarefasPendentesUseCase listarTarefasPendentesUseCase;
    private final ConcluirTarefaUseCase concluirTarefaUseCase;

    public TarefaController(
            CriarTarefaUseCase criarTarefaUseCase,
            ListarTarefasPendentesUseCase listarTarefasPendentesUseCase,
            ConcluirTarefaUseCase concluirTarefaUseCase) {
        this.criarTarefaUseCase = criarTarefaUseCase;
        this.listarTarefasPendentesUseCase = listarTarefasPendentesUseCase;
        this.concluirTarefaUseCase = concluirTarefaUseCase;
    }

    public void criarTarefa(String descricao) {
        criarTarefaUseCase.executar(descricao);
    }

    public List<Tarefa> listarTarefasPendentes() {
        return listarTarefasPendentesUseCase.executar();
    }

    public void concluirTarefa(Tarefa tarefa) {
        concluirTarefaUseCase.executar(tarefa);
    }
}
