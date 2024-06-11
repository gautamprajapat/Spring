package pojo_classes;

import org.springframework.stereotype.Component;

@Component("angular")
public class Angular implements FrontEnd {

	@Override
	public void buildFrontEnd() {
		System.out.println("Thr frontend is build using angular technology");
		
	}
	
	

}
