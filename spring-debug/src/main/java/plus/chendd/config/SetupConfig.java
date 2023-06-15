package plus.chendd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import plus.chendd.entity.Person;

@Configuration
public class SetupConfig {
	private String name = "test";
	
	@Bean
	public Person settingPerson() {
		return new Person("lihh", "20");
	}
	
	@Bean
	public void getPerson(Person person) {
		System.out.println(person);
	}
}
