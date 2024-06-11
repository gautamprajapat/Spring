package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo_classes.Principal;
import pojo_classes.Student;
import pojo_classes.Teacher;

public class Run {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student) context.getBean("student");
		Teacher teacher=(Teacher)context.getBean("teacher");
		Principal principal=(Principal)context.getBean("principal");
		student.study();
		teacher.teaching();
		principal.managing();
		
	}

}
