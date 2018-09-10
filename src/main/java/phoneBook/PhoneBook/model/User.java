package phoneBook.PhoneBook.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

	private int id;
	private String firstName;
	private String lastName;
	private String surname;
	private String number;
	private String address;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "PhoneBook [id="+id+", firstName=" + firstName + ", lastName=" + lastName + ", surname=" + surname + ", number="
				+ number + ", address=" + address + "]";
	}
	
	
}
