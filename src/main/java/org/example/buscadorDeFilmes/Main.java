package org.example.buscadorDeFilmes;

import org.example.buscadorDeFilmes.controller.BuscadorFilmeController;
import org.example.buscadorDeFilmes.repository.FilmeRepository;
import org.example.buscadorDeFilmes.repository.FilmeRepositoryEmMemoria;
import org.example.buscadorDeFilmes.useCases.BuscadorFilmeUseCase;

public class Main {
    public static void main(String[] args){
        FilmeRepository filmeRepository = new FilmeRepositoryEmMemoria();
        BuscadorFilmeUseCase useCase = new BuscadorFilmeUseCase(filmeRepository);
        BuscadorFilmeController buscadorFilmeController = new BuscadorFilmeController(useCase);

        buscadorFilmeController.listar("Madagascar");
    }
}
