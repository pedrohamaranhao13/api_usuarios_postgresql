package br.com.phamtecnologia.api_usuarios.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.phamtecnologia.api_usuarios.dtos.AutenticarRequestDto;
import br.com.phamtecnologia.api_usuarios.dtos.AutenticarResponseDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/autenticar")
public class AutenticarController {

    @PostMapping
    public ResponseEntity<AutenticarResponseDto> post(@RequestBody @Valid AutenticarRequestDto dto) {
        return null;       
    }

}
