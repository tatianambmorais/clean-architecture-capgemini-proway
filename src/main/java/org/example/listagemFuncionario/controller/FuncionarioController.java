package org.example.listagemFuncionario.controller;


import org.example.listagemFuncionario.domain.model.FuncionarioResponseDTO;
import org.example.listagemFuncionario.domain.mapper.FuncionarioMapper;
import org.example.listagemFuncionario.useCases.ListarFuncionarioUseCase;

import java.util.List;
import java.util.stream.Collectors;

public class FuncionarioController {
    private final ListarFuncionarioUseCase listarFuncionarioUseCase;

    public FuncionarioController(ListarFuncionarioUseCase listarFuncionarioUseCase){
        this.listarFuncionarioUseCase = listarFuncionarioUseCase;
    }

    public List<FuncionarioResponseDTO> listar(){
        return listarFuncionarioUseCase.executar().stream().map(FuncionarioMapper::fromEntity).collect(Collectors.toList());
    }
}
