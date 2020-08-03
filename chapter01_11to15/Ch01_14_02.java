package chapter01_11to15;

/*
 * # 서식문자 출력문
 *  %d : 정수
 *  %f : 소수
 *  %c : 문자1개
 *  %s : 문자 여러개
 */

public class Ch01_14_02 {
	public static void main(String[] args) {

		System.out.printf("%d",10);
		System.out.println();
		
		System.out.printf("%f\n",3.14);    // %f로 소수점 여섯번째까지 출력
		System.out.printf("%.2f\n",3.143); // %.2로 소수점 두번째자리까지
		
		System.out.printf("%c\n", 'b');    // %c로 문자 한개 출력
		System.out.printf("%s\n", "출력문의 이해");//&s로 문자열출력
		
		String fruit = "사과";
		int cnt = 5;
		System.out.printf("%s가 %d개 있습니다.\n", fruit, cnt);
	    
		//가독성을 위한 방법

	}
}
