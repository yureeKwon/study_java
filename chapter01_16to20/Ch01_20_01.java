package chapter01_16to20;
/*
 * # ���θ� �ڷΰ���
 * 1.�����Ƿ�
 *  1)Ƽ����
 *  2)����
 *  3)�ڷΰ���
 * 2.�����Ƿ�
 *  1)�����
 *  2)ġ��
 *  3)�ڷΰ���
 * 3.����
 */

import java.util.Scanner;

public class Ch01_20_01 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	boolean run = true;
	
	while(run) {
		System.out.println("1.�����Ƿ�");
		System.out.println("2.�����Ƿ�");
		System.out.println("3.����");
		
		System.out.println("�޴�����");
		int sel = scan.nextInt();
		
		if(sel==1) {
			boolean exit = true;
			while(exit) {
				System.out.println("1)Ƽ����");
				System.out.println("2)����");
				System.out.println("3)�ڷΰ���");
				
				System.out.println("�޴�����");
				int sel2 = scan.nextInt();
				if(sel2==1||sel2==2) {
					System.out.println("����");
				}else if(sel2==3) {
					exit =false;
				}
			}
		}else if(sel==2) {
			boolean exit = true;
			while(exit) {
				System.out.println("1)Ƽ����");
				System.out.println("2)����");
				System.out.println("3)�ڷΰ���");
				
				System.out.println("�޴�����");
				int sel2 = scan.nextInt();
				if(sel2==1||sel2==2) {
					System.out.println("����");
				}else if(sel2==3) {
					exit =false;
				}
			}
		}else if(sel==3) {
			System.out.println("����");
			run = false;
		}

	}
	
	
	
	}
}
