package week05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex4Main {
	static final String xmlPath = "file:xml/week05/Ex4.xml";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체 소멸을 위하여 AbstractApplicationContext 타입의 컨테이너 생성
		AbstractApplicationContext context = new GenericXmlApplicationContext(xmlPath);
		Executor m1 = (Executor) context.getBean("exeObj");
		m1.work();
		Executor m2 = (Executor) context.getBean("exeObj");
		m2.work();
		context.close();
	}

}
