package chapter04_06to10;
/*
 * # nextLine()�� next()�� ����
 * 1. nextLine() : ���� �Ѷ��� ��ü�� �Է¹޴´�.
 * 2. next() : ������ �������� �Ѵܾ �Է¹޴´�. 
 */
import java.util.Scanner;
public class Ch04_08_01 {

	public static void main(String[] args) {

		/*
		 * # hello java �Է½�,
		 * nextLine() �޼���� Hello Java ��� ��µ�����,
		 * next() �޼���� Hello�� ��µȴ�.
		 */

		Scanner scan = new Scanner(System.in);
		
		//nextLine()
		System.out.print("�̸� �Է� : ");
		String name = scan.nextLine();       // Los Angeles
		System.out.println(name);            // Los Angeles
		
		//next()
		System.out.print("�̸� �Է� : ");  
		name = scan.next();                 // Los Angeles
		System.out.println(name);           // Los


		
	}
}
