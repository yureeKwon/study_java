package chapter03_11to16;

import java.util.Scanner;

/*
 * # 소수찾기[3단계]
 * 1. 숫자 한 개를 입력 받는다.
 * 2. 입력받은 숫자보다 큰 첫번째 소수를 출력한다.
 * 
 * 예) enter number : 1000
 * 1000보다 큰 첫번째 소수 : 1009
 * 예) enter number : 500
 *  500보다 큰 첫번째 소수 : 503 
 */

public class Ch03_13_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력:");
		int num = scan.nextInt();
		
		for(int i=num+1; num<i;i++) {
			int cnt=0;
			for(int j=2; j<i;j++) {
				if(i%j==0) {
					cnt += 1;
				}
			}
			if(cnt==0) {
				System.out.println(num+"보다 큰 첫번째소수:"+i);
				break;
			}
		}
		
		
	}

}
