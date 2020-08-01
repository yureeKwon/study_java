package chapter01_06to10;

/*
 * # 제어문 Control Statement
 * 1. 조건문 : if, switch-cast
 *  if(조건식){조건문이 참일 때 실행할 문장;} 
 * 2. 반복문 : for, while, do-while
 * 3. 보조제어문 : break, continue * 
 * 
 * 
 */
public class Ch01_06_01 {

	public static void main(String[] args) {

		if (true) {
			System.out.println("실행 O");
		}
		if (false) {
			System.out.println("실행 X");
		}

		// 예) 홀짝
		int num = 8;
		// System.out.println(num%2 == 0);
		// System.out.println(num%2 == 1);

		if (num % 2 == 0) {
			System.out.println(num + "은(는) 짝수");
		}
		if (num % 2 == 1) {
			System.out.println(num + "은(는) 홀수");
		}

		// 문제1) 양수, 0, 음수 출력 (num = -10)
		double dnum = -10;

		if (dnum > 0) {
			System.out.println("양수");
		}
		if (dnum == 0) {
			System.out.println("0");
		}
		if (dnum < 0) {
			System.out.println("음수");
		}

		// 문제2) 4의 배수 출력 (num = 12)
		int numb = 12;

		if (numb % 4 == 0) {
			System.out.println(numb + "은(는) 4의 배수이다");
		}
		if (numb % 4 != 0) {
			System.out.println(numb + "은(는) 4의 배수가 아니다");
		}

		// 문제3) 합격, 불합격 출력
		int score = 87;

		if (score >= 70) {
			System.out.println(score + "점으로 합격");
		}
		if (score < 70) {
			System.out.println(score + "점으로 불합격");
		}

	}

}
