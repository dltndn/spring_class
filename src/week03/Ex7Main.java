package week03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex7Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("file:" + "xml/week03/Ex7.xml");
		CollectionEx g1 = (CollectionEx)ctx.getBean("collectionEx");
		String[] keys= {"server", "connectionTimeout"};
		g1.propertiesWrite(keys);
	}

}
