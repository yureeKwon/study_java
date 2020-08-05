package chapter03_06to10;
/*
 * # 2차원배열 기본문제[1단계] 
 */

public class Ch03_08_02 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];

		int k = 1; // arr[][]배열값 지정
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k = k + 1;
			}
		}

		for (int i = 0; i < 3; i++) { // arr[][]배열값 출력
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// 문제1) 전체 합 출력
		int tot = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tot += arr[i][j];
			}
		}
		System.out.println("총합 : " + tot);

		// 문제2) 4의 배수만 출력
		System.out.print("4의 배수 : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] % 4 == 0) {
					System.out.print(+arr[i][j] + " ");
				}
			}
		}
		System.out.println();

		// 문제3) 4의 배수의 합 출력

		int tot4 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] % 4 == 0) {
					tot4 += arr[i][j];
				}
			}
		}
		System.out.println("4의 배수 총합 : " + tot4);

		// 문제4) 4의 배수의 개수 출력
		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] % 4 == 0) {
					cnt = cnt + 1;
				}
			}
		}
		System.out.print("4의 배수의 개수 : " + cnt);

	}

}
