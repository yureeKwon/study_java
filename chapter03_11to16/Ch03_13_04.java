package chapter03_11to16;

import java.util.Scanner;

/*
 * # �Ҽ�ã��[3�ܰ�]
 * 1. ���� �� ���� �Է� �޴´�.
 * 2. �Է¹��� ���ں��� ū ù��° �Ҽ��� ����Ѵ�.
 * 
 * ��) enter number : 1000
 * 1000���� ū ù��° �Ҽ� : 1009
 * ��) enter number : 500
 *  500���� ū ù��° �Ҽ� : 503 
 */

public class Ch03_13_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("�����Է�:");
		int num = scan.nextInt();
		
		for(int i=num+1; num<i;i++) {
			int cnt=0;
			for(int j=2; j<i;j++) {
				if(i%j==0) {
					cnt += 1;
				}
			}
			if(cnt==0) {
				System.out.println(num+"���� ū ù��°�Ҽ�:"+i);
				break;
			}
		}
		
		
	}

}
