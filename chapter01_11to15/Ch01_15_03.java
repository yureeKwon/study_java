package chapter01_11to15;

/*
 * # 구구단 게임[3단계]
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 */
import java.util.Scanner;
import java.util.Random;

public class Ch01_15_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int cnt = 0;
		

		int i = 0;
		while (i < 5) {
			int x = ran.nextInt(10) + 1;
			int y = ran.nextInt(10) + 1;
			int ans = x * y;
			System.out.println("문제:" + x + "*" + y + "= ?");
			System.out.print("정답입력 : ");
			int me = scan.nextInt();

			if (me == ans) {
				cnt += 1;
			} 
			i++;
		}
		
		int score = cnt * 20;
		System.out.println("점수:" + score + "점");
	}
}