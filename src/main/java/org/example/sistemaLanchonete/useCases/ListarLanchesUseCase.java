package org.example.sistemaLanchonete.useCases;

import org.example.sistemaLanchonete.domain.Lanche;
import org.example.sistemaLanchonete.repository.LancheRepository;

import java.util.List;

public class ListarLanchesUseCase {
    private final LancheRepository repository;

    public ListarLanchesUseCase(LancheRepository repository) {
        this.repository = repository;
    }

    public List<Lanche> executar() {
        return repository.listarDisponiveis();
    }
}

