package org.example.sistemaLanchonete.repository;

import org.example.sistemaLanchonete.domain.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoRepositoryEmMemoria implements PedidoRepository {
    private final List<Pedido> pedidos = new ArrayList<>();

    public void salvar(Pedido pedido) {
        if (!pedidos.contains(pedido)) pedidos.add(pedido);
    }

    public Pedido buscarPorId(int id) {
        if (id < 0 || id >= pedidos.size()) return null;
        return pedidos.get(id);
    }

    public List<Pedido> listarTodos() {
        return new ArrayList<>(pedidos);
    }
}


