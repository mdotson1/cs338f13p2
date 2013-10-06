package com.cs388f13p2.model.person;


public class Person {

	private ContactInformation contactInformation;
	private String dateOfBirth;
	
	public Person(ContactInformation ci, String dob) {
		
		contactInformation = ci;
		dateOfBirth = dob;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String dob) {
		dateOfBirth = dob;
	}
	
	public ContactInformation getContactInformation() {
		return contactInformation;
	}
	
	public void setContactInformation(ContactInformation ci) {
		contactInformation = ci;
	}
}
