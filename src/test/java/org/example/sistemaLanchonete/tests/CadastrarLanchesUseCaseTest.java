package org.example.sistemaLanchonete.tests;

import org.example.sistemaLanchonete.domain.Lanche;
import org.example.sistemaLanchonete.repository.LancheRepositoryEmMemoria;
import org.example.sistemaLanchonete.useCases.CadastrarLanchesUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CadastrarLanchesUseCaseTest {
    private LancheRepositoryEmMemoria repository;
    private CadastrarLanchesUseCase cadastrarLanchesUseCase;

    @BeforeEach
    void setUp() {
        repository = new LancheRepositoryEmMemoria();
        cadastrarLanchesUseCase = new CadastrarLanchesUseCase(repository);
    }

    @Test
    void deveCadastrarLancheComSucesso() {
        String nome = "X-Burger";
        double preco = 15.90;
        boolean disponivel = true;

        cadastrarLanchesUseCase.executar(nome, preco, disponivel);

        Lanche lancheEncontrado = repository.buscarPorNome(nome);
        assertEquals(nome, lancheEncontrado.getNome());
        assertEquals(preco, lancheEncontrado.getPreco());
        assertEquals(disponivel, lancheEncontrado.isDisponivel());
    }
}
