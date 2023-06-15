package plus.chendd;


import plus.chendd.test01.TestPropertySource;

public class Main01 {
	public static void main(String[] args) {
		for (String arg : args) {
			System.out.println(arg);
		}
		MyClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("ApplicationContext-${dev}.xml");
		TestPropertySource bean = context.getBean(TestPropertySource.class);
		System.out.println(bean);
	}
}
