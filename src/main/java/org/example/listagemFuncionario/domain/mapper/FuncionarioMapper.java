package org.example.listagemFuncionario.domain.mapper;


import org.example.listagemFuncionario.domain.Funcionario;
import org.example.listagemFuncionario.domain.model.FuncionarioResponseDTO;

public class FuncionarioMapper {

    public static FuncionarioResponseDTO fromEntity(Funcionario funcionario) {
        return new FuncionarioResponseDTO(
                funcionario.getNome(),
                funcionario.getCargo(),
                funcionario.getSalario()
        );
    }

}
