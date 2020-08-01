package chapter01_01to05;

public class Ch01_04_02 {

	public static void main(String[] args) {
		// 예) 점수가 60점 이상이면 true 출력

		int score = 30;
		System.out.println(score >= 60);

		// 문제1) 3의 배수이면 true 출력
		int 배수 = 3;
		System.out.println(score % 배수 == 0);

		// 문제2) 짝수이면 true 출력
		System.out.println(score % 2 == 0);

		// 문제3) 아래 금액 중 1000원 짜리 이상의 화폐를 제외한 1000원짜리가 3장 이상이면 true
		int tot = 178600;
		int a = tot % 5000;
		int b = a / 1000;
		System.out.println(b >= 3);

	}

}
