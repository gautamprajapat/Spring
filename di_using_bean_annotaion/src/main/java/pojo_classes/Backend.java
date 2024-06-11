package pojo_classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("backend")
public class Backend {
	@Autowired 
	FrontEnd frontend;
	public void use() {
		frontend.buildFrontEnd();
	}
	

}
