package med.voll.api.paciente;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.Endereco;

public record DadosCadastroPaciente(
		@NotBlank
		String nome,
		
		@NotBlank
		@Email
		String email,
		
		@NotBlank
		@CPF(message = "CPF invalido")
		String cpf,
		
		@NotBlank
		String telefone,
		
		@NotNull
		@Valid
		Endereco endereco) {

}
