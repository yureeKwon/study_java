package chapter01_01to05;

public class Ch01_04_04 {

	public static void main(String[] args) {
		// 예) 3의 배수이면서, 짝수이면 true 출력
		int num = 12;
		System.out.println(num % 3 == 0 && num % 2 == 0);

		// 문제1) 과락
		// 3과목의 평균이 60점 이상이면, true
		// 단, 어느 한 과목이라도 50점 미만이면, false
		int score1 = 100;
		int score2 = 87;
		int score3 = 41;
		int tot = score1 + score2 + score3;
		double avr = tot / 3.0;
		System.out.println("당락여부 " + (avr >= 60 && score1 > 50 && score2 > 50 && score3 > 50));

		// 문제2) 키가 200cm 이상이거나 몸무게가 200kg 이상이면, 입장(true)
		int height1 = 199;
		int weight1 = 199;
		int height2 = 200;
		int weight2 = 68;

		System.out.println("1의 입장여부 " + (height1 >= 200 || weight1 >= 200));
		System.out.println("2의 입장여부 " + (height2 >= 200 || weight2 >= 200));

	}

}
