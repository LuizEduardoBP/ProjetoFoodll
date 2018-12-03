package Projetoll;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO<Cliente extends Identificavel> {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("projeto");
	
	public void save(Cliente e) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		em.close();
	}
	
	public void update(Cliente e) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();
		em.close();
	}
	
	public void remove(Cliente e) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		em.close();
	}
	
	public Cliente find(Class<Cliente> classe,Long id) {
		EntityManager em = factory.createEntityManager();
		Cliente e = em.find(classe, id);
		em.close();
		return e;
	}
	
}