package org.rk.Association_mapping;

import java.time.LocalDate;

public class OneToOne {
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Rahul Kumar");
		p.setAge(25);
		p.setPhone(9304224945l);
		
		PanCard c=new PanCard();
		c.setDob(LocalDate.parse("1997-09-05"));
		c.setNumber("014582");
		c.setPincode(845438);
		p.setCard(c);//Assigning pancard for person.
		System.out.println("Person Details!!!!");
		System.out.println("ID:- "+p.getId());
		System.out.println("Name:- "+p.getPhone());
		System.out.println("Age:- "+p.getAge());
		System.out.println("Phone:- "+p.getPhone());
		System.out.println("Pancard Numbaer:- "+p.getCard().getNumber());
		System.out.println("Pancard ID:- "+p.getCard().getId());
		System.out.println("DOB:- "+p.getCard().getDob());
		System.out.println("Person Pincod:- "+p.getCard().getPincode());
	}
}
