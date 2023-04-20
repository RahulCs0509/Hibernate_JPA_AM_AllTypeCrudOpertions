package OneToOneBidrectional;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class SavePersonAndPancard {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("rai");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Person p=new Person();
		p.setName("Rahul Kumar");
		p.setAge(23);
		p.setPhone_no(7024401466l);
		Pancard pc=new Pancard();
		pc.setNumber("GZAPK8454D");
		pc.setDob(LocalDate.parse("1897-09-15"));
		pc.setPincode(845439);
		//assign Pancard for person
		p.setCard(pc);
		//Assign Person For PanCard
		pc.setP(p);
		em.persist(p);
		et.begin();
		et.commit();
	}

}
