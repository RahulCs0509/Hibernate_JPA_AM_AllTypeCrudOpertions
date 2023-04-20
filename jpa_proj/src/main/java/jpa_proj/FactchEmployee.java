package jpa_proj;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class FactchEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Id To Find");
		int id =sc.nextInt();
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("rai");
		EntityManager em=emf.createEntityManager();
		Employee e=em.find(Employee.class, id);
		if(e!=null) {
			System.out.println("ID: "+e.getId());
			System.out.println("Name: "+e.getEname());
			System.out.println("Mail "+e.getEmail());
			System.out.println("Department "+e.getEdept());
			System.out.println("Designation "+e.getEdesg());
			System.out.println("Salary "+e.getSalary());
			System.out.println("Mail "+e.getEmail());
		}
		else {
			System.err.println("You have entered an invalid");
		}
	}

}
