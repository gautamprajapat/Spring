package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo_classes.Person;
import pojo_classes.Student;

public class Run1 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Person p=(Person)context.getBean("per");
		Student s=(Student)context.getBean(Student.class);
		System.out.println(p);
		System.out.println(s);
	}

}
