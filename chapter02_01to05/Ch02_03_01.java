package chapter02_01to05;

import java.util.Random;

/*
 * # OMR카드
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한문제당 20점이다.
 * 
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd = {1, 1, 4, 4, 3}
 * 정오표 = {o, x, o, x, x}
 * 성적 = 40점 
 */

public class Ch02_03_01 {

	public static void main(String[] args) {
		// 13:08 ~ 13:27분(19분)

		Random ran = new Random();

		// hgd 지정------------

		int[] answer = { 1, 3, 4, 2, 5 };                       
		int[] hgd = new int[5];
		
		int cnt = 0;
		int score = 0;
		
		System.out.print("정오표 = [");
		for(int i=0; i<5; i++) {
			hgd[i] = ran.nextInt(5)+1;
			if(answer[i]==hgd[i]) {
				System.out.print("O ");
				cnt += 1;
			}else {
				System.out.print("X ");
			}
		}
		System.out.println("]");
		score = cnt*20;
		System.out.println("성적 : "+score+"점");

	}

}
