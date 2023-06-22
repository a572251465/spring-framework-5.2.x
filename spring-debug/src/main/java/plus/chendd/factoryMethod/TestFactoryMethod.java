package plus.chendd.factoryMethod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryMethod {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("factoryMethod.xml");
		GenUser01 genUser01 = context.getBean("genUser01", GenUser01.class);
		System.out.println(genUser01);
		
		GenUser02 genUser02 = context.getBean("genUser02", GenUser02.class);
		System.out.println(genUser02);
	}
}
