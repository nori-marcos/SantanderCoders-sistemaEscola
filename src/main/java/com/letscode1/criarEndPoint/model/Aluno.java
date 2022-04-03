package com.letscode1.criarEndPoint.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter @Setter
@AllArgsConstructor
public class Aluno {
    private UUID id;
    private String nome;
    private String senha;
    private String email;
    private List<Materia> materias;
}
