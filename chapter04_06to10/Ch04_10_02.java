package chapter04_06to10;

/*
 * # ����(Exception)ó��
 */
import java.util.Scanner;

public class Ch04_10_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("[������]����1 �Է� : ");
		int num1 = scan.nextInt();

		System.out.println("[������]����2 �Է� : ");
		int num2 = scan.nextInt();
		
//		if(num2==0) {
//			System.out.println("0���� ���� �� ����.");
//		}else {
//			System.out.println(num1/num2);
//		}
//		System.out.println("----------------");
		
		try {
			System.out.println(num1/num2);
		}catch(Exception e) {
			System.out.println("0���� ������");
		}finally {
			System.out.println("����� ���ܹ߻��� ������� ������ ������ ������ ���´�.");
		}
		
		

	}

}
