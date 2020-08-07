package chapter03_11to16;
/*
 * # 당첨복권 1세트
 * 1. 3이 연속으로 3번 등장하면 당첨복권이다.
 * 2. 랜덤으로 5개의 복권을 생성하되,
 * 3. 당첨복권은 한개만 생성되도록 설정한다.
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
			System.out.println((i+1)+"번째복권:");
			for(int j=0; j<7; j++) {
				System.out.print(lotto[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
