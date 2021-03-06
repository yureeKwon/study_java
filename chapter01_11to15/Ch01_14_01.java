package chapter01_11to15;
/*
 * # 출력문의 종류
 * 1. System.out.println();
 *  1)ln = new line
 *  2)줄바꿈 가능
 * 2. System.out.print();
 *  1)줄바꿈 불가
 * 3. System.out.printf();
 *  1)서식문자 출력
 *  2)종류 
 *  %d : 정수
 *  %f : 소수
 *  %c : 문자1개
 *  %s : 문자 여러개
 */

public class Ch01_14_01 {

	public static void main(String[] args) {

		/*
		 * 이스케이프 문자(escape sequence)
		 * 1) \n : 줄바꿈
		 * 2) \t : tab
		 * 3) \" : "
		 * 4) \' : '
		 */
		
		System.out.println("안녕\n하세요");
		System.out.println("안녕\t하세요");
		System.out.println(" \"안녕하세요\" ");
		System.out.println(" \'안녕하세요\' ");
		
	}

}
