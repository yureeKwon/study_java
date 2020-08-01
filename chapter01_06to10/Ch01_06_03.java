package chapter01_06to10;

/*
 * #up&down 게임 1단계
 * 1. com = 8
 * 2. me는 com의 숫자를 맞추는 게임이다.
 * 3. 다음과 같은 메세지를 출력한다.
 *  1)com이 me보다 크면 up
 *  2)같으면 bingo
 *  3)com이 me보다 작으면 down
  */
import java.util.Scanner;

public class Ch01_06_03 {

	public static void main(String[] args) {
		int com = 8;
		System.out.println("숫자를 입력");
		Scanner scan = new Scanner(System.in);
		int me = scan.nextInt();

		if (com > me) {
			System.out.println("up");
		} else if (com == me) {
			System.out.println("bingo");
		} else {
			System.out.println("down");
		}

	}

}
