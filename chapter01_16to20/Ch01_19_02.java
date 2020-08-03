package chapter01_16to20;
/*
 * # 랜덤학생
 * 1.10회 반복을 한다.
 * 2.1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3.성적이 60점 이상이면 합격생이다.
 * ------------------------------------- 
 * * 전교생(10명)의 총점과 평균을 출력한다.
 * * 합격자 수를 출력한다.
 * * 1등 학생의 번호와 성적을 출력한다.
 */

import java.util.Random;

public class Ch01_19_02 {

	public static void main(String[] args) {

		Random ran = new Random();
		
		int num = 10;
		int cnt = 0;
		int tot = 0;
		int maxScore=0;
		int maxNum = 0;
		
		int i = 0;		
		while(i<num) {
			int score = ran.nextInt(100)+1;
			if(score>=60) {
				cnt += 1;
			}
			if(score>maxNum) {
				maxScore = score;
				maxNum = i+1;
			}
			tot += score;
			i++;
		}
		
		System.out.println("총점 : "+tot+"점");
		System.out.println("평균 : "+tot/num+"점");
		System.out.println("합격생:"+cnt+"명");
		System.out.println("1등 :"+maxNum+"번-"+maxScore+"점");
		
		
	}
}
