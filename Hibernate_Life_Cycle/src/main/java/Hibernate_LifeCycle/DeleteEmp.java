package Hibernate_LifeCycle;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteEmp {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Ids whose are deleted ??");
		int ids=s.nextInt();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rai");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Employee e=em.find(Employee.class, ids);
		em.remove(e);
		et.begin();
		et.commit();
	}

}
