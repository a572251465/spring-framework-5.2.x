package plus.chendd.test01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:db.properties")
public class TestPropertySource {
	@Value("${jdbc_username}")
	private String name;
	
	@Override
	public String toString() {
		return "TestPropertySource{" +
				"name='" + name + '\'' +
				'}';
	}
}
