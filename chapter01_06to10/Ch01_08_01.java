package chapter01_06to10;

/*
 * #성적 유효성 검사
 * 1. 성적을 입력 받는다.
 * 2. 성적이 60점 이상이면 합격, 60점 미만이면 불합격이다.
 * 3. 단, 입력받은 성적이 
 *    음수이거나 100점을 초과하면 예외 메세지를 출력한다.
 *    예) 성적을 잘못 입력했습니다. 
 */
import java.util.Scanner;

public class Ch01_08_01 {

	public static void main(String[] args) {
		// 14:01 ~ 14:06 (5분)

		Scanner scan = new Scanner(System.in);

		System.out.println("성적을 입력하세요");
		int score = scan.nextInt();

		if(score>=60) {
			if(score<=100) {
			System.out.println("합격");
			}else {System.out.println("잘못입력");}
		}
		else if(score<60) {
			if(score>=0) {
				System.out.println("불합격");
			}else {System.out.println("잘못입력");}
		}

	}

}
