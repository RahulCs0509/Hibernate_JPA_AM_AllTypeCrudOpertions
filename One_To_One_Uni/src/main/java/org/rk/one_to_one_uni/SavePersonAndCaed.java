package org.rk.one_to_one_uni;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonAndCaed {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("rai");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Person p=new Person();
		p.setName("ASHUTOSH RAJ");
		p.setAge(85);
		p.setPhone(8205641654l);
	
		Pancard pc=new Pancard();
		pc.setPannumber("rhfghsdg");
		pc.setDob(LocalDate.parse("1897-09-15"));
		pc.setPincode(845439);
		//assign Pancard for person
		p.setCard(pc);
		em.persist(p);
		et.begin();
		et.commit();
	}

}
