package plus.chendd.testAutowire.service.impl;

import org.springframework.stereotype.Service;
import plus.chendd.testAutowire.service.TestService;

//@Service
public class TestServiceImpl01 implements TestService {
	@Override
	public void save() {
		System.out.println("执行了save~01方法");
	}
}
