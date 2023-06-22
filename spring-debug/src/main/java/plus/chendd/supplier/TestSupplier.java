package plus.chendd.supplier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSupplier {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Supplier.xml");
//		User bean = context.getBean(User.class);
//		System.out.println(bean);
	}
}
