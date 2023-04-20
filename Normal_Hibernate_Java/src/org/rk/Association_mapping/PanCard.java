package org.rk.Association_mapping;

import java.time.LocalDate;

public class PanCard {
	private static int incr;
	private int id;
	{
		id=++incr;
	}
	private String number;
	private LocalDate dob;
	private int pincode;
	public static int getIncr() {
		return incr;
	}
	public static void setIncr(int incr) {
		PanCard.incr = incr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	

}
