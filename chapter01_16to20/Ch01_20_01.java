package chapter01_16to20;
/*
 * # 쇼핑몰 뒤로가기
 * 1.남성의류
 *  1)티셔츠
 *  2)바지
 *  3)뒤로가기
 * 2.여성의류
 *  1)가디건
 *  2)치마
 *  3)뒤로가기
 * 3.종료
 */

import java.util.Scanner;

public class Ch01_20_01 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	boolean run = true;
	
	while(run) {
		System.out.println("1.여성의류");
		System.out.println("2.남성의류");
		System.out.println("3.종료");
		
		System.out.println("메뉴선택");
		int sel = scan.nextInt();
		
		if(sel==1) {
			boolean exit = true;
			while(exit) {
				System.out.println("1)티셔츠");
				System.out.println("2)바지");
				System.out.println("3)뒤로가기");
				
				System.out.println("메뉴선택");
				int sel2 = scan.nextInt();
				if(sel2==1||sel2==2) {
					System.out.println("고르기");
				}else if(sel2==3) {
					exit =false;
				}
			}
		}else if(sel==2) {
			boolean exit = true;
			while(exit) {
				System.out.println("1)티셔츠");
				System.out.println("2)바지");
				System.out.println("3)뒤로가기");
				
				System.out.println("메뉴선택");
				int sel2 = scan.nextInt();
				if(sel2==1||sel2==2) {
					System.out.println("고르기");
				}else if(sel2==3) {
					exit =false;
				}
			}
		}else if(sel==3) {
			System.out.println("종료");
			run = false;
		}

	}
	
	
	
	}
}
