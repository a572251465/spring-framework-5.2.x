package plus.chendd.testAop.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Lenovo
 */
public class TestController {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("testAop.xml");
		UserController bean = context.getBean(UserController.class);
		System.out.println(bean);
	}
}
