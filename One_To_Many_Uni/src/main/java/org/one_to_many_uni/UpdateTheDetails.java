package org.one_to_many_uni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateTheDetails {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Id To Upadte");
		int id =sc.nextInt();
		System.out.println("Enter Hospital_Name,Gst_Number Founder_Name");
		String name=sc.next();
		String gst=sc.next();
		String founder=sc.next();
		Hospital h=new Hospital();
		h.setName(name);
		h.setGst(gst);
		h.setFounder(founder);
		
		EntityManager em=Persistence.createEntityManagerFactory("rai").createEntityManager();
		EntityTransaction et=em.getTransaction();
		em.merge(h);
		et.begin();
		et.commit();
		
		
	}

}
