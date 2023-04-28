package dominio;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
@Entity
@Table(name = "proprietario")
public class Proprietario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(length = 60, nullable = false)
	private String nome;
	@Column(length = 20, nullable = false)
	private String telefone;
	@Column(length = 255)
	private String email;
	
	// @OneToOne(mappedBy = "proprietario")
	// private Veiculo veiculo;
	
	@OneToMany(mappedBy = "proprietario")
	private List<Veiculo> veiculos;

}
