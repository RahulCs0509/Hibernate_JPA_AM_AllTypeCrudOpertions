package Hibernate_LifeCycle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestHLC {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rai");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Employee e = new Employee(); // Transient State
		e.setName("rk");
		e.setDesg("QA");
		e.setPno(9304224515l);
		em.persist(e); // Persistent State
		e.setName("Rahul Kumar");
		e.setDesg("SDE");
		et.begin();
		et.commit();
		
		em.detach(e); // Detached State
		e.setName("Ashutosh");
		e.setDesg("WORKPRESH");
		
		et.begin();
		et.commit();
	}

}
