package org.rk.OneToManyBi.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.rk.OneToManyBi.Dto.Employee;

public class FatchEmpByDeprtName {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dprt name to display emp details:");
		String name=sc.next();
		EntityManager em=Persistence.createEntityManagerFactory("rai").createEntityManager();
		Query q=em.createQuery("select e from Employee e where e.department.name=?1");
		q.setParameter(1, name);
		List<Employee> emps=q.getResultList();
		if(emps.size()>0) {
			for(Employee e: emps) {
				System.out.println(e);
			}
		}else {
			System.err.println("Inavlid Deparment Name");
		}
	}

}
