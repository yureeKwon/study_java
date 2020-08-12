package chapter04_01to05;
/*
 * # 형변환(type conversion)
 * 1) 자료형(data type)을 바꾸는 것을 의미
 * 2) (변환할 자료형) 변수
 */

public class Ch04_01_02 {

	public static void main(String[] args) {

		// 문자 -> 숫자
		char ch = 'a';
		int aNum = (int) ch;
		System.out.println(aNum); // 97 아스키코드값으로 변환됨

		ch = (char) (aNum + 1);
		System.out.println(ch); // b

		// 문자열 -> 숫자
		String strNum = "10";
		int num = Integer.parseInt(strNum); // num = 10
		System.out.println(num + 1); // 11

		// 숫자 -> 문자열
		// 방법1) 꼼수
		strNum = num + ""; // 숫자10을 문자10으로 만들어줌
		System.out.println(strNum + 1); // 문자10에 1더하면 10+1=101
		// 방법2) 정석
		strNum = String.valueOf(num);
		System.out.println(strNum + 1);

	}
}
