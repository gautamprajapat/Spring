package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pojo_classes.BackEnd;
import pojo_classes.Config;

public class Run {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		BackEnd backend=(BackEnd)context.getBean("backend");
		backend.useFrontEnd();
		
	}

}
