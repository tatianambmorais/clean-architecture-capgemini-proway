package org.example.buscadorDeFilmes.repository;

import org.example.buscadorDeFilmes.model.Filme;

import java.util.Optional;

public interface FilmeRepository {
    public Optional<Filme> buscarFilmePorTitulo(String titulo);
}
