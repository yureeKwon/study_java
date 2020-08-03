package chapter01_16to20;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 1. 로그인
 * 로그인 후 재로그인 불가
 * 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * 로그인 후 이용가능
 * 3. 입금
 * 로그인 후 이용가능
 * 4. 출금
 * 로그인 후 이용가능
 * 5. 이체
 * 로그인 후 이용가능
 * 6. 조회
 * 로그인 후 이용가능
 * 0. 종료
 */

public class Ch01_17_03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;

		int log = -1; // -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)

		boolean run = true;

		while (run) {
			System.out.println("메뉴선택");
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			int sel = scan.nextInt();

			if (sel == 1) {
				if (log == -1) {
					System.out.println("계좌번호입력");
					int id = scan.nextInt();
					System.out.println("비번입력");
					int pw = scan.nextInt();
					if (id == dbAcc1 && pw == dbPw1) {
						System.out.println("1님, 환영합니다");
						log = 1;
					} else if (id == dbAcc2 && pw == dbPw2) {
						System.out.println("2님, 환영합니다");
						log = 2;
					} else {
						System.out.println("아이디와 비밀번호 다시 확인");
					}
				} else if (log == 1 || log == 2) {
					System.out.println("로그인 후 재로그인 불가");
				}
			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("로그인 후 이용가능");
				} else if (log == 1 || log == 2) {
					System.out.println("로그아웃 완료");
				}

			} else if (sel == 3) {
				if (log == -1) {
					System.out.println("로그인 후 이용가능");
				} else if (log == 1) {
					System.out.println("입금할 금액입력");
					int deposit = scan.nextInt();
					dbMoney1 = dbMoney1 + deposit;
					System.out.println("입금후 잔액:" + dbMoney1 + "원");
				} else if (log == 2) {
					System.out.println("입금할 금액입력");
					int deposit = scan.nextInt();
					dbMoney2 = dbMoney2 + deposit;
					System.out.println("입금후 잔액:" + dbMoney2 + "원");
				}
			} else if (sel == 4) {
				if (log == -1) {
					System.out.println("로그인 후 이용가능");
				} else if (log == 1) {
					System.out.println("출금할 금액입력");
					int withdrawl = scan.nextInt();
					if (withdrawl > dbMoney1) {
						System.out.println("잔액이 부족합니다");
					} else {
						dbMoney1 = dbMoney1 - withdrawl;
						System.out.println("출금후 잔액:" + dbMoney1 + "원");
					}
				} else if (log == 2) {
					System.out.println("출금할 금액입력");
					int withdrawl = scan.nextInt();
					if (withdrawl > dbMoney2) {
						System.out.println("잔액이 부족합니다");
					} else {
						dbMoney2 = dbMoney2 - withdrawl;
						System.out.println("출금후 잔액:" + dbMoney2 + "원");
					}
				}
			} else if (sel == 5) {
				if (log == -1) {
					System.out.println("로그인 후 이용가능");
				} else if (log == 1) {
					System.out.println("이체할 계좌입력");
					int transacc = scan.nextInt();
					if (transacc == dbAcc2) {
						System.out.println("이체할 금액입력");
						int transmoney = scan.nextInt();
						if (transmoney > dbMoney1) {
							System.out.println("잔액이 부족합니다");
						} else {
							System.out.println("이체성공");
							dbMoney1 = dbMoney1 - transmoney;
							System.out.println("이체 후 잔액:" + dbMoney1 + "원");
						}
					} else {
						System.out.println("계좌번호 다시 확인");
					}
				} else if (log == 2) {
					System.out.println("이체할 계좌입력");
					int transacc = scan.nextInt();
					if (transacc == dbAcc1) {
						System.out.println("이체할 금액입력");
						int transmoney = scan.nextInt();
						if (transmoney > dbMoney2) {
							System.out.println("잔액이 부족합니다");
						} else {
							System.out.println("이체성공");
							dbMoney2 = dbMoney2 - transmoney;
							System.out.println("이체 후 잔액:" + dbMoney2 + "원");
						}
					} else {
						System.out.println("계좌번호 다시 확인");
					}
				}

			} else if (sel == 6) {
				if (log == -1) {
					System.out.println("로그인 후 이용가능");
				} else if (log == 1) {
					System.out.println("계좌잔액" + dbMoney1 + "원");
				} else if (log == 2) {
					System.out.println("계좌잔액" + dbMoney2 + "원");
				}

			} else if (sel == 0) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}

		
	}
}
