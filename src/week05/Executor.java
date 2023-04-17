package week05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import common.SmsSender;

@Component("exeObj")
@Scope("prototype")
public class Executor {
	@Autowired
	private SmsSender smsSender;

	public SmsSender getSmsSender() {
		return smsSender;
	}

	public void setSmsSender(SmsSender smsSender) {
		this.smsSender = smsSender;
	}
	
	public void work() {
		System.out.println("toString()" + "work: " + smsSender);
	}
	//Ex3 실습
	public void init() {
		System.out.println("init 메소드 동작");
	}
	public void destroy() {
		System.out.println("close 메소드 동작");
	}
 }
