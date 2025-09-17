package org.example.listagemFuncionario.domain;

import java.math.BigDecimal;

public class Funcionario {
    private String nome;
    private String cargo;
    private BigDecimal salario;

    public Funcionario (String nome, String cargo, BigDecimal salario){
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
}
