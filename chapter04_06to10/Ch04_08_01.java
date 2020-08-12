package chapter04_06to10;
/*
 * # nextLine()과 next()의 차이
 * 1. nextLine() : 문장 한라인 전체를 입력받는다.
 * 2. next() : 공백을 기준으로 한단어씩 입력받는다. 
 */
import java.util.Scanner;
public class Ch04_08_01 {

	public static void main(String[] args) {

		/*
		 * # hello java 입력시,
		 * nextLine() 메서드는 Hello Java 모두 출력되지만,
		 * next() 메서드는 Hello만 출력된다.
		 */

		Scanner scan = new Scanner(System.in);
		
		//nextLine()
		System.out.print("이름 입력 : ");
		String name = scan.nextLine();       // Los Angeles
		System.out.println(name);            // Los Angeles
		
		//next()
		System.out.print("이름 입력 : ");  
		name = scan.next();                 // Los Angeles
		System.out.println(name);           // Los


		
	}
}
