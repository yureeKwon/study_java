package chapter03_01to05;
/*
 * 1 to 50[2�ܰ�] : 1 to 9
 * 1. arr�迭�� 1~9 ������ ���ڸ� �����Ѵ�.
 * 2. shuffle�� ���� ���ڸ� ���´�.
 * 3. ����ڴ� 1���� ������� �ش� ��ġ ���� �Է��Ѵ�.
 * 4. ������ ���߸� �ش� ���� 0���� ����Ǿ� ��� ���� 0�� �Ǹ� ������ ����ȴ�.
 */

import java.util.Scanner;
import java.util.Random;

public class Ch03_01_02 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		Random ran = new Random();
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int n=1;
		while(n<100) {
			int r = ran.nextInt(8);
			int temp = arr[0];
			arr[0] = arr[r];
			arr[r] = temp;
			n++;
		}
		boolean run = true;
		int cnt = 1;
		while(run) {
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}System.out.println();
			
			System.out.print(cnt+"�� ��ġ �Է�:");
			int idx = scan.nextInt();
			if(arr[idx]==cnt) {
				System.out.println("����");
				arr[idx] = 0;
				cnt += 1;
			}else {
				System.out.println("��");
				continue;
			}
			
			if(cnt==10) {
				System.out.println("����");
				run = false;
			}
		}
		
		
	}

}
