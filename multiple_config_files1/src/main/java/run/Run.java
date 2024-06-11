package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo_classes.Database;
import pojo_classes.FrontEnd;
import pojo_classes.Security;

public class Run {
	public static void main(String[] args) {
		ApplicationContext  dbContext=new ClassPathXmlApplicationContext("db_config.xml");
		ApplicationContext  webContext=new ClassPathXmlApplicationContext("web_config.xml");
		ApplicationContext  securityContext=new ClassPathXmlApplicationContext("security_config.xml");
		
		Database db=(Database)dbContext.getBean("database");
		FrontEnd  web=(FrontEnd)webContext.getBean("frontEnd");
		Security security=(Security)securityContext.getBean("security");
		db.dataBase();
		web.frontEnd();
		security.security();
		
		
	}

}
