package week06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new GenericXmlApplicationContext("file:xml/week06/Ex2.xml");
		
		PointcutObj obj = (PointcutObj) context.getBean("pObj");
		String test = obj.businessLogic();
//		System.out.println(test);
	}

}
