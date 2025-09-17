package org.example.cadastroDeAlunos.repository;

import org.example.cadastroDeAlunos.domain.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepositoryEmMemoria implements AlunoRepository{
    private List<Aluno> alunos = new ArrayList<>();

    @Override
    public void salvarAluno(Aluno aluno){

        alunos.add(aluno);
        System.out.println("Aluno salvo + " + aluno);
    }

    @Override
    public List<Aluno> listarTodos(){
        return alunos;
    }
}
