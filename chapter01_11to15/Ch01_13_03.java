package chapter01_11to15;
/*
 * # ������ ��ȣ ���߱� ����
 * 1. 1~10 ������ ���� ���� 2���� �����Ѵ�.
 * 2. 1~4 ������ ���� ���� 1���� �����Ѵ�.
 * 3. �� ���ڴ� ������ ��ȣ�� �ش�ȴ�.
 *  1) ���� 2)���� 3)���� 4)������
 * 4. ����ڴ� ������ ��ȣ�� ���ߴ� �����̴�.
 *  ��) 3 ? 4 = 7
 *   1) + 2) - 3) * 4) %
 *   ���� : 2��
 */

import java.util.Scanner;
import java.util.Random;

public class Ch01_13_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int x = ran.nextInt(10)+1;
		int y = ran.nextInt(10)+1;
		int z = ran.nextInt(4)+1;
		
		int ans = 0;
		
		if(z==1) {
			ans = x+y;			
		}else if(z==2) {
			ans = x-y;
		}else if(z==3) {
			ans = x*y;
		}else if(z==4) {
			ans = x/y;
		}
		System.out.println(x+" ? "+y+" = "+ans);
		System.out.println("�����ȣ �� �Է�:");
		int meanswer = scan.nextInt();
		
		if(meanswer==z) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
	}

}
