package org.example.cadastroDeAlunos.tests;

import org.example.cadastroDeAlunos.domain.Aluno;
import org.example.cadastroDeAlunos.repository.AlunoRepositoryEmMemoria;
import org.example.cadastroDeAlunos.useCases.CadastrarAlunoUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CadastroDeAlunosUseCaseTest {
    private AlunoRepositoryEmMemoria repository;
    private CadastrarAlunoUseCase useCase;

    @BeforeEach
    void setUp(){
        repository = new AlunoRepositoryEmMemoria();
        useCase = new CadastrarAlunoUseCase(repository);
    }
    @Test
    void deveCadastrarAluno(){
        Aluno aluno = useCase.executar("Tatiana", 123456, "Sistemas para internet");
        assertNotNull(aluno);
        assertEquals("Tatiana", aluno.getNome());
        assertEquals(123456, aluno.getMatricula());
        assertEquals("Sistemas para internet", aluno.getCurso());
    }
}



