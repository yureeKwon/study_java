package chapter03_01to05;
/*
 * # 최대값 구하기[3단계]
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 0으로 변경한다.
 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 100
 * 11, 87, 42, 0, 24
 * 입력 : 87
 * 11, 0, 42, 0, 24
 */

import java.util.Scanner;

public class Ch03_01_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = {11, 87, 42, 100, 24};
		int cnt = 0;

		while(cnt<5) {
			int maxNum = 0;
			int maxidx = -1;
			for(int i=0; i<arr.length; i++) {
				if(arr[i]>maxNum) {
					maxNum = arr[i];
					maxidx = i;
				}
			}
			System.out.print("최대값입력:");
			int input = scan.nextInt();
			if(input==maxNum) {
				arr[maxidx] = 0;
				cnt += 1;
			}
			if(cnt==5) {
				System.out.println("종료");
				break;
			}
		}
		
	}

}
