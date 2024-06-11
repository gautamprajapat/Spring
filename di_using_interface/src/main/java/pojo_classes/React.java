package pojo_classes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("react")
public class React implements FrontEnd {

	@Override
	public void buildFrontEnd() {
		System.out.println("Front end is build using React Technology");
		
	}
	

}
