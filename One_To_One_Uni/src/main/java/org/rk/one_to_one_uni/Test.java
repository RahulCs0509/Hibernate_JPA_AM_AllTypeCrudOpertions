package org.rk.one_to_one_uni;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("rai");
		System.out.println(factory);
	}

}
