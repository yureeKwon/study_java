package chapter03_11to16;
/*
 * # ��÷���� 1��Ʈ
 * 1. 3�� �������� 3�� �����ϸ� ��÷�����̴�.
 * 2. �������� 5���� ������ �����ϵ�,
 * 3. ��÷������ �Ѱ��� �����ǵ��� �����Ѵ�.
 */

import java.util.Random;

public class Ch03_12_01 {

	public static void main(String[] args) {

		Random ran = new Random();

		int[][] lotto = new int[5][7];

		int win = 0;
		
		for (int i = 0; i < 5; i++) {
			int cnt = 0;
			for (int j = 0; j < 7; j++) {
				int r = ran.nextInt(2);
				if (r == 0) {
					lotto[i][j] = 3;
					cnt += 1;
					if (cnt == 3) {
						win += 1;
					}
				} else {
					lotto[i][j] = 0;
					cnt = 0;
				}
			}
			if (win > 1) {
				i = i - 1;
			}
			if(i==4&&win==0) {
				i = i-1;
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println((i+1)+"��°����:");
			for(int j=0; j<7; j++) {
				System.out.print(lotto[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
