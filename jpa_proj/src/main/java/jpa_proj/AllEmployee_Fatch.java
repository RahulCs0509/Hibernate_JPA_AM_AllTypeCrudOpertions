package jpa_proj;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AllEmployee_Fatch {
	public static void main(String[] args) {
		String qry = "select e from Employee e ";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rai");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery(qry);
		List<Employee> emps = q.getResultList();
		for (Employee e : emps) {
			System.out.println("ID: "+e.getId());
			System.out.println("Name: "+e.getEname());
			System.out.println("Mail "+e.getEmail());
			System.out.println("Department "+e.getEdept());
			System.out.println("Designation "+e.getEdesg());
			System.out.println("Salary "+e.getSalary());
			System.out.println("**********************");
		}
	}

}
