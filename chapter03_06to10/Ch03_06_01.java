package chapter03_06to10;
/*
 * # 정렬하기
 * 1. 인덱스 0번이 나머지를 검사한다.
 * 2. 제일 큰 값을 찾아 교환한다.
 * 3. 인덱스 1 증가한다.
 * 4. [1~3]을 끝까지 반복한다.
 * 예)
 * 10, 50, 30, 40, 80, 7 10이랑 80 바꿈
 * 80, 50, 30, 40, 10, 7 50 그대로
 * 80, 50, 30, 40, 10, 7 30이랑 40 바꿈
 * 80, 50, 40, 30, 10, 7 
 */

public class Ch03_06_01 {

	public static void main(String[] args) {

		int[] score = {10, 50, 30, 40, 80, 7};

		int idx = 0;
		
		while(idx<6) {
			int maxNum = score[idx];
			int maxIdx = idx;
			
			for(int i=idx; i<6; i++) {
				if(maxNum<score[i]) {
					maxNum=score[i];
					maxIdx=i;
				}
			}
			int temp = score[idx];
			score[idx] = score[maxIdx];
			score[maxIdx] = temp;
			
			idx += 1;
			
			if(idx==5) {
				for(int i=0; i<score.length; i++) {
					System.out.print(score[i]+" ");
				}
			}
		}
		
		
		
		
	}

}
