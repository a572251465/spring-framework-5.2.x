package plus.chendd.resolveName;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import plus.chendd.entity.User;

public class ResolvePackageNameApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application-${dev}.xml");
		User bean = classPathXmlApplicationContext.getBean(User.class);
		System.out.println(bean);
	}
}
