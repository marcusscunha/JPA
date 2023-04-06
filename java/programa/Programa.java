package programa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null,"Andrade da Silva", "andrade2121@gmail.com");
		Pessoa p2 = new Pessoa(null, "Silvana Trindade Normana", "silvana9090@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dominio");
		EntityManager em = emf.createEntityManager();
	
	em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.getTransaction().commit();
		
		
		
		
		System.out.println("Done!");
		em.close();
		emf.close();
	}

}
