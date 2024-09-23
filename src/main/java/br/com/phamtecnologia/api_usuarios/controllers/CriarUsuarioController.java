package br.com.phamtecnologia.api_usuarios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.phamtecnologia.api_usuarios.dtos.CriarUsuarioRequestDto;
import br.com.phamtecnologia.api_usuarios.dtos.CriarUsuarioResponseDto;
import br.com.phamtecnologia.api_usuarios.entities.Usuario;
import br.com.phamtecnologia.api_usuarios.repositories.UsuarioRepository;
import br.com.phamtecnologia.api_usuarios.services.MD5Service;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/criar-usuario")
public class CriarUsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private MD5Service md5Service;

    @PostMapping
    public ResponseEntity<CriarUsuarioResponseDto> post(@RequestBody @Valid CriarUsuarioRequestDto dto){
        
        CriarUsuarioResponseDto response = new CriarUsuarioResponseDto();
        
        try {
            
            if (usuarioRepository.findByEmail(dto.getEmail()).isPresent()) {
                response.setStatus(400);
                response.setMensagem("O e-mail informadfo já está cadastrado, tente outro.");
            } else {

                Usuario usuario = new Usuario();
                usuario.setNome(dto.getNome());
                usuario.setEmail(dto.getEmail());
                usuario.setSenha(md5Service.encrypt(dto.getSenha()));

                usuarioRepository.save(usuario);

                response.setStatus(201);
                response.setMensagem("Usuário cadastrado com sucesso.");
                response.setIdUsuario(usuario.getIdUsuario());
                response.setNome(usuario.getNome());
                response.setEmail(usuario.getEmail());
                
            }

        } catch (Exception e) {
            response.setStatus(500);
            response.setMensagem("Falha ao cadastrar usuário: " + e.getMessage());
        } 

        return ResponseEntity.status(response.getStatus()).body(response);
        
    }
}
