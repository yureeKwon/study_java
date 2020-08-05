package chapter03_06to10;

import java.util.Scanner;
/*
 * # ��ٸ� ����
 * 1. 0�� ������ �Ʒ��� ��������.
 * 2. 1�� ������ �¿츦 �˻��� 1�� ������ �̵� �� �Ʒ��� ��������.
 * 3. x�� ��ġ�� �Է¹ް� ��ٸ��� ǥ���Ѵ�.
 */
public class Ch03_09_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int ladder[][] = {
				{0, 0, 0, 0, 0},
				{1, 1, 0, 1, 1}, 
				{0, 1, 1, 0, 0},
				{0, 0, 1, 1, 0}, 
				{1, 1, 0, 0, 0}, 
				{0, 1, 1, 0, 0}, 
				{1, 1, 0, 0, 0}, 
				{0, 0, 0, 1, 1}, 
				{0, 0, 0, 0, 0}
		};
		
		
		
		//1.��ٸ����
		System.out.println("  === ��ٸ� ===");
		for(int i=0; i<ladder.length; i++) {
			for(int j=0; j<ladder[i].length; j++) {
				if(ladder[i][j]==0) {
					System.out.print("��");
				}else if(ladder[i][j]==1) {
					if(j!=0&&ladder[i][j-1]==1) {
						System.out.print("��");
					}
					else if(j!=ladder[i].length-1&&ladder[i][j+1]==1) {
						System.out.print("��");
					}
				}
			}
			System.out.println();
		}
		
		//2.������ġ����
		int y = 0;//������([i][j]�� x)
		int x = 0;//������([i][j]�� j)
		System.out.print("0~4�Է�:");
		x = scan.nextInt();
		
		for(int i=0; i<ladder.length; i++) {
			if(ladder[y][x]==0) {
				y += 1; // ���پƷ���
			}else if(ladder[y][x]==1) {
				if(x!=0&&ladder[y][x-1]==1) {
					x -= 1;
				}
				else if(x!=ladder[i].length-1&&ladder[y][x+1]==1) {
					x += 1;
				}
				y += 1;
			}
		}
		System.out.println("��ٸ����");
		System.out.println("������"+y+"��° ����");
		System.out.println(x+"��");
		
	}

}
