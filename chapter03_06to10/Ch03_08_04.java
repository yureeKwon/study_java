package chapter03_06to10;
/*
 * # 2�����迭 �⺻����[3�ܰ�]
 */

public class Ch03_08_04 {

	public static void main(String[] args) {
		// 13:39 ~ 1:53

		int[][] arr = { { 101, 102, 103, 104 }, 
						{ 201, 202, 203, 204 }, 
						{ 301, 302, 303, 304 } };

		int[] garo = new int[3];
		int[] sero = new int[4];
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				garo[i] += arr[i][j];
				sero[j] += arr[i][j];
			}
		}
		
		// ����1) ���� �� ���
		System.out.println("������");
		for(int i=0; i<3; i++) {
			System.out.print(garo[i]+" ");
		}System.out.println();
		
		// ����2) ���� �� ���
		
		System.out.println("������");
		for(int i=0; i<4; i++) {
			System.out.print(sero[i]+" ");
		}
		

	}

}
