package common;

public class Executor {
	private SmsSender smsSender;

	public SmsSender getSmsSender() {
		return smsSender;
	}

	public void setSmsSender(SmsSender smsSender) {
		this.smsSender = smsSender;
	}
	
	public void work() {
		System.out.println("work: " + smsSender);
	}
	
}
