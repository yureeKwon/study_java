package chapter03_11to16;

/*
 * # �迭��ȭ ��� ����ã��
 */
import java.util.Scanner;

public class Ch03_13_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// ����1) 1~�鸸 ������ ���ڸ� �Է¹ް� ��� ���� ���
		// (�� ! ¦���ڸ��� ���� ¦���ڸ���� ���)
		// ��) 123 ==> 2
		// ��) 1234 ==> ¦���� �ڸ��̴�
		// ��) 1 ==> 1
		// ��) 1234567 ==> 4

		System.out.print("�����Է�:");
		int num = scan.nextInt();
		//987654 //98'7'65
		
		int arr[] = new int[6];
		int cnt = 0;
		for(int i=5; i>=0; i--) {
			arr[i] = (num%(10^(6-i)))/(10^(5-i));
			if(arr[i]!=0) {
				cnt += 1;
			}
		} 
		
		for(int i=0; i<6; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		if(cnt%2==0) {
			System.out.println("¦���ڸ��̴�.");
		}else if(cnt==1){
			System.out.println(arr[5]);
		}else if(cnt==3) {
			System.out.println(arr[4]);
		}else if(cnt==5) {
			System.out.println(arr[3]);
		}
		
		
		
	}

}
