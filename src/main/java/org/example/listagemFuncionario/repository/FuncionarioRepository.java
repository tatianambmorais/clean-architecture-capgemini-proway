package org.example.listagemFuncionario.repository;

import org.example.listagemFuncionario.domain.Funcionario;

import java.util.List;

public interface FuncionarioRepository {
    List<Funcionario> listarTodos();
}
