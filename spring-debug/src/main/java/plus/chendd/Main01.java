package plus.chendd;

public class Main01 {
	public static void main(String[] args) {
		for (String arg : args) {
			System.out.println(arg);
		}
		MyClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("ApplicationContext-${dev}.xml");
		Object testFactoryBean = context.getBean("testFactoryBean");
		System.out.println(testFactoryBean);
	}
}
