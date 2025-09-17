package infra;

import domain.Pedido;
import domain.PedidoRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPedidoRepository implements PedidoRepository {
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

