package chapter01_01to05;

public class Ch01_03_02 {

	public static void main(String[] args) {
		// 현금이 1000원 있다. 200원짜리 과자 구입 후, 잔돈 출력

		int 현금 = 1000;
		int 과자 = 200;
		int 잔돈 = 현금 - 과자;
		System.out.println("잔돈 = " + 잔돈 + "원");

		// 문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		int 월급 = 100;
		int 세전연봉 = 월급 * 12;
		int 세금 = 세전연봉 / 10;
		int 세후연봉 = 세전연봉 - 세금;
		System.out.println("세후연봉 = " + 세후연봉 + "원");

		// 문제2) 시험점수를 30, 50, 4점 받았다. 평균은?
		int 점수1 = 30;
		int 점수2 = 50;
		int 점수3 = 4;
		int 총합 = 점수1 + 점수2 + 점수3;
		double 과목수 = 3;
		double 평균 = 총합 / 과목수;
		System.out.println("평균 = " + 평균 + "점");

		// 문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		int 가로 = 3;
		int 세로 = 6;
		System.out.println("삼각형 넓이 = " + 가로 * 세로 / 2.0);

		// 문제4 100초를 1분 40초로 출력
		int time = 100;
		int minutes = time / 60;
		int seconds = time % 60;
		System.out.println(time + "초 = " + minutes + "분" + seconds + "초");

		// 문제5 800원에서 500원짜리 갯수, 100원짜리 갯수
		int tot = 800;
		int fivHund = tot / 500;
		int oneHund = tot % 500 / 100;
		System.out.println("500원 = " + fivHund + "개, 100원 = " + oneHund + "개");

	}

}
