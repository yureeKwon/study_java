package chapter04_06to10;

/*
 * # 문자열 속 숫자검사
 * 예) kldjsflj : 문자만 있다.
 * 예) 12365645 : 숫자만 있다.
 * 예) 5ds6f4s6 : 문자 숫자 섞여있다.
 */
import java.util.Scanner;

public class Ch04_07_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
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
			System.out.println("숫자만있다.");
		} else if (cntnum > 0 && cntnum < text.length()) {
			System.out.println("문자 숫자 섞임");
		} else if (cntnum == 0) {
			System.out.println("문자만 있다.");
		}

	}

}
