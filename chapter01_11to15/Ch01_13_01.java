package chapter01_11to15;
/*
 * # 369게임[1단계]
 * 1. 1~50 사이의 랜덤숫자를 저장한다.
 * 2. 위 수에 369의 개수가 
 *    1)2개이면, 짝짝을 출력
 *    2)1개이면, 짝을 출력
 *    3)0개이면, 해당 숫자를 출력
 */
import java.util.Random;

public class Ch01_13_01 {

	public static void main(String[] args) {

		Random ran = new Random();
		int r = ran.nextInt(50)+1;
		System.out.println(r);
		
		int a = r/10;
		int b = r%10;
		int count = 0;
		if(a!=0&&a%3==0) {
			count += 1;
		}
		if(b!=0&&b%3==0) {
			count += 1;
		}
		
		if(count==2) {
			System.out.println("짝짝");
		}else if(count==1) {
			System.out.println("짝");
		}else {
			System.out.println(r);
		}
		
		
	}

}
