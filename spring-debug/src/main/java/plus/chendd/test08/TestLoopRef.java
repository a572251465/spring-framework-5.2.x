package plus.chendd.test08;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLoopRef {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("loopRef.xml");
		User bean = context.getBean(User.class);
		System.out.println(bean);
	}
}
