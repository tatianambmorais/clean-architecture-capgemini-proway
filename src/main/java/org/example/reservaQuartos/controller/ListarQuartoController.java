package org.example.reservaQuartos.controller;

import org.example.listagemFuncionario.useCases.ListarFuncionarioUseCase;
import org.example.reservaQuartos.useCases.ListarQuartosUseCase;

public class ListarQuartoController {
    private final ListarQuartosUseCase listarQuartosUseCase;

    public ListarQuartoController(ListarQuartosUseCase listarQuartosUseCase){
        this.listarQuartosUseCase = listarQuartosUseCase;
    }

    public void listarQuartoUseCase(){
        listarQuartosUseCase.executar();
    }
}
