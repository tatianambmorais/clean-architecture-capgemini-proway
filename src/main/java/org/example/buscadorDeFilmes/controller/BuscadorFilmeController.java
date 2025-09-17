package org.example.buscadorDeFilmes.controller;

import org.example.buscadorDeFilmes.useCases.BuscadorFilmeUseCase;

public class BuscadorFilmeController {
    private final BuscadorFilmeUseCase buscadorFilmeUseCase;

    public BuscadorFilmeController(BuscadorFilmeUseCase buscadorFilmeUseCase){
        this.buscadorFilmeUseCase = buscadorFilmeUseCase;
    }

    public void listar(String titulo){
        buscadorFilmeUseCase.execute(titulo);

    }
}
