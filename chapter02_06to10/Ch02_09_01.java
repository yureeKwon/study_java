package chapter02_06to10;
/*
 * # 배열 컨트롤러[1단계] : 추가
 */

import java.util.Scanner;

public class Ch02_09_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 0, 0, 0 };
		int cnt = 2;

		boolean run = true;
		while(run) {
			for(int i=0; i<cnt; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			System.out.println("[1]추가");
			System.out.print("메뉴선택:");
			int sel = scan.nextInt();
			if(sel==1) {
				if(cnt==5) {
					System.out.println("더이상추가불가능");
					continue;
				}
				System.out.print("추가할값입력:");
				int data = scan.nextInt();
				arr[cnt] = data;
				cnt += 1;
			}
		}

	}
}
