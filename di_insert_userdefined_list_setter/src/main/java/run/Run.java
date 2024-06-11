package run;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo_classes.College;
import pojo_classes.Student;

public class Run {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student)context.getBean("student");
		List<College>colleges=student.getCollege();
		for(College c:colleges)
		{
			System.out.println(c.getName());
		}
		
	}

}
