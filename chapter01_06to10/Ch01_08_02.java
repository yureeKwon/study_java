package chapter01_06to10;
/*
 * #놀이기구 이용제한
 * 1. 키를 입력받는다.
 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
 *    예) 부모님과 함께 오셨나요?(yes:1 , no:0)
 * 
 */

import java.util.Scanner;

public class Ch01_08_02 {

	public static void main(String[] args) {
		// 14:09 ~ 14:19 (10분)

		Scanner scan = new Scanner(System.in);

		System.out.println("키를 입력하세요.");
		int height = scan.nextInt();

		if (height >= 120) {
			System.out.println("놀이기구 이용이 가능합니다.");
		} else {
			System.out.println("부모님과 함께 오셨나요? (yes:1 , no:0)");
			int ans = scan.nextInt();
			if (ans == 1) {
				System.out.println("놀이기구 이용이 가능합니다.");
			}
			if (ans == 0) {
				System.out.println("놀이기구 이용이 불가능합니다.");
			}
		}

	}

}
