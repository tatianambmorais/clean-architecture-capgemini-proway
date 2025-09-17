package org.example.cadastroDeAlunos;

import org.example.cadastroDeAlunos.domain.Aluno;
import org.example.cadastroDeAlunos.repository.AlunoRepository;
import org.example.cadastroDeAlunos.repository.AlunoRepositoryEmMemoria;
import org.example.cadastroDeAlunos.useCases.CadastrarAlunoUseCase;

public class Main {
    public static void main(String[] args) {
        AlunoRepository repository = new AlunoRepositoryEmMemoria();

        CadastrarAlunoUseCase cadastrarAlunoUseCase = new CadastrarAlunoUseCase(repository);

        Aluno aluno1 = cadastrarAlunoUseCase.executar("João Silva", 12345, "Engenharia");
        Aluno aluno2 = cadastrarAlunoUseCase.executar("Maria Santos", 54321, "Medicina");

        System.out.println("Alunos cadastrados:");
        System.out.println("1. " + aluno1.getNome() +
                " - Matrícula: " + aluno1.getMatricula() +
                " - Curso: " + aluno1.getCurso());
        System.out.println("2. " + aluno2.getNome() +
                " - Matrícula: " + aluno2.getMatricula() +
                " - Curso: " + aluno2.getCurso());
    }
}
