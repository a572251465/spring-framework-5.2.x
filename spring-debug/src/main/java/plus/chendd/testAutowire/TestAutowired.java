package plus.chendd.testAutowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import plus.chendd.testAutowire.controller.TestController;

public class TestAutowired {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("testAutowired.xml");
		TestController bean = context.getBean(TestController.class);
		bean.save();
	}
}
