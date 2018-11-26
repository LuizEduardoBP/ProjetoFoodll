package Projetoll;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("projeto");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Cliente c = new Cliente ("austronauta", 4);
		c.setNome("Pericles");
		em.persist(c);
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}