package chapter02_06to10;
/*
 * #�����̵�[1�ܰ�]
 * 1.����2�� ĳ�����̴�.
 * 2.����1�� �Է��ϸ�, ĳ���Ͱ���������
 *   ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3.��, �¿쳡�� �������� ��, ����ó���� �ؾ��Ѵ�.
 */
import java.util.Scanner;

public class Ch02_06_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] game = {0, 0, 2, 0, 0, 0, 0};
		
		int player = 0;

		boolean run = true;
		while(run) {
			
			for(int i=0; i<game.length; i++) {
				System.out.print(game[i]+" ");
				if(game[i]==2) {
					player = i;
				}
			}
			System.out.println();
			System.out.print("�����Է�(1or2):");
			int dir = scan.nextInt();
			
			if(dir==1) {
				if(player==0) {
					System.out.println("���̻� �̵��Ұ�");
					continue;
				}else {
					game[player]=0;
					game[player-1]=2;
				}
			}else if(dir==2){
				if(player==6) {
					System.out.println("���̻� �̵��Ұ�");
					continue;
				}else {
					game[player]=0;
					game[player+1]=2;
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
	}
}
