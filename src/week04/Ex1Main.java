package week04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new GenericXmlApplicationContext("file:xml/week04/Ex1.xml");
		RequiredEx m = (RequiredEx)context.getBean("requiredEx");
		System.out.println(m);
	}

}
