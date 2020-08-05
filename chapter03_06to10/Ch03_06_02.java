package chapter03_06to10;
/*
 * # 석차 출력
 * 성적 순으로 이름 출력
 */

public class Ch03_06_02 {

	public static void main(String[] args) {

		String[] name = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
		int[] score = {87, 42, 100, 11, 98};

		for(int i=0;i<score.length-1;i++) {
			int maxNum = score[i];
			int maxidx = i;
			for(int j=i+1;j<score.length;j++) {
				if(maxNum<score[j]) {
					maxNum=score[j];
					maxidx = j;
				}
			}
			int temp = score[i];
			score[i] = score[maxidx];
			score[maxidx] = temp;
			
			String stemp = name[i];
			name[i] = name[maxidx];
			name[maxidx] = stemp;
		}
		
		System.out.print("석차별출력:");
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i]+" ");
		}
		
		
	}

}
