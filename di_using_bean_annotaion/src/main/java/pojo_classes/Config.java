package pojo_classes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@ComponentScan(basePackages = "pojo_classes")
public class Config {
	@Bean("react")
	@Primary
	public React getReact() {
		return new React();
	}
	
	@Bean("angular")
	public Angular getAngular() {
		return new Angular();
	}

}
