package repo1Review;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

// 빈 객체가 스프링 컨테이너를 직접 사용해야 할 경우 -> ApplicationContextAware
public class StdManager implements ApplicationContextAware, InitializingBean{
	private String stdCnt;
	private List<StdInfo> stdList = null;
	private ApplicationContext context = null;
	
	public StdManager(List<StdInfo> stdList) {
		super();
		this.stdList = stdList;
	}
	
	public StdManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Required
	public void setStdCnt(String stdCnt) {
		this.stdCnt = stdCnt;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		StdInfo info;
		int cnt = (int)Integer.parseInt(this.stdCnt);
		for(int i=0; i<cnt; i++) {
			info = (StdInfo)context.getBean("stdInfo");
			this.stdList.add(info);
		}
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		this.context = arg0;
	}
	
	public void printStdInfo() {
		Iterator it = stdList.iterator();
		StdInfo info;
		System.out.println("==========================");
		while(it.hasNext()) {
			info = (StdInfo)it.next();
			System.out.println("학생 이름 출력: " + info.getStdName());
			System.out.println("학생 학번 출력: " + info.getStdNum());
		}
	}
}
