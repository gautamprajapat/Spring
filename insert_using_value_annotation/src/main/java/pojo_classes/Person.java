package pojo_classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="per")
public class Person {
	int id;
	String name;
	String address;
	public int getId() {
		return id;
	}
	@Value("301")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("Shivani")
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	@Value("Delhi")
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
}
