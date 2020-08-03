package chapter02_01to05;
/*
 * # 배열 기본문제
 */

public class Ch02_01_03 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		// 문제1) 10부터 50까지 arr배열에 저장
		System.out.println(">>>문제1");
		int i = 0;
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		for (i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}

		// 문제2) 4의 배수만 출력
		System.out.println(">>>문제2");
		for (i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				System.out.println(arr[i]);
			}
		}

		// 문제3) 4의 배수의 합 출력
		System.out.println(">>>문제3");
		int tot = 0;
		for (i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				tot = tot + arr[i];
			}
		}
		System.out.println(tot);

		// 문제4) 4의 배수의 갯수 출력
		System.out.println(">>>문제4");
		int cnt = 0;
		for (i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				cnt = cnt + 1;
			}
		}
		System.out.println(cnt);

		// 문제5) 짝수의 갯수 출력
		System.out.println(">>>문제5");
		cnt = 0;
		for (i = 0; i < 5; i++) {
			if (arr[i] % 2 == 0) {
				cnt = cnt + 1;
			}
		}
		System.out.println(cnt);

	}

}
