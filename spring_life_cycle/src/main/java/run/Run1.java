package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo_classes.Person;
import pojo_classes.Student;

public class Run1 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Person p=(Person)context.getBean("person");
//		System.out.println(p);
		((ConfigurableApplicationContext)p).close();//spring container object is clossed
		System.out.println(p);
		Student s=(Student)context.getBean("student");
		
	}

}
