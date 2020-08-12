package chapter04_06to10;

/*
 * # 문자열 비교
 * equals() 메서드 사용없이 문자의 일치여부 비교
 * 예) 코끼리
 * 입력 : 티라노사우르스
 * 출력 : false;
 */
import java.util.Scanner;

public class Ch04_06_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String name = "코끼리";

		System.out.print("동물이름을 입력하세요 : ");
		String myname = scan.next();
		
		int cnt = 0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)==myname.charAt(i)) {
				cnt+=1;
			}
		}
		
		if(cnt==name.length()) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		

	}

}
