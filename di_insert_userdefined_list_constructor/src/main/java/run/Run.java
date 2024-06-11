package run;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import pojo_classes.Student;
import pojo_classes.Subject;

public class Run {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student)context.getBean("student");
		List<Subject>subjects=student.subjects;
		for(Subject s:subjects) {
			System.out.println(s.name);
		}
		
	}

}
