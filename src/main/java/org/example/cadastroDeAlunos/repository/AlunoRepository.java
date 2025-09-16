package org.example.cadastroDeAlunos.repository;


import org.example.cadastroDeAlunos.model.Aluno;

import java.util.List;

public interface AlunoRepository {
    void salvarAluno(Aluno aluno);
    List<Aluno> listarTodos();
}
