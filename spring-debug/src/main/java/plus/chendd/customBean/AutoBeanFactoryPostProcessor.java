package plus.chendd.customBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class AutoBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String user = beanFactory.getBeanDefinition("user").getBeanClassName();
		System.out.println(user + " is in AutoBeanFactoryPostProcessor");
	}
}
