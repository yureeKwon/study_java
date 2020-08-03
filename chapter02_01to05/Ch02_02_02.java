package chapter02_01to05;

/*
 * # 학생성적관리 프로그램[2단계] : 학생검색
 */
import java.util.Scanner;

public class Ch02_02_02 {

	public static void main(String[] args) {
		// 12:37 ~ 12:44 (7분)
		Scanner scan = new Scanner(System.in);

		// 인덱스 0 1 2 3 4
		int[] arr = { 87, 11, 45, 98, 23 };

		// 문제1) 인덱스를 입력받아 성적 출력
		// 정답1) 인덱스 입력 : 1 성적 : 11점

		System.out.println("인덱스입력");
		int idx = scan.nextInt();
		System.out.println(arr[idx]);

		// 문제2) 성적을 입력받아 인덱스 출력
		// 정답2) 성적입력 : 11 인덱스 : 1

		System.out.println("성적입력");
		int i = 0;
		int score = scan.nextInt();
		for (i = 0; i < 5; i++) {
			if (arr[i] == score) {
				System.out.println(i);
			}
		}

		// =======================================

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// 문제3) 학번을 입력받아 성적 출력
		// 정답3) 학번 입력 : 1003 성적 : 45점

		System.out.println("학번입력");
		int num = scan.nextInt();
		for (i = 0; i < 5; i++) {
			if (num == hakbuns[i]) {
				System.out.println(scores[i]);
			}
		}

	}

}
