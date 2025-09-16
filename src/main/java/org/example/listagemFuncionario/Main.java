package org.example.listagemFuncionario;


import org.example.listagemFuncionario.controller.FuncionarioController;
import org.example.listagemFuncionario.model.dto.FuncionarioResponseDTO;
import org.example.listagemFuncionario.repository.FuncionarioRepository;
import org.example.listagemFuncionario.repository.FuncionarioRepositoryEmMemoria;
import org.example.listagemFuncionario.useCases.ListarFuncionarioUseCase;

import java.util.List;

public class Main {
    public static void main(String[] args){
        FuncionarioRepository funcionarioRepository = new FuncionarioRepositoryEmMemoria();
        ListarFuncionarioUseCase listarFuncionarioUseCase = new ListarFuncionarioUseCase(funcionarioRepository);
        FuncionarioController funcionarioController = new FuncionarioController(listarFuncionarioUseCase);

        List<FuncionarioResponseDTO> funcionarios = funcionarioController.listar();

        System.out.println(funcionarios.toString());
    }
}
