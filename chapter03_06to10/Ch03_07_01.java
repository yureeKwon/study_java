package chapter03_06to10;

public class Ch03_07_01 {

	public static void main(String[] args) {
		int[] arr = { 87, 100, 24, 11, 79 };

		int[] temp = arr;
		temp[1] = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " "); // 87 0 24 11 79
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.print(temp[i] + " "); // 87 0 24 11 79
		}
		
		//stack에 arr, temp 두개가 같은 주소 가짐
		//heap에 01234방은 하나씩만 존재. temp변경하면 heap에 들어있는 값 변경
		
	}

}
