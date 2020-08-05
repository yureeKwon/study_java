package chapter03_01to05;
/*
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고
 *    숫자 10~19는 back 배열에 저장한다.
 */

import java.util.Scanner;
import java.util.Random;

public class Ch03_04_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] front = new int[9];
		int[] back = new int[9];
		//123456798 101112131415161718 넣기
		for(int i=0; i<9; i++) {
			front[i] = i+1;
			back[i] = i+10;
		}
		//셔플
		int n=0;
		while(n<100) {
			int r = ran.nextInt(9);
			
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
			
			temp = back[0];
			back[0] = back[r];
			back[r] = temp;
			
			n++;
		}
		
		//게임진행
		int k = 1;
		while(true) {
			//출력
			for(int i=0; i<9;i++) {
				System.out.print("\t"+front[i]);
				if(i%3==2) {
					System.out.println();
				}
			}
			
			if(k==19) {
				System.out.println("종료");
				break;
			}
			
			System.out.print(k+"의 위치입력:");
			int idx = scan.nextInt();
			
//			if(k<10) {
//				if(front[idx]==k) {
//					front[idx] = back[idx];
//					k=k+1;
//				}
//			}else if(k>=10) {
//				if(front[idx]==k) {
//					front[idx]=0;
//					k=k+1;
//				}
//			}
			//위에 주석처리한거 아래처럼 간결하게
			if(front[idx]==k) {
				if(k<10) {
					front[idx]=back[idx];
				}else {
					front[idx]=0;
				}
				k += 1;
			}
			
		}
		
		
		

	}

}
