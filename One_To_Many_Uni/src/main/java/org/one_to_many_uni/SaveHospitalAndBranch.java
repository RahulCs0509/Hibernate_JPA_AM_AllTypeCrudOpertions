package org.one_to_many_uni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveHospitalAndBranch {
	public static void main(String[] args) {
		Hospital h=new Hospital();
		h.setName("Apollo");
		h.setGst("Apollo12345");
		h.setFounder("rkr");
		Hospital h1=new Hospital();
		h1.setName("rkhospital");
		h1.setGst("rkhos45685");
		h1.setFounder("rebel");
		//First Hospital Branch
		Branchs c=new Branchs();
		c.setName("Apollo Bettiah");
		c.setEmail("apollobth@gmail.com");
		c.setPhone(78965423l);
		
		Branchs c1=new Branchs();
		c1.setName("Apollo Motihari");
		c1.setEmail("apollomot@gmail.com");
		c1.setPhone(456854568l);
		
		Branchs c2=new Branchs();
		c2.setName("Apollo Patna");
		c2.setEmail("apollopat@gmail.com");
		c2.setPhone(112255486l);
		
		
		
		//Second hospital branch 
		Branchs b=new Branchs();
		b.setName("rkhospital Bettiah");
		b.setEmail("rkhosbth@gmail.com");
		b.setPhone(45678912l);
		
		Branchs b1=new Branchs();
		b1.setName("rkhospital Bhopal");
		b1.setEmail("rkhosbpl@gmail.com");
		b1.setPhone(458792l);
	
		Branchs b2=new Branchs();
		b2.setName("rkhospital patna");
		b2.setEmail("rkhospat@gmail.com");
		b2.setPhone(4561236l);
		h.setBranch(new ArrayList<Branchs>(Arrays.asList(c,c1,c2)));
		h1.setBranch(new ArrayList<Branchs>(Arrays.asList(b,b1,b2)));
		EntityManager em=Persistence.createEntityManagerFactory("rai").createEntityManager();
		EntityTransaction et=em.getTransaction();
		em.persist(h);
		em.persist(h1);
		et.begin();
		et.commit();
	}

}
