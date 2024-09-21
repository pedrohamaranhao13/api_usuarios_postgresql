package br.com.phamtecnologia.api_usuarios.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.phamtecnologia.api_usuarios.dtos.CriarUsuarioRequestDto;
import br.com.phamtecnologia.api_usuarios.dtos.CriarUsuarioResponseDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/criar-usuario")
public class CriarUsuarioController {

    @PostMapping
    public ResponseEntity<CriarUsuarioResponseDto> post(@RequestBody @Valid CriarUsuarioRequestDto dto){
        return null;
    }
}
