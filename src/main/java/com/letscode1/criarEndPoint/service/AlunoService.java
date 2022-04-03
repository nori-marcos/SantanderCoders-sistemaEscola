package com.letscode1.criarEndPoint.service;

import com.letscode1.criarEndPoint.model.Aluno;
import com.letscode1.criarEndPoint.request.AlunoRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AlunoService {

  public Aluno matriculaAluno(AlunoRequest alunoRequest) {
    Aluno aluno =
        new Aluno(
            UUID.randomUUID(),
            alunoRequest.getNome(),
            alunoRequest.getSenha(),
            alunoRequest.getEmail(),
            alunoRequest.getMaterias()
            );

    return aluno;
  }
}
