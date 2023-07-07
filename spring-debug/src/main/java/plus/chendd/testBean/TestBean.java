package plus.chendd.testBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import plus.chendd.testBean.entity.Person;

/**
 * @author Lenovo
 */
public class TestBean {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("testBean.xml");
		Person bean = context.getBean(Person.class);
		System.out.println(bean);
	}
}
