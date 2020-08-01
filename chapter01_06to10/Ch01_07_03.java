package chapter01_06to10;
/*
 * #로그인[2단계]
 * 1. ID와 PW를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 ID와 PW를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */

import java.util.Scanner;

public class Ch01_07_03 {

	public static void main(String[] args) {
		// 13:42 ~ 13:50 (8분)

		Scanner scan = new Scanner(System.in);

		// 내가 임의지정한 ID, PW
		// int dbID = 0;
		// int dbPW = 0;

		System.out.println("회원가입");
		System.out.println("ID입력");
		int meID = scan.nextInt();
		System.out.println("PW입력");
		int mePW = scan.nextInt();
		System.out.println("회원가입 완료");

		System.out.println("로그인");
		System.out.println("ID입력");
		int meID2 = scan.nextInt();
		System.out.println("PW입력");
		int mePW2 = scan.nextInt();

		if (meID == meID2 && mePW == mePW2) {
			System.out.println("로그인 성공");
		}else{
			System.out.println("로그인 실패");
		}

	}

}
