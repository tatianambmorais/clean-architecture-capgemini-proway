package org.example.reservaQuartos.useCases;

import org.example.reservaQuartos.domain.Quarto;
import org.example.reservaQuartos.repository.QuartoRepository;

import java.util.List;

public class ListarQuartosUseCase {
    private final QuartoRepository quartoRepository;

    public ListarQuartosUseCase(QuartoRepository quartoRepository){
        this.quartoRepository = quartoRepository;
    }

    public List<Quarto> executar(){
        return quartoRepository.listarTodos();
    }
}
