package plus.chendd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import plus.chendd.entity.User;
import plus.chendd.utils.ApplicationContextUtils;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext-${dev}.xml");
		User bean = context.getBean(User.class);
		System.out.println(bean);
	}
}
