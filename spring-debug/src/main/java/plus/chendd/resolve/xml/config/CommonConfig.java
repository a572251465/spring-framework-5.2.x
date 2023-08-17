package plus.chendd.resolve.xml.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import plus.chendd.resolve.xml.entity.Animation;

@Configuration
public class CommonConfig {
	
	@Bean
	public Animation getAnimation() {
		return new Animation();
	}
}
