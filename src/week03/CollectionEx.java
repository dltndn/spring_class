package week03;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import common.SmsSender;

public class CollectionEx {
	private List<SmsSender> objList; // Ex4
	private List<Double> deviations; // Ex5
	private Map <String, SmsSender> hand; // Ex7
	private Properties config; // Ex7
	
	// Ex4 : List의 객체 타입을 생성자로 주입
	public CollectionEx(List objList) {
		System.out.println("생성자로 List 주입" + objList);
		this.objList = objList;
		for(int i=0; i < this.objList.size(); i++) 
			System.out.println("[" + i + "]객체 : " + this.objList.get(i));
	}
	
	// Ex5 : List의 래퍼타입을 setter로 주입
	public CollectionEx() { }
	public void setDeviations(List deviations) {
		this.deviations = deviations;
		for(int i=0; i<deviations.size(); i++)
			System.out.println("[" + i + "]번 : " + deviations.get(i));
	}
	
	// Ex6 : Map 객체 주입 
	public void setHand(Map hand) {
		this.hand = hand;
		SmsSender smsSend;
		String keyStr;
		Set key = this.hand.keySet();
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			keyStr = it.next();
			smsSend = (SmsSender)hand.get(keyStr);
			System.out.println(keyStr + " : " + smsSend);
		}
	}
	
	// Ex7 : Propertie 타입 주입 
	// 환경 변수 세팅으로 자주 사용
	public void setConfig(Properties config) {
		this.config = config;
	}
	public <E> void propertiesWrite(String[] key) {
		for(String s : key) 
			System.out.println(s + " : " + config.getProperty(s));
	}
}
