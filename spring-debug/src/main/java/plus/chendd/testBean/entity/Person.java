package plus.chendd.testBean.entity;

import org.springframework.stereotype.Component;

/**
 * @author Lenovo
 */
@Component
public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person() {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + '}';
	}
}
