package domain;

import java.util.List;

public interface LancheRepository {
    void salvar(Lanche lanche);
    List<Lanche> listarDisponiveis();
    Lanche buscarPorNome(String nome);
}

