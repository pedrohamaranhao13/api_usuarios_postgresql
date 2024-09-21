package br.com.phamtecnologia.api_usuarios.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.phamtecnologia.api_usuarios.dtos.RecuperarSenhaRequestDto;
import br.com.phamtecnologia.api_usuarios.dtos.RecuperarSenhaResponseDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/recuperar-senha")
public class RecuperarSenhaController {

    @PostMapping
    public ResponseEntity<RecuperarSenhaResponseDto> post(@RequestBody @Valid RecuperarSenhaRequestDto dto) {
        return null;
    }

}
