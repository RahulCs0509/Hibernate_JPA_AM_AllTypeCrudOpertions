package org.one_to_many_uni;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FatchBranchs {
	public static void main(String[] args) {
		String qry1="select b from Branchs b";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rai");
		EntityManager em = emf.createEntityManager();
		Query q1=em.createQuery(qry1);
		List<Branchs> bra=q1.getResultList();
		for(Branchs b:bra) {
			System.out.println("Branchs Id: "+b.getId());
			System.out.println("Branchs Name: "+b.getName());
			System.out.println("Branchs Phone Number: "+b.getPhone());
			System.out.println("Branchs Email Address: "+b.getEmail());
			System.out.println("********************************");
			
		}
	}

}
