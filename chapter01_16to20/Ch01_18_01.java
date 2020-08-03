package chapter01_16to20;
/*
 * # ����Ų��� 31
 * 1. p1�� p2�� �����ư��鼭 1~3�� �Է��Ѵ�.
 * 2. br�� p1�� p2�� �Է°��� �����ؼ� �����Ѵ�.
 * 3. br�� 31�� ������ ������ ����ȴ�.
 * 4. �¸��ڸ� ����Ѵ�.
 * ��)
 * 1�� : p1(2) br(2)
 * 2�� : p2(1) br(3)
 * 3�� : p1(3) br(6)
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
				System.out.print("p1�Է�:");
				int p1 = scan.nextInt();
				total += p1;
				System.out.println(turn+1+"�� : p1("+p1+") br("+total+")" );
			}
			if(turn%2==1) {
				System.out.print("p2�Է�:");
				int p2 = scan.nextInt();
				total += p2;
				System.out.println(turn+1+"�� : p2("+p2+") br("+total+")" );
			}
			turn += 1;
			if(total>=31) {
				if(turn%2==0) {
					System.out.println("p1�¸�");
				}else {
					System.out.println("p2�¸�");
				}
				System.out.println("����");
				run = false;
			}
		}
		
	}
}
