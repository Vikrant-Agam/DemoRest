package RestAPIprj.DemoRest.model;

import jakarta.persistence.Column; 
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student 
{
	@Id
	private String id;
	
	
	private String name;
	private String address;
	private String contact;
public Student() {
		
	}
	public Student(String id, String name, String address, String contact) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}
	
	

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
}
