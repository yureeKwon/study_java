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
		
		//stack�� arr, temp �ΰ��� ���� �ּ� ����
		//heap�� 01234���� �ϳ����� ����. temp�����ϸ� heap�� ����ִ� �� ����
		
	}

}
