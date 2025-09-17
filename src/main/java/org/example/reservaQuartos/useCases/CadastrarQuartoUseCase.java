package org.example.reservaQuartos.useCases;

import org.example.reservaQuartos.domain.Quarto;
import org.example.reservaQuartos.repository.QuartoRepository;

public class CadastrarQuartoUseCase {
    private final QuartoRepository quartoRepository;

    public CadastrarQuartoUseCase(QuartoRepository quartoRepository){
        this.quartoRepository = quartoRepository;
    }

    public void executar(Long numero, String tipo, boolean statusOcupado){
        Quarto quarto = new Quarto(numero, tipo, statusOcupado);
        quartoRepository.salvarQuarto(quarto);

    }
}
