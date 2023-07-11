package plus.chendd.field_cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCycle {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("testFieldCycle.xml");
		A bean = context.getBean(A.class);
		System.out.println(bean);
	}
}
