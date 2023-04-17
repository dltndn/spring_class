package week03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex8Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("file:" + "xml/week03/Ex10.xml");
		AutoDependency g1 = (AutoDependency)ctx.getBean("autoDependency", AutoDependency.class);
	}

}
