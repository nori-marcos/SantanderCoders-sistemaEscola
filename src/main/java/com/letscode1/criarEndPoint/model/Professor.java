package com.letscode1.criarEndPoint.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class Professor {
    private UUID id;
    private String nome;
    private String senha;
    private String email;
}
