package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo_classes.Person;



public class Run2 {
	public static void main(String[] args) {
		
			ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
			Person p=(Person)context.getBean("person");
			p.house();
		}
	}

