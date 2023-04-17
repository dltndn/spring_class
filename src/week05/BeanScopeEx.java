package week05;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

import common.Executor;
import common.WorkUnit;

@Configuration
@ImportResource("file:xml/week05/Ex2_test.xml")
public class BeanScopeEx {
// Ex1
	@Bean
	@Scope("prototype") // 빈 스코프 설정
	public WorkUnit unit() {
		return new WorkUnit();
	}
// Ex2
	@Bean(autowire=Autowire.BY_TYPE)
	public Executor work() {
		return new Executor();
	}
}
