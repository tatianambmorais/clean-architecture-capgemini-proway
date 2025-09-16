package org.example.listagemFuncionario.model.mapper;


import org.example.listagemFuncionario.model.Funcionario;
import org.example.listagemFuncionario.model.dto.FuncionarioResponseDTO;

public class FuncionarioMapper {

    public static FuncionarioResponseDTO fromEntity(Funcionario funcionario) {
        return new FuncionarioResponseDTO(
                funcionario.getNome(),
                funcionario.getCargo(),
                funcionario.getSalario()
        );
    }

}
