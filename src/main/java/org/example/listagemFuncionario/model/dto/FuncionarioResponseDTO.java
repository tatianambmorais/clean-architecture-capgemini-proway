package org.example.listagemFuncionario.model.dto;

import java.math.BigDecimal;

public class FuncionarioResponseDTO {
    private String nome;
    private String cargo;
    private BigDecimal salario;

    public FuncionarioResponseDTO(String nome, String cargo, BigDecimal salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "FuncionarioResponseDTO{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
