package controller;

import Dao.EmployeeDao;
import Dto.Employee;

public class SaveEmployee {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Rahul Kumar");
		emp.setSalary(2000000);
		emp.setDesg("JAVA Software eng");
		emp.setPhone(9304224945l);
		emp.setPassword("Rahul@0509");
		
		EmployeeDao dao = new EmployeeDao();
		dao.saveEmployee(emp);
		
	}

}
