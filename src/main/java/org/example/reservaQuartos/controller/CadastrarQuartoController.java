package org.example.reservaQuartos.controller;

import org.example.reservaQuartos.useCases.CadastrarQuartoUseCase;

public class CadastrarQuartoController {
    private final CadastrarQuartoUseCase cadastrarQuartoUseCase;


    public CadastrarQuartoController(CadastrarQuartoUseCase cadastrarQuartoUseCase){
        this.cadastrarQuartoUseCase = cadastrarQuartoUseCase;
    }

    public void cadastrarQuartoUseCase(Long numero, String tipo, boolean statusOcupado){
        cadastrarQuartoUseCase.executar(numero, tipo, statusOcupado);
    }
}
