package plus.chendd;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
	public MyClassPathXmlApplicationContext(String configLocation) {
		super(configLocation);
	}
	
	@Override
	protected void initPropertySources() {
		getEnvironment().setRequiredProperties("dev");
	}
}
