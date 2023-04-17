package repo1Review;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Repo1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:repo1Review/Repo1.xml");
		StdManager m = (StdManager) ctx.getBean("stdManage");
		ctx.close();
	}

}
