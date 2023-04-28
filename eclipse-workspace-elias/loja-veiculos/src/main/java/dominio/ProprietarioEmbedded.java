package dominio;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Embeddable
public class ProprietarioEmbedded {

	@Column(name = "nome_proprietario", nullable = false)
	private String nome;
	@Column(name = "telefone_proprietario", nullable = false)
	private String telefone;
	@Column(name = "email_proprietario")
	private String email;

}
