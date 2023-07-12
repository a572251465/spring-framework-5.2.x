package plus.chendd.testAutowire.service.impl;

import org.springframework.stereotype.Service;
import plus.chendd.testAutowire.service.TestService;

@Service(value = "testService")
public class TestServiceImpl implements TestService {
	@Override
	public void save() {
		System.out.println("执行了save方法");
	}
}
