package chapter01_11to15;
/*
 * # 지하철 요금 계산
 * 1.이용할 정거장 수를 입력받는다.
 * 2.다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3.요금표
 *  1) 1~5 : 500원
 *  2) 6~10 : 600원
 *  3) 11,12 : 650원
 *  4) 13,14 : 700원
 *  5) 15,16 : 750원
 *     ...
 */

import java.util.Scanner;

public class Ch01_13_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정류장 수 입력 : ");
		int sta = scan.nextInt();
		int fee = 0;
		
		if(1<=sta&&sta<=5) {
			fee = 500;
		}else if(6<=sta&&sta<=10) {
			fee = 650;
		}else if(10<sta&&sta%2==1) {
			fee = 650+(sta-10)/2*50;
		}else if(10<sta&&sta%2==0) {
			fee = 600+(sta-10)/2*50;
		}
		
		System.out.println("요금 :"+fee+"원");
		
	}
}
