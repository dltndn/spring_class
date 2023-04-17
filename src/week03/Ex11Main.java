package week03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import common.WorkUnit;

public class Ex11Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("file:" + "xml/week03/Ex11.xml");
		WorkUnit g1 = (WorkUnit)ctx.getBean("changeUnit");
		System.out.println(g1.getNum() + " : " + g1.getSmsSend());
	}

}
