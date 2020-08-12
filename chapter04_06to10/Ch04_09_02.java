package chapter04_06to10;
/*
 * # �ܾ� ��ü�ϱ�(replace)
 * 1. text���� ���� �ӿ��� �����ϰ� ���� �ܾ �Է¹޾�,
 * 2. ��ü���ִ� ����� �����Ѵ�.
 * ��) 
 * Life is too short.
 * �����ϰ� ���� �ܾ� �Է�: Life
 * �ٲ� �ܾ� �Է� : Time
 * Time is too short.
 */

import java.util.Scanner;

public class Ch04_09_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		System.out.print("�����ϰ� ���� �ܾ� �Է� : ");
		String word = scan.next();

		char[] arr = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			arr[i] = text.charAt(i);
		}

		int size = word.length();
		int check = -1;
		int idx = 0;
		for (int i = 0; i < arr.length - (word.length() - 1); i++) {
			int cnt = 0;
			for (int j = 0; j < word.length(); j++) {
				if (arr[i + j] == word.charAt(j)) {
					cnt = cnt + 1;
				}
			}
			if (cnt == word.length()) {
				idx = i;
				check = 1;
			}
		}

		if (check == 1) {
			int firstidx = idx;
			int lastidx = idx + size;

			int leng = lastidx - firstidx + 1;

			System.out.print("�ٲ� �ܾ� �Է� : ");
			String change = scan.next();
			int length = change.length();

			char[] temp = arr;

			String front = "";

			for (int i = 0; i < firstidx; i++) {
				front = front + temp[i];
			}
			System.out.println(front);

			String back = "";
			for (int i = lastidx; i < temp.length; i++) {
				back = back + temp[i];
			}
			System.out.println(back);

			String result = front + change + back;
			System.out.println(result);

		} else {
			System.out.println("�ش� �ܾ�� �������� �ʽ��ϴ�");
		}

	}

}
