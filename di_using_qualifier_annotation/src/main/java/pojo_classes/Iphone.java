package pojo_classes;

import org.springframework.stereotype.Component;

@Component("iphone")
public class Iphone implements Mobile{

	@Override
	public void use() {
		System.out.println("using Iphone mobile");
		
	}
	

}
