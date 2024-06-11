package run;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo_classes.Amazon;
import pojo_classes.Item;

public class Run {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Amazon amazon=(Amazon)context.getBean("amazon");
		Map<Integer, Item>cart=amazon.getCart();
		for(Map.Entry<Integer, Item> c:cart.entrySet())
		{
			System.out.println(c.getKey()+"  "+c.getValue().getName()+"  "+c.getValue().getPrice());
		}
		
		
	}

}
