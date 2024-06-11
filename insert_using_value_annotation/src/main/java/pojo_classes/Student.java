package pojo_classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="stu")
public class Student {
	
	int id;
	String name;
	int age;
	
	public Student(@Value("201")int id,@Value("Ravi")String name,@Value("22")int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public void diaplay() {
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
						
	}

}
