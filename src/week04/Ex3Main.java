package week04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new GenericXmlApplicationContext("file:xml/week04/Ex3.xml");
		AutowiredEx m = (AutowiredEx)context.getBean("autowiredEx");
		m.objInfo();
	}

}
