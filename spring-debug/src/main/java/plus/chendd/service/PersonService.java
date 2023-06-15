package plus.chendd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plus.chendd.config.SetupConfig;

@Service
public class PersonService {
	
	@Autowired
	private SetupConfig setupConfig;
}
