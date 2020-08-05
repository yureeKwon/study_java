package chapter03_06to10;

/*
 * # 2차원배열 기본문제[2단계]
 */
import java.util.Scanner;

public class Ch03_08_03 {

	public static void main(String[] args) {
		// 13:15 ~ 13:35(20분)

		Scanner scan = new Scanner(System.in);

		int[][] arr = new int[3][3];

		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k = k + 1;
			}
		}
		// 문제1) 인덱스2개를 입력받아 값 출력
		System.out.print("[입력] 인덱스1 : ");
		int idx1 = scan.nextInt();
		System.out.print("[입력] 인덱스2 : ");
		int idx2 = scan.nextInt();

		System.out.println("[값 출력] : " + arr[idx1][idx2]);

		// 문제2) 값을 입력받아 인덱스 2개 출력
		System.out.print("[입력] 값 : ");
		int data = scan.nextInt();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == data) {
					System.out.println("[인덱스1 출력] : " + i);
					System.out.println("[인덱스2 출력] : " + j);
				}
			}
		}

		// 문제3) 가장 큰 값의 인덱스 2개 출력
		int maxnum = arr[0][0];
		idx1 = 0;
		idx2 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (maxnum < arr[i][j]) {
					maxnum = arr[i][j];
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("[최대값 인덱스1 출력] : " + idx1);
		System.out.println("[최대값 인덱스2 출력] : " + idx2);

		// 문제4) 값 2개를 입력받아 값 교체
		System.out.print("[입력] 값1 : ");
		int data1 = scan.nextInt();
		System.out.print("[입력] 값2 : ");
		int data2 = scan.nextInt();

		int idx3 = 0;
		int idx4 = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] == data1) {
					idx1 = i;
					idx2 = j;
				} else if (arr[i][j] == data2) {
					idx3 = i;
					idx4 = j;
				}
			}
		}

		int temp = arr[idx1][idx2];
		arr[idx1][idx2] = arr[idx3][idx4];
		arr[idx3][idx4] = temp;

		System.out.println("바뀐 arr[][]출력 : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		System.out.println();

	}

}
