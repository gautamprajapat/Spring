package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import pojo_classes.Student;

public class Run2 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student stu=(Student)context.getBean("stu");
		
		stu.diaplay();
	}
	}

