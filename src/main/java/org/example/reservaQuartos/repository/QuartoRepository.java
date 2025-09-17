package org.example.reservaQuartos.repository;

import org.example.reservaQuartos.domain.Quarto;

import java.util.List;


public interface QuartoRepository {
    void salvarQuarto(Quarto quarto);
    List<Quarto> listarTodos();
    Quarto buscarPorNumero(Long numero);
}
