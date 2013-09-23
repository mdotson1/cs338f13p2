package model.person;

import model.time.Date;

public class Professor extends Person {

	private String department;
	
	public Professor(Address homeAddr, Address workAddr,
			PhoneNumbers phoneNums, String fName, String lName,
			int social, Date dob, String dept) {
		super(homeAddr, workAddr, phoneNums, fName, lName,
				social, dob);
		department = dept;
	}
	
	public int getSsn() {
		return ssn;
	}
}