package plus.chendd.test09;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPopulate {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("populateBean.xml");
		Person person2 = context.getBean("person2", Person.class);
		System.out.println(person2);
	}
}
