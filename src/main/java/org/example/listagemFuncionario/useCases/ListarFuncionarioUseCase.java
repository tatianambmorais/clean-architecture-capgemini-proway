package org.example.listagemFuncionario.useCases;


import org.example.listagemFuncionario.domain.Funcionario;
import org.example.listagemFuncionario.repository.FuncionarioRepository;

import java.util.ArrayList;
import java.util.List;

public class ListarFuncionarioUseCase {
    private final FuncionarioRepository repository;
    List<Funcionario> funcionarioList = new ArrayList<>();

    public ListarFuncionarioUseCase(FuncionarioRepository funcionarioRepository){
        this.repository = funcionarioRepository;
    }

    public List<Funcionario> executar(){
       return repository.listarTodos();
    }
}
