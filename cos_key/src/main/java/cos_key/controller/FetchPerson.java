package cos_key.controller;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import cos_key.dto.Person;
import cos_key.dto.PersonId;
public class FetchPerson {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you mail and phone number !!");
		String  email=sc.next();
		long pno=sc.nextLong();
		PersonId id =new PersonId();
		id.setEmail(email);
		id.setPhone(pno);
		EntityManager em =Persistence.createEntityManagerFactory("rai").createEntityManager();
		Person p=em.find(Person.class, id);
		if(p!= null) {
			System.out.println("Name: "+ p.getName()+" !! ");
			System.out.println("Email: "+ p.getId().getEmail()+" !! ");
			System.out.println("Phone Number: "+ p.getId().getPhone()+" !! ");
		}
		else {
			System.err.println("Invalide Phone Number Or Email!!");
		}
	}
}
