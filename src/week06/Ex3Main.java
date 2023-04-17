package week06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new GenericXmlApplicationContext("file:xml/week06/Ex7.xml");
		
		PointcutObj obj = (PointcutObj) context.getBean("pObj");
		try {
			obj.throwNeedLogic("WorkUnit");
		} catch (Exception e) {}
	}

}
