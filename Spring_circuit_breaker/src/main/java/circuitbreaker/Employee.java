package circuitbreaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class Employee {
@Autowired
CircuitBreaker cb;
	public String getempName() {
	return "ajai";
	}
	
}
