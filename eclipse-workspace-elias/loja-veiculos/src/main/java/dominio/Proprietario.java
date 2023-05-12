package dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

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
//	@Column(length = 20, nullable = false)
//	private String telefone;
	@ElementCollection
	@CollectionTable(name = "proprietario_telefone",  joinColumns = @JoinColumn(name = "proprietario_codigo"))
	@Column(name = "telefone_numero", length = 20, nullable = false)
	private List<String> telefones = new ArrayList<>();

	@Column(length = 255)
	private String email;

	// @OneToOne(mappedBy = "proprietario")
	// private Veiculo veiculo;

//	@OneToMany(mappedBy = "proprietario")
//	private List<Veiculo> veiculos;

}
