package plus.chendd.test07;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GinsengConstructorTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ginsengConstructor.xml");
		Person bean = context.getBean(Person.class);
		System.out.println(bean);
	}
}
