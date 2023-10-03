package circuitbreaker;

import java.lang.annotation.Annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@SpringBootApplication
public class SpringCircuitBreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCircuitBreakerApplication.class, args);
	}
	@Bean
	public CircuitBreaker circuitBreaker() {
		return new CircuitBreaker() {
			
			@Override
			public Class<? extends Annotation> annotationType() {
				return null;
			}  
			
			@Override
			public String name() {
				
				return "ruban";
			}
			
			@Override
			public String fallbackMethod() {
			
				return "ajairuban";
			}
		};
	}

}
