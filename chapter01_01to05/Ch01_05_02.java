package chapter01_01to05;

import java.util.Scanner;

public class Ch01_05_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 문제1) 숫자 2개를 입력받아, 합 출력
		System.out.println("정수1 입력 : ");
		int x = scan.nextInt();
		System.out.println("정수2 입력 : ");
		int y = scan.nextInt();

		int tot = x + y;
		System.out.println("합 = " + tot);

		// 문제2) 숫자 1개를 입력받아, 홀수이면 true 출력
		System.out.println("숫자 입력 : ");
		int z = scan.nextInt();
		System.out.println(z % 2 == 1);

		// 문제3) 성적을 입력받아, 60점 ㅇ이상이고 100점 이하이면 true 출력
		System.out.println("성적 입력 : ");
		int 성적 = scan.nextInt();
		System.out.println(성적 >= 60 && 성적 <= 100);

	}

}
