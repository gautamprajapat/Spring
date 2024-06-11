package pojo_classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value(value="101")
	int id;
	@Value("Shubham")
	String name;
	@Value("30000")
	double salary;
	@Value("9876565656")
	long phone;
	
	public void display() {
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Salary :"+salary);
		System.out.println("Phone :"+phone);
	}

}
