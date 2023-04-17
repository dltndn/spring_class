package week04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import common.SmsSender;

public class Ex7Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new GenericXmlApplicationContext("file:xml/week04/Ex7/xml");
		CodeBaseEx m = (CodeBaseEx)context.getBean("autoEx");
		m.info();
	}

}
