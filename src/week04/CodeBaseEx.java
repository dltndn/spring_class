package week04;

import common.SmsSender;

public class CodeBaseEx {
	
	private SmsSender smsSend;
	private SmsSender send;
	
	public void setSmsSend(SmsSender smsSend) {
		this.smsSend = smsSend;
	}
	
	public void setSend(SmsSender send) {
		this.send = send;
	}
	
	public void info() {
		System.out.println("smsSend: " + smsSend);
		System.out.println("send: " + send);
		System.out.println("this: " + this);
	}
}
