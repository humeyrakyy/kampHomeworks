package entities;


import java.time.LocalDate;

import abstracts.Entity;

public class Customer implements Entity{

	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private Long nationaliyId;

	public Customer(int id, String firstName, String lastName, int dateOfBirth, Long nationaliyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationaliyId = nationaliyId;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Long getNationaliyId() {
		return nationaliyId;
	}
	public void setNationaliyId(Long nationaliyId) {
		this.nationaliyId = nationaliyId;
	}
	
}
