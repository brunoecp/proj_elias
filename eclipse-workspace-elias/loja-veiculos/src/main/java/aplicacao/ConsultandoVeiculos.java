package aplicacao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Proprietario;
import dominio.Veiculo;

public class ConsultandoVeiculos {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja-veiculos");
		EntityManager em = emf.createEntityManager();

		//em.getTransaction().begin(); // h� a necessidade de se fazer uma transa��o ao inserir algo no bd
		

		// Quando consultamos ve�culos, o provedor JPA executa uma consulta do propriet�rio para cada ve�culo encontrado:
		/*
		List<Veiculo> veiculos = em.createQuery("select v from Veiculo v", Veiculo.class).getResultList();
		for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo.getModelo() + " - " + veiculo.getProprietario().getNome());

		}
		*/
		
		// Se consultarmos um ve�culo pelo identificador, a query inclui um left join ou inner join com a tabela de propriet�rios, dependendo do que foi definido no atributo optional do mapeamento @OneToOne.
		//Veiculo veiculo = em.find(Veiculo.class, 2L);
		//System.out.println(veiculo.getModelo() + " - " + veiculo.getProprietario().getNome());
		
		// Agora podemos consultar um propriet�rio e obter o ve�culo dele.
		// Proprietario proprietario = em.find(Proprietario.class, 3L);
		// System.out.println(proprietario.getVeiculo().getModelo() + " - " + proprietario.getNome());
		
		
		//em.getTransaction().commit();

		System.out.println("pronto!");
		em.close(); // fechando...
		emf.close();

	}

}
