package org.one_to_many_uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FatchHospital {
	public static void main(String[] args) {
		String qry = "select h from Hospital h ";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rai");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery(qry);
		List<Hospital>hos=q.getResultList();
		for(Hospital h:hos) {
			System.out.println("Hospital Id: "+h.getId());
			System.out.println("Hospital Name: "+h.getName());
			System.out.println("Hospital Gst: "+h.getGst());
			System.out.println("Hospital Founder: "+h.getFounder());
			System.out.println("**************************");
		}
		
		
		
		
	}
}
