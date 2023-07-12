package plus.chendd.testAop;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import plus.chendd.testAop.controller.IUserController;
import plus.chendd.testAop.controller.UserController;

public class TestAop {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("testAop.xml");
		IUserController bean = context.getBean(UserController.class);
		System.out.println(bean);
		bean.save();
	}
}
