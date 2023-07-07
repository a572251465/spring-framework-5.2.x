package plus.chendd.testBean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import plus.chendd.testBean.entity.Man;
import plus.chendd.testBean.entity.User;

@Import(User.class)
@Configuration
public class TestConfig {
	
	@Bean
	public Man genMan() {
		return new Man("男");
	}
}
