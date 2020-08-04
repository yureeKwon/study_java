package chapter02_06to10;

/*
 * # 소수찾기[2단계]
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 * 
 */
import java.util.Scanner;

public class Ch02_12_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = scan.nextInt();

		System.out.print(num+"이하 정수:");
		for(int i=2; i<num; i++) {
			int cnt = 0;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					cnt+=1;
				}
			}
			if(cnt==0) {
				System.out.print(i+" ");
			}
		}
		
		
	}

}
