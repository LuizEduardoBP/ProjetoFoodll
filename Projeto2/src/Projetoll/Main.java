package Projetoll;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("academico");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Cliente c = new Cliente(null, 0, null, null, null);
		c.setId(1l);
		c.setNome("Hugo");
		em.persist(c);
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
	
}