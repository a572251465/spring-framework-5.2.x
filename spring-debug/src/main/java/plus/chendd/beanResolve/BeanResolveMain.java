package plus.chendd.beanResolve;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import plus.chendd.beanResolve.controller.TestController;

public class BeanResolveMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beanResolve.xml");
		TestController testController = classPathXmlApplicationContext.getBean("testController", TestController.class);
		testController.test();
	}
}
