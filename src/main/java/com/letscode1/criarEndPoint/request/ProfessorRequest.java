package com.letscode1.criarEndPoint.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@AllArgsConstructor
public class ProfessorRequest {
    private String nome;
    private String senha;
    private String email;
}
