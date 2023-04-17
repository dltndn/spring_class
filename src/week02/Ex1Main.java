package week02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import common.SmsSender;

public class Ex1Main {

	public static void main(String[] args) {
		// 자바 환경 설정 파일을 이용한 컨테이너 생성방법
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
//		
//		SmsSender g1 = ctx.getBean("smsSend", SmsSender.class);
//		SmsSender g2 = ctx.getBean("smsSend", SmsSender.class);
		
		
		// xml 설정 파일을 이용한 컨테이너 생성방
		ApplicationContext ctx = new FileSystemXmlApplicationContext("xml/week02/Ex1.xml");
		SmsSender g1 = (SmsSender)ctx.getBean("smsSend");
		SmsSender g2 = (SmsSender)ctx.getBean("smsSend");
		
		//싱글톤 확인
	
		System.out.println(g1 == g2);

	}

}
