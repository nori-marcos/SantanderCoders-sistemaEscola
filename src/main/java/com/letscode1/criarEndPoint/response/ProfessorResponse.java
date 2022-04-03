package com.letscode1.criarEndPoint.response;

import com.letscode1.criarEndPoint.model.Professor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@AllArgsConstructor
public class ProfessorResponse {
    private UUID id;
    private String nome;
    private String senha;
    private String email;

    public ProfessorResponse(Professor professor){
        this.id = professor.getId();
        this.nome = professor.getNome();
        this.senha = professor.getSenha();
        this.email = professor.getEmail();
    }
}
