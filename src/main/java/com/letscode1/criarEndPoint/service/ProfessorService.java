package com.letscode1.criarEndPoint.service;

import com.letscode1.criarEndPoint.model.Professor;
import com.letscode1.criarEndPoint.request.ProfessorRequest;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProfessorService {
    public Professor cadastraProfessor(ProfessorRequest professorRequest){
        Professor professor =
                new Professor(
                        UUID.randomUUID(),
                        professorRequest.getNome(),
                        professorRequest.getSenha(),
                        professorRequest.getEmail()
                );

        return professor;
    }
}
