package plus.chendd;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import plus.chendd.customBean.HandBeanFactoryPostProcessor;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
	public MyClassPathXmlApplicationContext(String configLocation) {
		super(configLocation);
	}
	
	@Override
	protected void initPropertySources() {
		getEnvironment().setRequiredProperties("dev");
	}
	
	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
//		super.addBeanFactoryPostProcessor(new HandBeanFactoryPostProcessor());
		super.customizeBeanFactory(beanFactory);
	}
}
