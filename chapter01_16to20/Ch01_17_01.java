package chapter01_16to20;
/*
 * # ATM[2�ܰ�]
 * 1. �α���
 * �α��� �� ��α��� �Ұ�
 * �α׾ƿ� ���¿����� �̿� ����
 * 2. �α׾ƿ�
 * �α��� �� �̿밡��
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
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("0.����");
			
			System.out.print("�޴����� : ");
			int sel = scan.nextInt();
			
			if(sel==1) {
				if(log==-1) {
					System.out.print("���¹�ȣ�Է�:");
					int id = scan.nextInt();
					System.out.print("����Է�:");
					int pw = scan.nextInt();
					
					if(id==dbAcc1&&pw==dbPw1) {
						System.out.println("1�� �α��μ���");
						log = 1;
					}else if(id==dbAcc1&&pw==dbPw1) {
						System.out.println("2�� �α��μ���");
						log = 2;
					}else {
						System.out.println("�α��� ���� �ٽ�Ȯ��");
					}
				}else if(log==1){
					System.out.println("1���� �α�����");
				}else if(log==2) {
					System.out.println("2���� �α�����");
				}
			}else if(sel==2) {
				if(log!=-1) {
					log = -1;
					System.out.println("�α׾ƿ� �Ϸ�");
				}else if(log==-1){
					System.out.println("�α��� �� �̿밡��");
				}
			}else if(sel==0) {
				System.out.println("���α׷�����");
				run = false;
			}else {
				System.out.println("�޴� �ٽ� �Է�");
			}
		}
		
		
	}
}
