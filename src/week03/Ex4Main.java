package week03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex4Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("file:" + "xml/week03/Ex6.xml");
		CollectionEx g1 = (CollectionEx)ctx.getBean("collectionEx");

	}

}
