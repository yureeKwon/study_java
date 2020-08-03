package chapter02_01to05;

/*
 * # 값 교체하기[2단계]
 */
import java.util.Scanner;

public class Ch02_05_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 30, 40, 50 };

		// 문제1) 인덱스 2개를 입력받아 값 교체하기
		// 예1) 인덱스1 입력 : 1
		// 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}
		System.out.println("인덱스 입력");
		int idx1 = scan.nextInt();
		int idx2 = scan.nextInt();
		int z = 0;
		z = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = z;

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 문제2) 값 2개를 입력받아 값 교체하기
		// 예2) 값1입력 : 40
		// 값 2입력 : 20
		// {10, 40, 30, 20, 50}

		System.out.println("값 입력");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();

		int x = 0;
		int y = 0;
		int z1 = 0;

		for (int i = 0; i < 5; i++) {
			if (arr[i] == n1) {
				x = i;
			}
		}
		for (int i = 0; i < 5; i++) {
			if (arr[i] == n2) {
				y = i;
			}
		}
		z1 = arr[x];
		arr[x] = arr[y];
		arr[y] = z1;

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
