package jpa_proj;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class UpdateEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Id To Upadte");
		int id =sc.nextInt();
		System.out.println("Enter department,designation,mail,name and salary to update");
		String deprt=sc.next();
		String desg=sc.next();
		String mail=sc.next();
		String name=sc.next();
		double sal=sc.nextDouble();
		Employee e=new Employee();
		e.setId(id);
		e.setEdept(deprt);
		e.setEdesg(desg);
		e.setEmail(mail);
		e.setEname(name);
		e.setSalary(sal);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("rai");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		em.merge(e);
		et.begin();
		et.commit();
	}
}
