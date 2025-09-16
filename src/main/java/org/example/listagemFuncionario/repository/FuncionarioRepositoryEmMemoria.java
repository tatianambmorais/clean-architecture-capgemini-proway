package org.example.listagemFuncionario.repository;


import org.example.listagemFuncionario.model.Funcionario;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepositoryEmMemoria implements FuncionarioRepository{


    private final List<Funcionario> funcionarios = new ArrayList<>();

    public FuncionarioRepositoryEmMemoria() {
        funcionarios.add(new Funcionario("Tatiana", "Consultora", new BigDecimal("8500")));
        funcionarios.add(new Funcionario("Carlos", "Analista", new BigDecimal("6500")));
    }

    @Override
    public List<Funcionario> listarTodos() {
        return funcionarios;
    }

}
