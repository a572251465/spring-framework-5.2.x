package plus.chendd.test06;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonHandler {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("personHandler.xml");
		PersonHandler bean = context.getBean(PersonHandler.class);
		System.out.println(bean);
	}
}
