package plus.chendd.test05;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class TestFactoryBean implements FactoryBean<User> {
	@Override
	public User getObject() throws Exception {
		return new User("chendd", 18);
	}
	
	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
