package org.rk.OneToManyBi.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.rk.OneToManyBi.Dto.Department;
import org.rk.OneToManyBi.Dto.Employee;

public class SaveDepartAndEmps {
	public static void main(String[] args) {
		Department d=new Department();
		d.setName("Development");
		d.setLoction("BTM Layout");
		
		Employee e=new Employee();
		e.setDepartment(d);
		e.setDesg("ASE");
		e.setName("Rahul Kumar");
		e.setSalary(125400);
		Employee e1=new Employee();
		e1.setDepartment(d);
		e1.setDesg("ASE");
		e1.setName("Ashutosh Kumar");
		e1.setSalary(124530);
		Employee e2=new Employee();
		e2.setDepartment(d);
		e2.setDesg("ASE");
		e2.setName("Satya Kumar");
		e2.setSalary(132546);
		
		d.setEmps(new ArrayList<Employee>(Arrays.asList(e,e1,e2)));
		EntityManager em=Persistence.createEntityManagerFactory("rai").createEntityManager();
		EntityTransaction et=em.getTransaction();
		em.persist(d);
		et.begin();
		et.commit();
	}

}
