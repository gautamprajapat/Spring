package pojo_classes;

import org.springframework.stereotype.Component;

@Component(value="mobile")
public class Mobile {
	
	public void ring() {
		System.out.println("Mobile is ringing");
	}
	

}
