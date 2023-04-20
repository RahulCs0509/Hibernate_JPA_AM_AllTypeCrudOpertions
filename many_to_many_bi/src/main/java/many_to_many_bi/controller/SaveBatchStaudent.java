package many_to_many_bi.controller;

import java.util.ArrayList;
import java.util.Arrays;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import many_to_many_bi.dto.Batch;
import many_to_many_bi.dto.Student;

public class SaveBatchStaudent {
	public static void main(String[] args) {
		Batch b = new Batch();
		b.setSubject("Hibernate");
		b.setCode("SEHM21");
		Batch b1 = new Batch();
		b1.setSubject("Spring");
		b1.setCode("SESM22");
		Batch b2 = new Batch();
		b2.setSubject("Spring Boot");
		b2.setCode("SJPM3");
		Student s = new Student();
		s.setName("Rahul Kumar");
		s.setPhone(9304224945l);
		s.setBatch(new ArrayList<Batch>(Arrays.asList(b, b1, b2)));
		Student s1 = new Student();
		s1.setName("Ashutosh Kumar");
		s1.setPhone(9304224945l);
		s1.setBatch(new ArrayList<Batch>(Arrays.asList(b, b1, b2)));
		Student s2 = new Student();
		s2.setName("Ravi Shankar");
		s2.setPhone(9304224945l);
		s2.setBatch(new ArrayList<Batch>(Arrays.asList(b, b1, b2)));
		b.setStudent(new ArrayList<Student>(Arrays.asList(s, s1, s2)));
		b1.setStudent(new ArrayList<Student>(Arrays.asList(s, s1, s2)));
		b2.setStudent(new ArrayList<Student>(Arrays.asList(s, s1, s2)));
		EntityManager em = Persistence.createEntityManagerFactory("rai").createEntityManager();
		EntityTransaction et = em.getTransaction();
		em.persist(b);
		em.persist(b1);
		em.persist(b2);
		et.begin();
		et.commit();
	}
}
