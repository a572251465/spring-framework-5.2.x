package plus.chendd;

import plus.chendd.entity.Person;
import plus.chendd.entity.User;

public class Main01 {
	public static void main(String[] args) {
		for (String arg : args) {
			System.out.println(arg);
		}
		MyClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("ApplicationContext-${dev}.xml");
		User bean = context.getBean(User.class);
		
		Person bean1 = context.getBean(Person.class);
		System.out.println(bean1);
	}
}
