package chapter03_01to05;

/*
 * �����̵�[2�ܰ�]
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3.�� �¿� ���� ���������� ����ó���� �ؾ��Ѵ�.
 * 4. ����1�� ���̴�. ���� ������ �̵��� �� ����.
 * 5. �� ����3�� �Է��ϸ� ���� ������ �� �ִ�.
 *  
 */
import java.util.Scanner;

public class Ch03_02_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] game = { 0, 0, 1, 0, 2, 0, 0, 1, 0 };

		int player = 0;

		
		
		boolean run = true;
		while(run) {
			//1.���
			for(int i=0; i<game.length; i++) {
				if(game[i]==2) {
					player = i;
					System.out.print("[��]");
				}else if(game[i]==1) {
					System.out.print("[��]");
				}else {
					System.out.print("[ ]");
				}
			}System.out.println();
			//2.��������
			System.out.print("�����Է�:");
			int move = scan.nextInt();
			
			if(move==1) {
				if(player==0) {
					System.out.println("���̻��̵��Ұ�");
					continue;
				}else if(game[player-1]==1) {
					System.out.println("[����]3�Է�");
					int punch = scan.nextInt();
					if(punch==3) {
						game[player]=0;
						player -= 1;
						game[player]=2;
					}
				}else {
					game[player]=0;
					player -= 1;
					game[player] = 2;
				}
				
			}else if(move==2) {
				if(player==8) {
					System.out.println("���̻��̵��Ұ�");
					continue;
				}else if(game[player+1]==1) {
					System.out.println("[����]3�Է�");
					int punch = scan.nextInt();
					if(punch==3) {
						game[player]=0;
						player += 1;
						game[player]=2;
					}
				}else {
					game[player]=0;
					player += 1;
					game[player] = 2;
				}
				
			}
		}
		
	}

}
