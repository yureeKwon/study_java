package chapter03_06to10;

/*
 * # 문자열
 * 숫자나 영어단어 입력시 커서를 옮길 필요가 없다.
 * 단 한글 입력시 반드시 커서를 끝으로 옮긴 후 작성해야 한다.
 */
import java.util.Scanner;

public class Ch03_10_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("한글이름을 입력하세요 : ");
		String name = scan.next(); // 한글입력가능
		

		System.out.println("name : " + name);

	}
}
