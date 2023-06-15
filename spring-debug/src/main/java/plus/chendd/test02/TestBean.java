package plus.chendd.test02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestBean {
	
	@Bean
	public User getInfo() {
		return new User("chendd");
	}
}
