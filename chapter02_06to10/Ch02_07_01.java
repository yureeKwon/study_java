package chapter02_06to10;
/*
 * # 1 to 50[1�ܰ�] : 1 to 4
 * 1. arr �迭�� 1~4 ������ ���ڸ� �ߺ����� �����Ѵ�.
 * 2. ����ڴ� 1���� ������� �ش� ��ġ ���� �Է��Ѵ�.
 * 3. ������ ���߸� �ش� ���� 9�� ����Ǿ� ��� ���� 9�� �Ǹ� ������ ����ȴ�.
 * ��)
 * 4 2 3 1
 * �Է� : 3
 * 4 2 3 9
 * �Է� : 1
 * 4 9 3 9
 */

import java.util.Scanner;
import java.util.Random;

public class Ch02_07_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int[] arr = {1, 2, 3, 4};
		int[] check = new int[4];
		int i = 0;

		while(i<100) {
			int r = ran.nextInt(4);
			int temp = arr[0];
			arr[0] = arr[r];
			arr[r] = temp;
			i++;
		}
		
		int num = 1;
		while(num<5) {
			
			for(i=0; i<4; i++) {
				System.out.print(arr[i]+" ");
			}System.out.println();
			System.out.print(num+"�� ��ġ �Է�:");
			int idx = scan.nextInt();
			
			if(arr[idx]==num) {
				check[idx] = num;
				num++;
				arr[idx] = 9;
			}
			
		}
		
		
	}
}
