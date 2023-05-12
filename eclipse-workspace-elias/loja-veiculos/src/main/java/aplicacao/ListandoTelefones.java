package aplicacao;

import dominio.Proprietario;
import dominio.Telefone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListandoTelefones {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja-veiculos");
		EntityManager em = emf.createEntityManager();

		// em.getTransaction().begin(); // h� a necessidade de se fazer uma transa��o ao inserir algo no bd

//		Proprietario proprietario = em.find(Proprietario.class, 2l);
//
//		System.out.println("Proprietario: " + proprietario.getNome());
//
//		for(String telefone : proprietario.getTelefones()){
//			System.out.println("Telefone: "  + telefone);
//		}
//
//		// em.getTransaction().commit();
//
//		System.out.println("pronto!");
//		em.close(); // fechando...
//		emf.close();

		Proprietario proprietario = em.find(Proprietario.class, 1l);

		System.out.println("Proprietario: " + proprietario.getNome());

		for(Telefone telefone : proprietario.getTelefones()){
			System.out.println("Telefone: "  + telefone);
		}

		// em.getTransaction().commit();

		System.out.println("pronto!");
		em.close(); // fechando...
		emf.close();


	}
}
