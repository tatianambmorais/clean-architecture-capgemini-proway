package domain;

import java.util.List;

public interface PedidoRepository {
    void salvar(Pedido pedido);
    Pedido buscarPorId(int id);
    List<Pedido> listarTodos();
}

