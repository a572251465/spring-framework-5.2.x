package plus.chendd.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextUtils implements ApplicationContextAware {
	public static ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext args) throws BeansException {
		applicationContext = args;
	}
}
