package pojo_classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("father")
public class Father {
//	@Qualifier("lava")
//	@Autowired
	
	Mobile mobile;
	
	
	
	 public Mobile getMobile() {
		return mobile;
	}
	 @Qualifier("lava")
	 @Autowired
	public void setMobile(Mobile mobile) {
		 this.mobile = mobile;
	}
	public Father( @Qualifier("lava") @Autowired Mobile mobile) {
	super();
	this.mobile = mobile;
}
	public void useMobile() {
		 mobile.use();
	 }

}
