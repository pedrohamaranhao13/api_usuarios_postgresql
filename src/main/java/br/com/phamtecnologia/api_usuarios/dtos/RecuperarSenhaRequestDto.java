package br.com.phamtecnologia.api_usuarios.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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
public class RecuperarSenhaRequestDto {

    @Email(message = "Informe um e-mail válido.")
    @NotBlank(message = "Informe o e-mail do usuário.")
    private String email;
}
