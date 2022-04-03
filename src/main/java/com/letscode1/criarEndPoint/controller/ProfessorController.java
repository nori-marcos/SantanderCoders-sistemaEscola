package com.letscode1.criarEndPoint.controller;

import com.letscode1.criarEndPoint.model.Professor;
import com.letscode1.criarEndPoint.request.ProfessorRequest;
import com.letscode1.criarEndPoint.response.AlunoResponse;
import com.letscode1.criarEndPoint.response.ProfessorResponse;
import com.letscode1.criarEndPoint.service.ProfessorService;
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
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    ProfessorService professorService;

    @PostMapping
    public ResponseEntity<ProfessorResponse> cadastraProfessor(
            @RequestBody @Valid ProfessorRequest professorRequest,
            UriComponentsBuilder uriComponentsBuilder
    ){
        Professor professor = professorService.cadastraProfessor(professorRequest);
        URI uri = uriComponentsBuilder.path("/professor/{id}").buildAndExpand(professor.getId()).toUri();
        return ResponseEntity.created(uri).body(new ProfessorResponse(professor));
    }

}
