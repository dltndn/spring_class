package week02;

import common.SmsSender;

public class InjectionEx {
	private SmsSender smsSend;
	private String value;

	public InjectionEx(SmsSender _smsSend, String _value) {
		this.smsSend = _smsSend;
		this.value = _value;
	}
	
	public void write() {

		System.out.println("저장 프로퍼티 : " + smsSend + ", " + value);
		smsSend.write();
	}

	public InjectionEx() {
		super();
		System.out.println("생성자 생성 ");
	}

	public void setSmsSend(SmsSender smsSend) {
		this.smsSend = smsSend;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
