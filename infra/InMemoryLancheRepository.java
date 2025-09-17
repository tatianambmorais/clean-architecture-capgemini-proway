package infra;

import domain.Lanche;
import domain.LancheRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryLancheRepository implements LancheRepository {
    private final List<Lanche> lanches = new ArrayList<>();

    public void salvar(Lanche lanche) {
        lanches.add(lanche);
    }

    public List<Lanche> listarDisponiveis() {
        List<Lanche> disponiveis = new ArrayList<>();
        for (Lanche l : lanches) {
            if (l.isDisponivel()) disponiveis.add(l);
        }
        return disponiveis;
    }

    public Lanche buscarPorNome(String nome) {
        for (Lanche l : lanches) {
            if (l.getNome().equalsIgnoreCase(nome)) return l;
        }
        return null;
    }
}

