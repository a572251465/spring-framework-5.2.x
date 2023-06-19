package plus.chendd.test04;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("执行TestBeanPostProcessor的postProcessBeforeInitialization方法");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("执行TestBeanPostProcessor的postProcessAfterInitialization方法");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
