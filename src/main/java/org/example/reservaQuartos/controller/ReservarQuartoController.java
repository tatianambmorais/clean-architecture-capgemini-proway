package org.example.reservaQuartos.controller;

import org.example.reservaQuartos.repository.QuartoRepository;
import org.example.reservaQuartos.useCases.ReservarQuartoUseCase;

public class ReservarQuartoController {
    final ReservarQuartoUseCase reservarQuartoUseCase;
    public ReservarQuartoController(ReservarQuartoUseCase reservarQuartoUseCase){
        this.reservarQuartoUseCase = reservarQuartoUseCase;
    }

    public void reservarQuartoUseCase(Long numero){
        reservarQuartoUseCase.executar(numero);
    }
}
