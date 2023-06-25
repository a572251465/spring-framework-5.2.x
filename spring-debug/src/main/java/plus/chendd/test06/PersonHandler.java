package plus.chendd.test06;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PersonHandler {
	private String name;
	
	public PersonHandler() {
	
	}
	
	public PersonHandler(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("执行了 初期化方法");
	}
	
	@PreDestroy
	public void destroyMethod() {
	
	}
	
	@Override
	public String toString() {
		return "PersonHandler{" +
				"name='" + name + '\'' +
				'}';
	}
}
