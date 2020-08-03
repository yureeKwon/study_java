package chapter01_16to20;
/*
 * # ATM[2단계]
 * 1. 로그인
 * 로그인 후 재로그인 불가
 * 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * 로그인 후 이용가능
 */

import java.util.Scanner;

public class Ch01_17_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴선택 : ");
			int sel = scan.nextInt();
			
			if(sel==1) {
				if(log==-1) {
					System.out.print("계좌번호입력:");
					int id = scan.nextInt();
					System.out.print("비번입력:");
					int pw = scan.nextInt();
					
					if(id==dbAcc1&&pw==dbPw1) {
						System.out.println("1님 로그인성공");
						log = 1;
					}else if(id==dbAcc1&&pw==dbPw1) {
						System.out.println("2님 로그인성공");
						log = 2;
					}else {
						System.out.println("로그인 정보 다시확인");
					}
				}else if(log==1){
					System.out.println("1님이 로그인중");
				}else if(log==2) {
					System.out.println("2님이 로그인중");
				}
			}else if(sel==2) {
				if(log!=-1) {
					log = -1;
					System.out.println("로그아웃 완료");
				}else if(log==-1){
					System.out.println("로그인 후 이용가능");
				}
			}else if(sel==0) {
				System.out.println("프로그램종료");
				run = false;
			}else {
				System.out.println("메뉴 다시 입력");
			}
		}
		
		
	}
}
