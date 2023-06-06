package plus.chendd.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class User implements BeanFactoryPostProcessor {
	private String name;
	private int age;
	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String user = beanFactory.getBeanDefinition("user").getBeanClassName();
		System.out.println(user);
		System.out.println("执行了beanFactoryPostProcessor");
	}
}
