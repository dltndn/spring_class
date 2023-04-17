package week03;

import common.SmsSender;

public class AutoDependency {
	private SmsSender smsSend;
	private CollectionEx collectionEx;
	
	public AutoDependency() {
		super();
	}
	
	// Ex8, Ex9
	public void setSmsSend(SmsSender smsSend) {
		this.smsSend = smsSend;
		System.out.println("setSmsSend() 실행: " + smsSend);
	}

	public void setCollectionEx(CollectionEx collectionEx) {
		this.collectionEx = collectionEx;
		System.out.println("setCollectionEx() 실행: " + collectionEx);
	}
	
	// Ex9
	public AutoDependency(SmsSender smsSend, CollectionEx collectionEx) {
		super();
		this.smsSend = smsSend;
		System.out.println("SmsSender 타입 객체: " + smsSend);
		System.out.println("CollectionEx 타입 객체: " + collectionEx);
	}
	
}
