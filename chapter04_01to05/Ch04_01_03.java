package chapter04_01to05;
/*
 * # 주민등록번호 검사
 */

public class Ch04_01_03 {

	public static void main(String[] args) {
		String jumin = "890101-2012932";

		// 문제1) 나이출력
		String year = jumin.substring(0,2);
		int numyear = Integer.parseInt(year);
		int age = 2020-(1900+numyear);
		System.out.println("나이:"+age);
		
		// 문제2) 성별출력
		char key = jumin.charAt(7);
		if(key=='2'||key=='4') {
			System.out.println("성별:여성");
		}else {
			System.out.println("성별:남성");
		}

	}

}
