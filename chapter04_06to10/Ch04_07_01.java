package chapter04_06to10;

/*
 * # ���ڿ� �� ���ڰ˻�
 * ��) kldjsflj : ���ڸ� �ִ�.
 * ��) 12365645 : ���ڸ� �ִ�.
 * ��) 5ds6f4s6 : ���� ���� �����ִ�.
 */
import java.util.Scanner;

public class Ch04_07_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�Է� : ");
		String text = scan.next();

		char[] numarr = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		int cntnum = 0;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			for (int j = 0; j < numarr.length; j++) {
				if (ch == numarr[j]) {
					cntnum += 1;
				}
			}
		}
		if (cntnum == text.length()) {
			System.out.println("���ڸ��ִ�.");
		} else if (cntnum > 0 && cntnum < text.length()) {
			System.out.println("���� ���� ����");
		} else if (cntnum == 0) {
			System.out.println("���ڸ� �ִ�.");
		}

	}

}
