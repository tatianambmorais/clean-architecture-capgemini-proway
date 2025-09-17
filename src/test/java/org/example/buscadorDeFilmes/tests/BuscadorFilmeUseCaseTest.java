package org.example.buscadorDeFilmes.tests;

import org.example.buscadorDeFilmes.model.Filme;
import org.example.buscadorDeFilmes.repository.FilmeRepositoryEmMemoria;
import org.example.buscadorDeFilmes.useCases.BuscadorFilmeUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BuscadorFilmeUseCaseTest {
    private FilmeRepositoryEmMemoria repository;
    private BuscadorFilmeUseCase useCase;

    @BeforeEach
    void setUp(){
        repository = new FilmeRepositoryEmMemoria();
        useCase = new BuscadorFilmeUseCase(repository);
    }

    @Test
    void deveBuscarFilmePorTitulo(){
       Filme filme = useCase.execute("Madagascar").orElse(null);
       assertNotNull(filme);
       assertEquals("Madagascar", filme.getTitulo());
    }
}
