package chapter01_06to10;
/*
 * #최대값 구하기[1단계]
 * 1.숫자3개를 입력받는다.
 * 2.입력받은 3개의 수를 비교하여,
 * 3.가장 큰 수(MAX)를 출력한다.
 */

import java.util.Scanner;

public class Ch01_09_02 {

	public static void main(String[] args) {
		// 값교체를 이용하는 방법 (코드가 간결해짐)

		Scanner scan = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력하세요");
		int x = scan.nextInt();

		System.out.println("두번째 숫자를 입력하세요");
		int y = scan.nextInt();

		System.out.println("세번째 숫자를 입력하세요");
		int z = scan.nextInt();

		int maxNum = x; // 맥스넘을 x으로 가정
		
		if(maxNum<y) {
			maxNum = y;
		}
		if(maxNum<z) {
			maxNum = z;
		}
		
		System.out.println("최대값:"+maxNum);
		

	}

}
