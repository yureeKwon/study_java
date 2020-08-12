package chapter04_06to10;

/*
 * # 단어검색
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true, 존재하지 않으면 false를 출력한다.
 */
import java.util.Scanner;

public class Ch04_09_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);

		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		
		char[] arr = new char[text.length()];
		for(int i=0; i<text.length(); i++) {
			arr[i] = text.charAt(i);
		}
		
		int check = -1;
		int size = word.length();
		
		for(int i=0; i<text.length()-(size-1); i++) {
			int cnt = 0;
			for(int j=0; j<size; j++) {
				if(arr[i+j]==word.charAt(j)) {
					cnt+=1;
				}
			}
			if(cnt == size) {
				check = 1;
			}
		}
		if(check==1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		

	}

}
