package chapter02_01to05;
import java.util.Scanner;

public class Ch02_05_02 {

	public static void main(String[] args) {
		// 12:00 ~ 12:5 (5분)

		Scanner scan = new Scanner(System.in);

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// 문제3 학번2개를 입력받아 성적 교체하기

		System.out.println("학번입력");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();

		int x = 0;
		int y = 0;
		int z = 0;

		for (int i = 0; i < 5; i++) {
			if (hakbuns[i] == n1) {
				x = i;
			}
			if (hakbuns[i] == n2) {
				y = i;
			}
		}
		z = scores[x];
		scores[x] = scores[y];
		scores[y] = z;

		for (int i = 0; i < 5; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();

	}

}
