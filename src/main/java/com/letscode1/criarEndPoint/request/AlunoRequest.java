package com.letscode1.criarEndPoint.request;

import com.letscode1.criarEndPoint.model.Materia;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
public class AlunoRequest {
  @NotNull
  @NotEmpty
  @Size(min = 2)
  private String nome;

  @NotNull
  @NotEmpty
  private String senha;

  @NotNull
  @NotEmpty
  @Email
  private String email;

  private List<Materia> materias;
}
