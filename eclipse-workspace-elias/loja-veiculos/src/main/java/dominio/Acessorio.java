package dominio;

import lombok.*;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "acessorio")
public class Acessorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@Column(length = 60, nullable = false)
	private String descricao;

	//@ManyToMany(mappedBy = "acessorio")
	//private Set<Veiculo> veiculos = new HashSet<>();


}
