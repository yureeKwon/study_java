package chapter03_01to05;

/*
 * # ATM[4단계] : 전체 기능구현
 * 1. 회원가입
 * id와 pw를 입력받아 가입
 * 가입 시 돈 1000원 부여
 * id 중복체크
 * 2. 회원탈퇴
 * 로그인시에만 이용가능
 * 3. 로그인
 * id와 pw를 입력받아 로그인
 * 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * 로그인 시에만 이용가능
 * 5. 입금
 * 로그인시에만 이용가능
 * 6. 이체
 * 로그인 시에만 이용가능
 * 7. 잔액조회
 * 로그인 시에만 이용가능
 * 0. 종료
 */
import java.util.Scanner;

public class Ch03_05_01 {

	public static void main(String[] args) {
		// 14:27 ~

		Scanner scan = new Scanner(System.in);

		int MAX = 5;

		int[] arAcc = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];

		int cnt = 0;
		int log = -1;

		String menu = "=== 메가 ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료";

		while (true) {

			System.out.println("[회원 수 :" + cnt + "명]");
			for (int i = 0; i < cnt; i++) {
				System.out.print(arAcc[i] + ":" + arPw[i] + "(" + arMoney + ")");
			}
			System.out.println("------------------------");
			System.out.print("[접속자] : ");
			if (log == -1) {
				System.out.println("없음");
			} else {
				System.out.println(arAcc[log]);
			}
			System.out.println("------------------------");

			System.out.println(menu);
			int sel = scan.nextInt();

			if (sel == 1) {
				if (cnt == 5) {
					System.out.println("회원가입은 5명까지만 가능");
					continue;
				}
				System.out.print("[가입]Acc입력 : ");
				int myAcc = scan.nextInt();

				int check = 1;
				for (int i = 0; i < cnt; i++) {
					if (arAcc[i] == myAcc) {
						check = -1;
					}
				}
				if (check == -1) {
					System.out.println("[가입]Acc가 중복");
				} else {
					System.out.print("[가입]pw입력 : ");
					int myPw = scan.nextInt();
					int myMoney = 0;

					arAcc[cnt] = myAcc;
					arPw[cnt] = myPw;
					arMoney[cnt] = 1000;
					cnt = cnt + 1;
					System.out.println("[가입]가입완료");

				}

			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("[탈퇴]로그인 후 이용가능");
				} else {
					for (int i = log; i < cnt - 1; i++) {
						arAcc[i] = arAcc[i + 1];
						arPw[i] = arPw[i + 1];
					}
					cnt = cnt - 1;
					System.out.println("[탈퇴]탈퇴완료");
					log = -1;
				}
			} else if (sel == 3) {
				if (log == -1) {
					System.out.println("[로그인]Acc입력");
					int myAcc = scan.nextInt();
					System.out.println("[로그인]Pw입력");
					int myPw = scan.nextInt();

					int check = -1;
					for (int i = 0; i < cnt; i++) {
						if (arAcc[i] == myAcc && arPw[i] == myPw) {
							check = i;
						}
					}

					if (check == -1) {
						System.out.println("[로그인]Acc와 Pw 다시 확인");
					} else {
						log = check;
						System.out.println("[로그인]" + arAcc[log] + "님 환영합니다");
					}

				} else {
					System.out.println("[로그인]현재" + arAcc[log] + "님이 로그인 중");
				}

			} else if (sel == 4) {
				if (log == -1) {
					System.out.println("로그인 후 이용가능");
				} else {
					System.out.println("[로그아웃]로그아웃 완료");
					log = -1;
				}

			} else if (sel == 5) {
				if (log == -1) {
					System.out.println("[입금]로그인 후 이용가능");
				} else {
					System.out.println("[입금]입금금액 입력");
					int money = scan.nextInt();

					arMoney[log] = arMoney[log] + money;
					System.out.println("[입금]입금 완료");
				}

			} else if (sel == 6) {
				if (log == -1) {
					System.out.println("로그인 후 이용가능");
				} else {
					System.out.println("[이체]계좌번호 입력 : ");
					int account = scan.nextInt();

					int check = -1;
					for (int i = 0; i < cnt; i++) {
						if (arAcc[i] == account) {
							check = i;
						}
					}

					if (check == -1) {
						System.out.println("[이체]계좌번호 다시 확인");
						continue;
					}
					System.out.println("[이체]이체할 금액을 입력 : ");
					int money = scan.nextInt();

					if (arMoney[log] >= money) {
						arMoney[log] = arMoney[log] - money;
						arMoney[check] = arMoney[check] + money;
						System.out.println("[이체]이체 완료");
					} else {
						System.out.println("[이체]잔액이 부족합니다");
					}
				}
			} else if (sel == 7) {
				if (log == -1) {
					System.out.println("로그인 후 이용가능");
				} else {
					System.out.println("고객님의 잔액은 " + arMoney[log] + "원 입니다");
				}
			} else if (sel == 0) {
				break;
			}

		}

	}

}
