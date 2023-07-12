package plus.chendd.testAutowire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import plus.chendd.testAutowire.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	public void save() {
		System.out.println("执行了controller save方法");
		testService.save();
	}
}
