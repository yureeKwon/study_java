package chapter03_01to05;
/*
 * # �ִ밪 ���ϱ�[3�ܰ�]
 * 1. ���� ū ���� ã�� �Է��Ѵ�.
 * 2. �����̸� �ش� ���� 0���� �����Ѵ�.
 * 3. arr�迭�� ��� ���� 0���� ����Ǹ� ���α׷��� ����ȴ�.
 * ��)
 * 11, 87, 42, 100, 24
 * �Է� 100
 * 11, 87, 42, 0, 24
 * �Է� : 87
 * 11, 0, 42, 0, 24
 */

import java.util.Scanner;

public class Ch03_01_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = {11, 87, 42, 100, 24};
		int cnt = 0;

		while(cnt<5) {
			int maxNum = 0;
			int maxidx = -1;
			for(int i=0; i<arr.length; i++) {
				if(arr[i]>maxNum) {
					maxNum = arr[i];
					maxidx = i;
				}
			}
			System.out.print("�ִ밪�Է�:");
			int input = scan.nextInt();
			if(input==maxNum) {
				arr[maxidx] = 0;
				cnt += 1;
			}
			if(cnt==5) {
				System.out.println("����");
				break;
			}
		}
		
	}

}
