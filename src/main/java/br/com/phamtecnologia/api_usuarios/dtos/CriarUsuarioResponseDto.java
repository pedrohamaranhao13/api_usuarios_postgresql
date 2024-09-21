package br.com.phamtecnologia.api_usuarios.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CriarUsuarioResponseDto {

    private Integer status;
    private String mensagem;
    private Integer idUsuario;
    private String nome;
    private String email;
}
