package org.example.cadastroDeAlunos.useCases;


import org.example.cadastroDeAlunos.model.Aluno;
import org.example.cadastroDeAlunos.repository.AlunoRepository;

public class CadastrarAlunoUseCase {
    private final AlunoRepository repository;

    public CadastrarAlunoUseCase(AlunoRepository repository){
        this.repository = repository;
    }

    public Aluno executar(String nome, int matricula, String curso){
        Aluno aluno = new Aluno(nome, matricula, curso);
        repository.salvarAluno(aluno);
        return aluno;
    }

}
