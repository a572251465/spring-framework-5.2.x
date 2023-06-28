package plus.chendd.test09;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPopulate {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("populateBean.xml");
	}
}
