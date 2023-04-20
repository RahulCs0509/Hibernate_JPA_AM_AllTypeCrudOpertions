package cos_key.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import cos_key.dto.Person;
import cos_key.dto.PersonId;

public class SavePerson {
	public static void main(String[] args) {
		EntityManager em=Persistence.createEntityManagerFactory("rai").createEntityManager();
		EntityTransaction et=em.getTransaction();
		PersonId id=new PersonId();
		id.setPhone(9304224945l);
		id.setEmail("rk12@gmail.com");
		Person p=new Person();
		p.setName("parshant Kumar");
		p.setPassword("pk@123");
		p.setId(id);
		em.persist(p);
		et.begin();
		et.commit();
		
	}

}
