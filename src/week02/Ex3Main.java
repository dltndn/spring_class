package week02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import common.SmsSender;

public class Ex3Main {

	public static void main(String[] args) {
		// 자바 환경 설정 파일을 이용한 컨테이너 생성방법
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
//		
//		SmsSender g1 = ctx.getBean("smsSend", SmsSender.class);
//		SmsSender g2 = ctx.getBean("smsSend", SmsSender.class);
		
		
		// xml 설정 파일을 이용한 컨테이너 생성방법
		ApplicationContext ctx = new FileSystemXmlApplicationContext("xml/week02/Ex3.xml");
		
		InjectionEx g1 = (InjectionEx)ctx.getBean("injectionEx");
		g1.write();
	}

}
