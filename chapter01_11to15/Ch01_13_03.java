package chapter01_11to15;
/*
 * # 연산자 기호 맞추기 게임
 * 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2. 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3. 위 숫자는 연산자 기호에 해당된다.
 *  1) 덧셈 2)뺄셈 3)곱셈 4)나머지
 * 4. 사용자는 연산자 기호를 맞추는 게임이다.
 *  예) 3 ? 4 = 7
 *   1) + 2) - 3) * 4) %
 *   정답 : 2번
 */

import java.util.Scanner;
import java.util.Random;

public class Ch01_13_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int x = ran.nextInt(10)+1;
		int y = ran.nextInt(10)+1;
		int z = ran.nextInt(4)+1;
		
		int ans = 0;
		
		if(z==1) {
			ans = x+y;			
		}else if(z==2) {
			ans = x-y;
		}else if(z==3) {
			ans = x*y;
		}else if(z==4) {
			ans = x/y;
		}
		System.out.println(x+" ? "+y+" = "+ans);
		System.out.println("연산기호 답 입력:");
		int meanswer = scan.nextInt();
		
		if(meanswer==z) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
	}

}
