package plus.chendd.test04;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class TestApplicationListener implements ApplicationListener<TestUser> {
	@Override
	public void onApplicationEvent(TestUser event) {
		System.out.println("执行TestApplicationListener的onApplicationEvent方法");
	}
}
