package week04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import common.SmsSender;
import common.WorkUnit;

public class AutowiredEx {
	@Autowired
	private WorkUnit workUnit;
	private SmsSender smsSend;
	
	public AutowiredEx() {}

	@Autowired
	public AutowiredEx(WorkUnit workUnit) {
		this.workUnit = workUnit;
		System.out.println("AutowiredEx(): workunit,num= " + workUnit.getNum());
	}
	
	@Autowired
	public void generalMethod(WorkUnit[] workUnit ) {
		System.out.println("generalMethod() : 배열 길이 " + workUnit.length);
		for(int i=0; i<workUnit.length; i++) {
			System.out.println("workUnit[" + i + "]=" + workUnit[i].getNum());
		}
	}
	
	@Autowired(required=false)
	@Qualifier("main")
	public void setSmsSend(SmsSender smsSend) {
		this.smsSend = smsSend;
	}

	public void objInfo() {
		System.out.println("smsSender : " + smsSend);
		System.out.println("workUnit : " + workUnit);
		
	}
	
}
