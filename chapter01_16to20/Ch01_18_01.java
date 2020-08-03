package chapter01_16to20;
/*
 * # 베스킨라빈스 31
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 예)
 * 1턴 : p1(2) br(2)
 * 2턴 : p2(1) br(3)
 * 3턴 : p1(3) br(6)
 * ...
 */

import java.util.Scanner;

public class Ch01_18_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		int turn = 0;
		boolean run = true;
		while(run) {
			if(turn%2==0) {
				System.out.print("p1입력:");
				int p1 = scan.nextInt();
				total += p1;
				System.out.println(turn+1+"턴 : p1("+p1+") br("+total+")" );
			}
			if(turn%2==1) {
				System.out.print("p2입력:");
				int p2 = scan.nextInt();
				total += p2;
				System.out.println(turn+1+"턴 : p2("+p2+") br("+total+")" );
			}
			turn += 1;
			if(total>=31) {
				if(turn%2==0) {
					System.out.println("p1승리");
				}else {
					System.out.println("p2승리");
				}
				System.out.println("종료");
				run = false;
			}
		}
		
	}
}
