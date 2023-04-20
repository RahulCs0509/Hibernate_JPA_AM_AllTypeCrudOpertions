package jpa_proj;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FatchEmployeeByDept {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Dept to print the detials");
		String edept = sc.nextLine();
		String qry = "select e from Employee e where e.edept=?1";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rai");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery(qry);
		q.setParameter(1, edept);
		List<Employee> emps = q.getResultList();

		if (emps.size() > 0) {
			for (Employee e : emps) {
				System.out.println("ID: " + e.getId());
				System.out.println("Name: " + e.getEname());
				System.out.println("Mail " + e.getEmail());
				System.out.println("Department " + e.getEdept());
				System.out.println("Designation " + e.getEdesg());
				System.out.println("Salary " + e.getSalary());
				System.out.println("**********************");
			}
		} else {
			System.out.println("No Employee Found With the Dprt: " + edept);
		}
	}


}
