package chapter01_16to20;

import java.util.Scanner;

/*
 * # �ִ밪 ���ϱ�[2�ܰ�]
 * 1. 3ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
 * 2. �Է¹��� 3���� ���� �� ���� ū ���� ����Ѵ�.
 */

public class Ch01_19_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int maxNum = 0;
		
		int i = 0;
		while(i<3) {
			System.out.print("���� �Է� : ");
			int num = scan.nextInt();
			
			if(maxNum<num) {
				maxNum = num;
			}
			i++;
		}
		System.out.println("�ִ밪 : "+maxNum);
		
		
		
		
	}

}
