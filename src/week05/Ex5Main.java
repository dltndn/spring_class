package week05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex5Main {
	static final String xmlPath = "file:xml/week05/Ex5.xml";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 소멸을 위하여 AbstractApplicationContext 타입의 컨테이너 생성
		AbstractApplicationContext context = new GenericXmlApplicationContext(xmlPath);
		InterfaceEx m = (InterfaceEx) context.getBean("interfaceEx");
		System.out.println("test");
		context.close();
		
	}

}
