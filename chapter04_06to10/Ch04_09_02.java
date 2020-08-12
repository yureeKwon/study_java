package chapter04_06to10;
/*
 * # 단어 교체하기(replace)
 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
 * 2. 교체해주는 기능을 구현한다.
 * 예) 
 * Life is too short.
 * 변경하고 싶은 단어 입력: Life
 * 바꿀 단어 입력 : Time
 * Time is too short.
 */

import java.util.Scanner;

public class Ch04_09_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		System.out.print("변경하고 싶은 단어 입력 : ");
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

			System.out.print("바꿀 단어 입력 : ");
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
			System.out.println("해당 단어는 존재하지 않습니다");
		}

	}

}
