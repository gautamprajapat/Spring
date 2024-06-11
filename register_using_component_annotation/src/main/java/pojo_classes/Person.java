package pojo_classes;

import org.springframework.stereotype.Component;

@Component(value="per")
public class Person {
	public Person() {
		System.out.println("Person class Constructor");
	}

}
