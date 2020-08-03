package chapter01_16to20;
/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력 받는다.
 * 3. 각 메뉴별 주문수량과 총 금액을 출력한다.
 * 
 * 예) 
 * 메뉴선택 : 1
 * 메뉴선택 : 1
 * 메뉴선택 : 2
 * 메뉴선택 : 2
 * 메뉴선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 = 32000원
 * 
 * ===롯데리아 영수증===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜          라 : 1개
 * 4. 총    금   액 : 31300원
 * 5. 잔          돈 : 700원
 */

import java.util.Scanner;

public class Ch01_16_01 {

	public static void main(String[] args) {
		// 18:04 ~ 18:14 (10분)

		Scanner scan = new Scanner(System.in);

		int menu1 = 0;
		int menu2 = 0;
		int menu3 = 0;

		int i = 1;
		while (i <= 5) {
			System.out.println("주문을 입력하세요");
			int select = scan.nextInt();
			if (select == 1) {
				menu1 = menu1 + 1;
			} else if (select == 2) {
				menu2 = menu2 + 1;
			} else if (select == 3) {
				menu3 = menu3 + 1;
			}
			i = i + 1;
		}

		int tot = menu1 * 8700 + menu2 * 6200 + menu3 * 1500;
		System.out.println("총금액 :" + tot + "원");
		System.out.println("현금을 입력하세요");
		int cash = scan.nextInt();

		if (tot <= cash) {
			System.out.println("===== 롯데리아 영수증 =====");
			System.out.println("1. 불고기 버거: " + menu1 + "개");
			System.out.println("3. 새 우  버 거: " + menu2 + "개");
			System.out.println("3. 콜         라: " + menu3 + "개");
			System.out.println("4. 총   금   액: " + tot + "원");
			System.out.println("5. 잔         돈: " + (cash - tot) + "원");

		} else {
			System.out.println("현금이 부족합니다");
		}

	}

}
