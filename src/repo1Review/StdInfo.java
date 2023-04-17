package repo1Review;

import java.util.Scanner;

public class StdInfo {
	private String stdName;
	private String stdNum;
	Scanner in = new Scanner(System.in);
	
	public String getStdName() {
		return stdName;
	}
	public String getStdNum() {
		return stdNum;
	}
	
	public void inputInfo() {
		System.out.println("학생 이름 입력: ");
		stdName = in.nextLine();
		System.out.println("학생 학번 입력: ");
		stdNum = in.nextLine();
	}
}
