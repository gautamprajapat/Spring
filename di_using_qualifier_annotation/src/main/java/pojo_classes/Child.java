package pojo_classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("child")
public class Child {
//	@Qualifier("iphone")
//	@Autowired
	Mobile mobile;
	
	public Mobile getMobile() {
		return mobile;
	}
	@Qualifier("iphone")
	@Autowired
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	public Child(@Qualifier("iphone")@Autowired Mobile mobile) {
	super();
	this.mobile = mobile;
}

	public void useMobile() {
		mobile.use();
	}

}
