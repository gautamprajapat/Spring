package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Config;
import pojo_classes.Child;
import pojo_classes.Father;

public class Run {
	public static void main(String[] args) {
	  ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
	  Father father=(Father)context.getBean("father");
	  father.useMobile();
	  
	  Child child=(Child)context.getBean("child");
	  child.useMobile(); 
	}

}
