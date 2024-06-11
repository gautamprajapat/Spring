package run;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import pojo_classes.FirstPojo;

public class Run {
	public static void main(String[] args) {
		Resource rc=new ClassPathResource("config.xml");
		BeanFactory bf=new XmlBeanFactory(rc);
		FirstPojo pojo=(FirstPojo) bf.getBean("first_pojo");
		
		pojo.messege();
		
	}

}
