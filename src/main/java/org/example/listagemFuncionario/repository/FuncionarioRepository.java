package org.example.listagemFuncionario.repository;

import org.example.listagemFuncionario.model.Funcionario;

import java.util.List;

public interface FuncionarioRepository {
    List<Funcionario> listarTodos();
}
