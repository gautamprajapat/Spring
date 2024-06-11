package run;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo_classes.Amazon;

public class Run {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Amazon amazon=(Amazon)context.getBean("amazon");
		Map<String, Double> cart=amazon.getCart();
		System.out.println(cart);
		System.out.println(cart.entrySet());
		for(Map.Entry<String , Double>c:cart.entrySet())
		{
			System.out.println(c.getKey()+"  "+c.getValue());
		}
	}

}
