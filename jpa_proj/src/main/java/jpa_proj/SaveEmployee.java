package jpa_proj;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class SaveEmployee {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEname("ashutosh raj");
		e.setEmail("ashutosh2_technotask@meesho.com");
		e.setEdept("Freshdesk");
		e.setEdesg("QC");
		e.setSalary(30000);
		EntityManagerFactory f=Persistence.createEntityManagerFactory("rai");
		EntityManager m=f.createEntityManager();
		EntityTransaction t=m.getTransaction();
		m.persist(e);
		t.begin();
		t.commit();
	}
}
