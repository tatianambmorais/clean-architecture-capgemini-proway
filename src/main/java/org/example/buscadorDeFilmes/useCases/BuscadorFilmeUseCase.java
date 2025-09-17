package org.example.buscadorDeFilmes.useCases;

import org.example.buscadorDeFilmes.model.Filme;
import org.example.buscadorDeFilmes.repository.FilmeRepository;

import java.util.Optional;

public class BuscadorFilmeUseCase {
    private final FilmeRepository repository;

    public BuscadorFilmeUseCase(FilmeRepository filmeRepository){
        this.repository = filmeRepository;
    }

    public Optional<Filme> execute(String titulo){

        Optional<Filme> filmeEncontrado = repository.buscarFilmePorTitulo(titulo);
        filmeEncontrado.ifPresentOrElse(filme -> System.out.println("Filme encontrado: " + filme.getTitulo()),
                () -> System.out.println("Nenhum filme encontrado com o título: " + titulo));
        return filmeEncontrado;
    }

}
