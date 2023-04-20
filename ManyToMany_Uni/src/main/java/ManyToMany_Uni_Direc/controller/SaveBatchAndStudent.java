package ManyToMany_Uni_Direc.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ManyToMany_Uni_Direc.dto.Batch;
import ManyToMany_Uni_Direc.dto.Student;

public class SaveBatchAndStudent {
	public static void main(String[] args) {
		Batch b=new Batch();
		b.setSubject("Hibernate");
		b.setCode("SEHM21");
		
		Batch b1=new Batch();
		b1.setSubject("Spring");
		b1.setCode("SESM22");
		
		Batch b2=new Batch();
		b2.setSubject("Spring Boot");
		b2.setCode("SJPM3");
		
		Student s=new Student();
		s.setName("Rahul Kumar");
		s.setPhone(9304224945l);
		
		Student s1=new Student();
		s1.setName("Ashutosh Kumar");
		s1.setPhone(7024401455l);
		
		Student s2=new Student();
		s2.setName("Satya Kumar");
		s2.setPhone(8595641000l);
		//Assigning Students for Hibernates
		b.setStudent(new ArrayList<Student>(Arrays.asList(s,s1,s2)));
		//Assigning Students for Spring
		b1.setStudent(new ArrayList<Student>(Arrays.asList(s,s1,s2)));
		//Assigning Students for Spring Boot
		b2.setStudent(new ArrayList<Student>(Arrays.asList(s,s1,s2)));
		
		EntityManager em=Persistence.createEntityManagerFactory("rai").createEntityManager();
		EntityTransaction et=em.getTransaction();
		em.persist(b);
		em.persist(b1);
		em.persist(b2);
		et.begin();
		et.commit();
		
		
	}

}
