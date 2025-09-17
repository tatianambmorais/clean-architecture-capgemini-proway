package org.example.sistemaLanchonete.useCases;

import org.example.sistemaLanchonete.domain.Lanche;
import org.example.sistemaLanchonete.repository.LancheRepository;

public class CadastrarLanchesUseCase {
    private final LancheRepository repository;

    public CadastrarLanchesUseCase(LancheRepository repository) {
        this.repository = repository;
    }

    public void executar(String nome, double preco, boolean disponivel) {
        Lanche lanche = new Lanche(nome, preco, disponivel);
        repository.salvar(lanche);
    }
}

