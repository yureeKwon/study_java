package chapter02_06to10;
/*
 * # 1 to 50[1단계] : 1 to 4
 * 1. arr 배열에 1~4 사이의 숫자를 중복없이 저장한다.
 * 2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
 * 예)
 * 4 2 3 1
 * 입력 : 3
 * 4 2 3 9
 * 입력 : 1
 * 4 9 3 9
 */

import java.util.Scanner;
import java.util.Random;

public class Ch02_07_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int[] arr = {1, 2, 3, 4};
		int[] check = new int[4];
		int i = 0;

		while(i<100) {
			int r = ran.nextInt(4);
			int temp = arr[0];
			arr[0] = arr[r];
			arr[r] = temp;
			i++;
		}
		
		int num = 1;
		while(num<5) {
			
			for(i=0; i<4; i++) {
				System.out.print(arr[i]+" ");
			}System.out.println();
			System.out.print(num+"의 위치 입력:");
			int idx = scan.nextInt();
			
			if(arr[idx]==num) {
				check[idx] = num;
				num++;
				arr[idx] = 9;
			}
			
		}
		
		
	}
}
