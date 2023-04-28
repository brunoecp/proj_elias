package dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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
@Table(name = "tab_veiculo")
public class Veiculo {
	
	//@EmbeddedId	
	//private VeiculoId codigo;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(length = 60, nullable = false)
	private String fabricante;
	
	@Column(length = 60, nullable = false)
	private String modelo;
	
	@Column(name = "ano_fabricacao", nullable = false)
	private Integer anoFabricacao;
	
	@Column(name = "ano_modelo", nullable = false)
	private Integer anoModelo;
	
	@Column(precision = 10, scale = 2, nullable = true)
	private BigDecimal valor;
	
	@Column(name = "tipo_combustivel", nullable = false)
	@Enumerated(EnumType.STRING) // EnumType.ORDINAL (insere n�mero ao inv�s da string)
	private TipoCombustivel tipoCombustivel;
	
	//@Temporal(TemporalType.DATE) // Precis�o de data, mas n�o est� funcionando nesta IDE Eclipse
	@Column(name = "data_cadastro", nullable = false)
	private LocalDate dataCadastro;
	
	/*
	@Lob
	private String especificacoes;
	
	@Lob
	private byte[] foto;
	*/
	
	//@Embedded
	//private ProprietarioEmbedded proprietario;
	
	///*
	// O relacionamento one-to-one aceita refer�ncias nulas, por padr�o. Podemos obrigar a atribui��o de propriet�rio durante a persist�ncia de Veiculo, incluindo o atributo optional com valor false na anota��o @OneToOne.
	@OneToOne //(optional = false)
	//@JoinColumn(name = "cod_proprietario")
	private Proprietario proprietario;
	//*/
	
	/*
	@ManyToOne
	@JoinColumn(name = "proprietario_codigo")
	private Proprietario proprietario;
	*/
	
	/*
	@ManyToMany
	// parte ii - @JoinTable
	@JoinTable(name = "veiculo_acessorio",
	joinColumns = @JoinColumn(name = "veiculo_codigo"),
	inverseJoinColumns = @JoinColumn(name = "acessorio_codigo"))
	*/
	// parte i
	//private Set<Acessorio> acessorios = new HashSet<>(); // Definimos aqui um conjunto para que um ve�culo n�o tenha um acess�rio repetido

	/*
	As propriedades de uma entidade s�o automaticamente mapeadas se n�o especificarmos nenhuma anota��o.
	Por diversas vezes, podemos precisar criar atributos que n�o representam uma coluna no banco de dados. Nestes casos, devemos anotar com @Transient.
	A propriedade ser� ignorada totalmente pelo mecanismo de persist�ncia.
	*/
	//@Transient
	//private String descricaoCompleta;
}
