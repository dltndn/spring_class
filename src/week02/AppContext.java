package week02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import common.SmsSender;

@Configuration
public class AppContext {
	@Bean
	public SmsSender smsSend() {
		SmsSender g = new SmsSender();
		return g;
	}

}
