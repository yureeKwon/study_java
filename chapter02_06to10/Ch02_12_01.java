package chapter02_06to10;

/*
 * # �Ҽ�ã��[2�ܰ�]
 * ���� �� ���� �Է¹޾�, 2���� �ش� ���ڱ����� ��� �Ҽ� ���
 * ��)
 * �Է� : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 * 
 */
import java.util.Scanner;

public class Ch02_12_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num = scan.nextInt();

		System.out.print(num+"���� ����:");
		for(int i=2; i<num; i++) {
			int cnt = 0;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					cnt+=1;
				}
			}
			if(cnt==0) {
				System.out.print(i+" ");
			}
		}
		
		
	}

}
