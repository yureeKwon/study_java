package chapter02_01to05;
/*
 * # 4의 배수만 저장
 * - arr 배열에서 4의 배수만 골라 temp 배열에 저장
 */

public class Ch02_05_03 {

	public static void main(String[] args) {
		int[] arr = { 44, 11, 29, 24, 76 };

		int cnt = 0;

		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				cnt = cnt + 1;
			}

		}
		int[] temp = new int[cnt];

		int j = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 4 == 0) {
				temp[j] = arr[i]; // temp[j]=arr[i]가 되고
				j = j + 1; // j = j + 1; 다음 j는 j+1이 되고..
			}
		}

		for (int i = 0; i < cnt; i++) { // **** i < cnt ****
			System.out.print(temp[i] + " "); // temp 어레이 출력
		}

		System.out.println();

	}

}
