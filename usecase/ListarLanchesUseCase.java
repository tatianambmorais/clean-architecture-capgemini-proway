package usecase;

import domain.Lanche;
import domain.LancheRepository;
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

