package chapter02_01to05;
/*
 * # 영화관 좌석예매
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

import java.util.Scanner;

public class Ch02_03_02 {

	public static void main(String[] args) {

		// 13:28 ~ 13:48 (20분)

		Scanner scan = new Scanner(System.in);

		int[] seat = new int[7];
		int cnt = 0;

		System.out.println("메가영화관");
		boolean run = true;
		while (run) {
			System.out.print("좌석현황 : ");
			for(int i=0; i<seat.length; i++) {
				System.out.print(seat[i]+" ");
			}
			System.out.println();
			System.out.println("1.좌석예매");
			System.out.println("2.종료");

			System.out.println("메뉴선택");
			int choice = scan.nextInt();

			if (choice == 1) {
				System.out.print("좌석선택(0~6) : ");
				int select = scan.nextInt();

				if (seat[select] == 1) {
					System.out.println("이미 예매된 자리");
				}else if (seat[select] == 0) {
					seat[select] = 1;
					cnt = cnt + 1;
				}
				System.out.println("금액:" + (cnt * 12000) + "원");
			}else if (choice == 2) {
				System.out.println("금액:" + (cnt * 12000) + "원");
				System.out.println("프로그램 종료");
				run = false;
			}

		}

	}
}
