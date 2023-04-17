package week05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import common.SmsSender;
import common.WorkUnit;

public class Ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanScopeEx.class);
		
		System.out.println((WorkUnit) context.getBean("unit"));
		System.out.println((WorkUnit) context.getBean("unit"));
		System.out.println((SmsSender) context.getBean("smsSend"));
		System.out.println((SmsSender) context.getBean("smsSend"));
	}

}
