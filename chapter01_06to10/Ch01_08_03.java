package chapter01_06to10;

/*
 * # 로그인[3단계]
 * 1. ID를 입력받아 dbID와 일치할 경우에만 PW를 입력할 수 있다.
 * 2. ID가 틀린 경우 "ID를 확인해주세요"라는 메세지를 출력한다.
 * 3. PW가 틀린 경우 "PW를 확인해주세요"라는 메세지를 출력한다.
 * 4. ID와 PW가 모두 일치하는 경우, "로그인 성공이라는 메세지를 출력한다."
 *
 */

import java.util.Scanner;

public class Ch01_08_03 {

	public static void main(String[] args) {
		// 14:22 ~ 14:30 (8분)

		Scanner scan = new Scanner(System.in);

		int dbID = 1234;
		int dbPW = 1111;

		System.out.println("ID를 입력하세요 : ");

		int meID = scan.nextInt();

		if (meID == dbID) {
			System.out.println("PW를 입력하세요 : ");
			int mePW = scan.nextInt();
			if (mePW == dbPW) {
				System.out.println("로그인 성공");
			}
			if (mePW != dbPW) {
				System.out.println("PW를 확인하세요");
			}
		}else {
			System.out.println("ID를 확인하세요");
		}

	}

}
