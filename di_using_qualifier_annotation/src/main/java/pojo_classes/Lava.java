package pojo_classes;

import org.springframework.stereotype.Component;

@Component("lava")
public class Lava implements Mobile {

	@Override
	public void use() {
		System.out.println("Using LavaMobile");
		
		
	}

}
