package chapter02_06to10;
/*
 * # ���� ����
 * 1. ���� ������ ��ġ�� 2�� �Է��� ������ ���ߴ� �����̴�.
 * 2. ������ ���߸� back�� �ش���ڸ� ������,
 *    back�� ��� ���� ä������ ������ ����ȴ�.
 */
import java.util.Random;
import java.util.Scanner;

public class Ch02_06_02 {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		
		//shuffle
		int i = 0;
		while(i<100) {
			int r = ran.nextInt(10);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			i++;
		}
		
		
		i=0;
		while(i<5) {
			System.out.print("front:");
			for(int j=0; j<front.length; j++) {
				System.out.print(front[j]+" ");
			}System.out.println();
			
			System.out.print("back:");
			for(int j=0; j<front.length; j++) {
				System.out.print(back[j]+" ");
			}System.out.println();
			
			System.out.print("�ε���1�Է�:");
			int idx1 = scan.nextInt();
			System.out.print("�ε���2�Է�:");
			int idx2 = scan.nextInt();
			
			if(front[idx1]==front[idx2]) {
				System.out.println("����");
				back[idx1]=front[idx1];
				back[idx2]=front[idx2];
			}
			i = i + 1;
			
		}
		
		
		
		
		
	}
}
