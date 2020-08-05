package chapter03_06to10;
/*
 * # 2차원배열 기본문제[3단계]
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
		
		// 문제1) 가로 합 출력
		System.out.println("가로합");
		for(int i=0; i<3; i++) {
			System.out.print(garo[i]+" ");
		}System.out.println();
		
		// 문제2) 세로 합 출력
		
		System.out.println("세로합");
		for(int i=0; i<4; i++) {
			System.out.print(sero[i]+" ");
		}
		

	}

}
