package chapter03_06to10;

/*
 * # 2���� �迭
 */
public class Ch03_08_01 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];

		System.out.println("arr[0]�ּ� : " + arr[0]);
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;

		System.out.println("arr[1]�ּ� : " + arr[1]);
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;

		System.out.println("arr[2]�ּ� : " + arr[2]);
		arr[2][0] = 70;
		arr[2][1] = 80;
		arr[2][2] = 90;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("-------------------------------");

		int[] temp = arr[1]; // arr[1] ��ü�� ���
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}

	}

}
