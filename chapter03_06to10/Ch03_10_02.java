package chapter03_06to10;

/*
* # 문자열 [비교]
* 문자열 비교는 equals() 메서드를 통해 확인할 수 있다.
*/

import java.util.Scanner;

public class Ch03_10_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String name = "홍길동";

		System.out.print("이름을 입력하세요 : ");
		String myName = scan.next();

		if (name == myName) {
			System.out.println("== 연산자 : 일치");
		} else {
			System.out.println("== 연산자 : 불일치");
		}
//홍길동 똑같이 입력해도 ==연산자로는 일치여부 판단못함
		if (name.equals(myName)) { // A.equals(B) -> A랑B랑 같은지
			System.out.println("equals() 메서드 : 일치");
		} else {
			System.out.println("equals() 메서드 : 불일치");
		}
//String은 equals메서드로 비교해야 한다는 의미라는..
	}

}
