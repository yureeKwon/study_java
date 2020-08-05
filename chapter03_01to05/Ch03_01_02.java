package chapter03_01to05;
/*
 * 1 to 50[2단계] : 1 to 9
 * 1. arr배열에 1~9 사이의 숫자를 저장한다.
 * 2. shuffle을 통해 숫자를 섞는다.
 * 3. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
 * 4. 정답을 맞추면 해당 값은 0으로 변경되어 모든 값이 0이 되면 게임은 종료된다.
 */

import java.util.Scanner;
import java.util.Random;

public class Ch03_01_02 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		Random ran = new Random();
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int n=1;
		while(n<100) {
			int r = ran.nextInt(8);
			int temp = arr[0];
			arr[0] = arr[r];
			arr[r] = temp;
			n++;
		}
		boolean run = true;
		int cnt = 1;
		while(run) {
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}System.out.println();
			
			System.out.print(cnt+"의 위치 입력:");
			int idx = scan.nextInt();
			if(arr[idx]==cnt) {
				System.out.println("정답");
				arr[idx] = 0;
				cnt += 1;
			}else {
				System.out.println("땡");
				continue;
			}
			
			if(cnt==10) {
				System.out.println("종료");
				run = false;
			}
		}
		
		
	}

}
