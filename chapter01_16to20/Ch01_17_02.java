package chapter01_16to20;
/*
 * # ATM[2단계]
 * 1.입금
 * 입금할 금액을 입력받아 myMoney에 입금
 * 2.출금
 * 출금할 금액을 입력받아 myMoney에서 출금
 * 단 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3.이체
 * yourAcc 계좌번호를 입력받아, 이체
 * 이체할 금액이 myMoney 잔액을 초과할 경우 이체불가
 * 이체 후 yourMoney 잔액 증가
 * 4.조회
 * myMoney와 yourMoney 잔액 모두 출력
 */

import java.util.Scanner;

public class Ch01_17_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int myAcc = 1111;
		int myMoney = 50000;

		int yourAcc = 2222;
		int yourMoney = 70000;

		boolean run = true;
		while (run) {
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("5.종료");

			System.out.println("메뉴선택");
			int sel = scan.nextInt();

			if(sel==1) {
				System.out.print("입금할 금액 입력 : ");
				int deposit = scan.nextInt();
				myMoney += deposit;
				System.out.println("입금완료");
				System.out.println("myMoney:"+myMoney+"원");
			}else if(sel==2) {
				System.out.print("출금할 금액 입력 :");
				int withdrawl = scan.nextInt();
				if(myMoney<withdrawl) {
					System.out.println("잔액부족");
				}else {
					myMoney -= withdrawl;
					System.out.println("출금완료");
					System.out.println("myMoney:"+myMoney+"원");
				}
			}else if(sel==3) {
				System.out.println("이체할 계좌번호 입력 : ");
				int transAcc = scan.nextInt();
				if(transAcc==yourAcc) {
					System.out.println("이체할 금액 입력 : ");
					int transMoney = scan.nextInt();
					if(transMoney<=myMoney) {
						yourMoney += transMoney;
						myMoney -= transMoney;
						System.out.println("이체완료");
					}else {
						System.out.println("잔액부족");
					}
				}else {
					System.out.println("계좌번호 다시확인");
				}
			}else if(sel==4) {
				System.out.println("잔액조회");
				System.out.println("myMoney:"+myMoney+"원");
				System.out.println("yourMoney:"+yourMoney+"원");
			}else if(sel==5) {
				System.out.println("종료");
				run = false;
			}
			
			
			
		}

	}
}
