package pojo_classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="person")
public class Person {
	@Value("Vikas")
	String name;
	@Value("23")
	int age;
	
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}

}
