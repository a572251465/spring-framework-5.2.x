package plus.chendd.resolve.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import plus.chendd.resolve.xml.config.CommonConfig;

public class ResolveXmlMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("resolveXml.xml");
		CommonConfig bean = classPathXmlApplicationContext.getBean(CommonConfig.class);
		System.out.println(bean);
	}
}
