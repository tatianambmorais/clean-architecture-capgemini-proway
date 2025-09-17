package org.example.reservaQuartos.useCases;

import org.example.reservaQuartos.domain.Quarto;
import org.example.reservaQuartos.repository.QuartoRepository;

public class ReservarQuartoUseCase {
    final QuartoRepository quartoRepository;

    public ReservarQuartoUseCase(QuartoRepository quartoRepository){
        this.quartoRepository = quartoRepository;
    }

    public void executar(Long numeroQuarto){
        Quarto quartoParaReserva = quartoRepository.buscarPorNumero(numeroQuarto);
        if ((quartoParaReserva != null) && (!quartoParaReserva.isStatusOcupado())) {
            quartoParaReserva.setStatusOcupado(true);
            quartoRepository.salvarQuarto(quartoParaReserva);
            System.out.println("Quarto " + numeroQuarto + " reservado com sucesso.");
        } else if (quartoParaReserva == null) {
            System.out.println("Quarto " + numeroQuarto + " não encontrado.");
        } else {
            System.out.println("Quarto " + numeroQuarto + " já está ocupado.");
        }

    }
}
