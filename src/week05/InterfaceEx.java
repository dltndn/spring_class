package week05;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class InterfaceEx implements BeanNameAware, ApplicationContextAware, InitializingBean {
	private String beanName;
	private ApplicationContext context;
	
	

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet() 메서드 실헹");
		System.out.println("컨테이너: " + context.getId());
		System.out.println("smsSend: " + context.getBean("smsSend"));
		System.out.println("빈 이름: " + beanName.toString());
		System.out.println("===================================");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setApplicationContext() 메서드 실행");
		this.context = arg0;
	}

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		this.beanName = arg0;
		System.out.println("객체 이름: " + arg0);
	}
	
	public void init() {
		System.out.println("init 메소드 동작 test");
		System.out.println("=================================");
	}
	
	public void destroy() {
		System.out.println("close 메소드 동작 test");
		System.out.println("=================================");
	}
}
