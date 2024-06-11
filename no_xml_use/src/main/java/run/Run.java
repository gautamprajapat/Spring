package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Config;
import pojo_classes.Person;

public class Run {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Person p=(Person)context.getBean("person");
		p.display();
	}

}
