package com.letscode1.criarEndPoint.controller;

import com.letscode1.criarEndPoint.model.Aluno;
import com.letscode1.criarEndPoint.request.AlunoRequest;
import com.letscode1.criarEndPoint.response.AlunoResponse;
import com.letscode1.criarEndPoint.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping
    public ResponseEntity<AlunoResponse>matriculaAluno (
            @RequestBody @Valid AlunoRequest alunoRequest,
            UriComponentsBuilder uriComponentsBuilder
    ){
        Aluno aluno = alunoService.matriculaAluno(alunoRequest);
        URI uri = uriComponentsBuilder.path("/aluno/{id}").buildAndExpand(aluno.getId()).toUri();
        return ResponseEntity.created(uri).body(new AlunoResponse(aluno));
    }

}
