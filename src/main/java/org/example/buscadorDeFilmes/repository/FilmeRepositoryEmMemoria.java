package org.example.buscadorDeFilmes.repository;

import org.example.buscadorDeFilmes.model.Filme;

import java.util.ArrayList;
import java.util.Optional;

public class FilmeRepositoryEmMemoria implements  FilmeRepository{
    private final ArrayList<Filme> filmes = new ArrayList<>();

    public FilmeRepositoryEmMemoria(){
        carregarFilmesPadrao();
    }

    private void carregarFilmesPadrao() {
        filmes.add(new Filme("Sexta Feira Muito Louca", "Comédia", 2005));
        filmes.add(new Filme("Madagascar", "Animação", 2005));

    }

//    public Filme buscarFilmePorTitulo(String titulo){
//        try {
//            for (Filme filme : filmes) {
//                if (filme.getTitulo().equals(titulo)) {
//                    return filme;
//                }
//            }
//        }
//        catch(){
//
//        }
//        return null;
//    }

    public Optional<Filme> buscarFilmePorTitulo(String titulo) {
        return filmes.stream()
                .filter(filme -> filme.getTitulo().equals(titulo))
                .findFirst();
    }


}
