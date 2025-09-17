package org.example.reservaQuartos.repository;

import org.example.reservaQuartos.domain.Quarto;
import java.util.List;

import java.util.ArrayList;

public class QuartoRepositoryEmMemoria implements QuartoRepository {
    private List<Quarto> quartos = new ArrayList<>();

    @Override
    public void salvarQuarto(Quarto quarto){
        quartos.add(quarto);
        System.out.println("Quarto de nº " + quarto.getNumero() + " salvo.");
    }

    @Override
    public List<Quarto> listarTodos() {
        System.out.println("Lista de quartos:");
        for (Quarto quarto : quartos) {
            System.out.println("Número: " + quarto.getNumero() + ", Tipo: " + quarto.getTipo() + ", Disponível: " + (quarto.isStatusOcupado()));
        }
        return quartos;
    }

    public Quarto buscarPorNumero(Long numero){
        for (Quarto quarto : quartos) {
            if (quarto.getNumero().equals(numero)) {
                return quarto;
            }
        }
        return null;
    }
}
