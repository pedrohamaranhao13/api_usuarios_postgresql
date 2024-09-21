package br.com.phamtecnologia.api_usuarios.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
public class CriarUsuarioRequestDto {

    @Size(min = 8, max = 150, message = "Nome deve ter conter 8 a 150 caracteres")
    @NotBlank(message = "Campo obrigatório, informe o nome do usuário.")
    private String nome;

    @Email(message = "Informe um e-mail válido")
    @NotBlank(message = "Campo obrigatório, informe o e-mail do usuário.")
    private String email;

    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "Por favor, informe uma senha com números, com letras maiúsculas e minúsculas, símbolos e no mínimo 8 caracteres")
    @NotBlank(message = "Campo obrigatório, informe a senha do usuário.")
    private String senha; 
}
