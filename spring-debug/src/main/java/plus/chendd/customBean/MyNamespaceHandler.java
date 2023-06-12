package plus.chendd.customBean;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("chendd", new PersonBeanDefinitionParser());
	}
}
