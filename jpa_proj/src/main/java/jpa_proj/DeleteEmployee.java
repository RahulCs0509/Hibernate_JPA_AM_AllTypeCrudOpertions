package jpa_proj;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Id To Deleted");
		int id =sc.nextInt();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("rai");
		EntityManager em=emf.createEntityManager();
		Employee e=em.find(Employee.class, id);
		if(e!=null)
		{
			em.remove(e);
			EntityTransaction t=em.getTransaction();
			t.begin();
			t.commit();
			System.out.println("Employee has been deleted");
		}
		else {
			System.err.println("You have entered an Invalid ID");
		}

	}

}
