package org.example.sistemaLanchonete.repository;

import org.example.sistemaLanchonete.domain.Lanche;
import org.example.sistemaLanchonete.repository.LancheRepository;

import java.util.ArrayList;
import java.util.List;

public class LancheRepositoryEmMemoria implements LancheRepository {
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

