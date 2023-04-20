package OneToOneBidrectional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name="Person_Data")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "Person_Id")
	private int id;
//	@Column(name = "My_Name",nullable = false)
	private String name;
//	@Column(name="My_Phone_No",unique = true,nullable = false)
	private long phone_no;
//	@Column(name = "Person_age",nullable = false)
	private int age;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Pancard_Id")
	private Pancard card;
	public Pancard getCard() {
		return card;
	}
	public void setCard(Pancard card) {
		this.card = card;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
