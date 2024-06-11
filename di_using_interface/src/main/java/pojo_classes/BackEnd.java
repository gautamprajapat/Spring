package pojo_classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("backend")
public class BackEnd {
	@Autowired
	FrontEnd front;
	
	public  void useFrontEnd() {
		front.buildFrontEnd();
	}
	

}
