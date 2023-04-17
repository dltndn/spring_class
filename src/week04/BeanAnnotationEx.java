package week04;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import common.SmsSender;

@Configuration
@ImportResource("file:xml/week04/Ex8.xml")
public class BeanAnnotationEx {
	
//	@Bean
	@Bean(name="smsSend")
	public SmsSender send() {
		return new SmsSender();
	}
	
	@Bean(name="autoEx", autowire=Autowire.BY_TYPE)
	public CodeBaseEx autoEx() {
		return new CodeBaseEx();
	}
	
	@Bean(name="codeAutoEx", autowire=Autowire.BY_TYPE)
	public CodeBaseEx importResourceEx() {
		return new CodeBaseEx();
	}
}
