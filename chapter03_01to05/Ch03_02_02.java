package chapter03_01to05;
/*
 * # EXIT ����
 * 1. game �迭���� exit������ ���� ���� ��ġ�� �Է��Ѵ�.
 * 2. ������ ���߸� exit������ 1 �����Ѵ�.
 * 3. exit ������ ���� 16�� �Ǹ� ������ ����ȴ�.
 */

import java.util.Scanner;

public class Ch03_02_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int exit = 10;

		int[] game = { 11, 15, 10, 14, 12, 13 };

		while(true) {
			for(int i=0; i<game.length; i++) {
				System.out.print(game[i]+" ");
			}System.out.println();
			
			System.out.println(exit+"��ġ�Է�:");
			int idx = scan.nextInt();
			
			if(game[idx]==exit) {
				exit += 1;
			}
			if(exit==16) {
				System.out.println("����");
				break;
			}
		}
		
	}

}
