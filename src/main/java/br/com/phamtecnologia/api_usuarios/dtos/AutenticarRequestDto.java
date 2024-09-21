package br.com.phamtecnologia.api_usuarios.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
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
public class AutenticarRequestDto {

    @Email(message = "Preencha um e-mail válido")
    @NotBlank(message = "E-mail obrigatório.")
    private String email;

    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "Por favor, informe uma senha com números, com letras maiúsculas e minúsculas, símbolos e no mínimo 8 caracteres")
    @NotBlank(message = "Senha obrigatório.")
    private String senha;

}
