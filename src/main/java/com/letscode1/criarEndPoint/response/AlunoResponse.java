package com.letscode1.criarEndPoint.response;

import com.letscode1.criarEndPoint.model.Aluno;
import com.letscode1.criarEndPoint.model.Materia;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter @Setter
@AllArgsConstructor
public class AlunoResponse {
    private UUID id;
    private String nome;
    private String senha;
    private String email;
    private List<Materia> materias;

    public AlunoResponse(Aluno aluno){
        this.id = aluno.getId();
        this.nome = aluno.getNome();
        this.senha = aluno.getSenha();
        this.email = aluno.getEmail();
        this.materias = aluno.getMaterias();
    }
}
