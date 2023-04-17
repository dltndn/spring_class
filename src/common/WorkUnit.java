package common;

public class WorkUnit {
	private int num;
	private SmsSender smsSend;
	
	public SmsSender getSmsSend() {
		return smsSend;
	}

	public void setSmsSend(SmsSender smsSend) {
		this.smsSend = smsSend;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
