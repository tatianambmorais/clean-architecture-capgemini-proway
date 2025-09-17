package usecase;

import domain.Lanche;
import domain.LancheRepository;

public class CadastrarLancheUseCase {
    private final LancheRepository repository;

    public CadastrarLancheUseCase(LancheRepository repository) {
        this.repository = repository;
    }

    public void executar(String nome, double preco, boolean disponivel) {
        Lanche lanche = new Lanche(nome, preco, disponivel);
        repository.salvar(lanche);
    }
}

