package chapter01_11to15;

/*
 * # ATM[1단계] : 이체하기
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney : 이체가능
 *               myMoney - 이체할 금액
 *               yourMoney + 이체할 금액
 *    이체할 금액 >= myMoney : 이체불가             
 */

import java.util.Scanner;

public class Ch01_12_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		int yourMoney = 12000;

		System.out.println("이체할 계좌번호를 입력하세요 : ");
		int transAcc = scan.nextInt();

		if (transAcc == myAcc) {
			System.out.println("이체할 금액을 입력하세요 :");
			int transMoney = scan.nextInt();
			if (transMoney <= myMoney) {
				myMoney = myMoney - transMoney;
				yourMoney = yourMoney + transMoney;

				System.out.println("이체를 완료하였습니다");
			} else {
				System.out.println("이체할 잔액이 부족합니다");
			}
		} else {
			System.out.println("계좌를 확인하세요");
		}

		System.out.println("myMoney :" + myMoney + "원");
		System.out.println("yourMoney :" + yourMoney + "원");

	}

}
