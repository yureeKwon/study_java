package chapter03_11to16;

public class Ch03_13_06 {

	public static void main(String[] args) {

		String[][] arr = new String[9][17];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 17; j++) {
				arr[i][j] = "";
			}
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 8 - i; j++) {
				arr[i][j] = " ";
			}
			for (int j = 8 - i; j < 9 + i; j++) {
				if (j % 2 == 0 && i % 2 == 0) {
					arr[i][j] = (i + 1) + "";
				} else if (j % 2 != 0 && i % 2 != 0) {
					arr[i][j] = (i + 1) + "";
				} else {
					arr[i][j] = " ";
				}
			}
			for (int j = 9 + i; j < 17; j++) {
				arr[i][j] = " ";
			}
		}
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 17; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		

	}

}
