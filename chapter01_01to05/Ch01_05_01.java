package chapter01_01to05;
import java.util.Scanner;
/*
 * # �Է¹ޱ�
 * 1. import java.util.Scanner;
 * 		java.util��Ű�� ���� ScannerŬ���� ������
 * 		���� �������� �ҷ��´�.
 * 2. scan ���� ����
 * 		Scanner scan = new Scanner(System.in);
 * 3. �ȳ��� �ۼ�
 * 	System.out.println("���̸� �Է��ϼ��� : ");
 * 4. �Է¹ޱ�
 * 		int age = scan.nextInt();
 * 
 */
public class Ch01_05_01 {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = scan.nextInt();
		
		System.out.println("�Է��Ͻ� ���ڴ� "+ num + "�Դϴ�.");
		
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = scan.nextInt();
		System.out.println("����� ���̴� " + age + "���̱���!");
		
	}
}
