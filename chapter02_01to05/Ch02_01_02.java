package chapter02_01to05;

public class Ch02_01_02 {

	public static void main(String[] args) {
		// 1. 배열 사용법(1)
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}

		// 2. 배열 사용법(2) : 축약형
		int[] temp = { 10, 20, 30, 40 };

		for (int i = 0; i < 4; i++) { // i 갯수랑 temp 안의 갯수 맞아야 오류안남
			System.out.println(temp[i]);
		}

	}

}
