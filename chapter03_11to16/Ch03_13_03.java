package chapter03_11to16;

/*
 * # 배열심화 가운데 숫자찾기
 */
import java.util.Scanner;

public class Ch03_13_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 문제1) 1~백만 사이의 숫자를 입력받고 가운데 숫자 출력
		// (단 ! 짝수자리의 수는 짝수자리라고 출력)
		// 예) 123 ==> 2
		// 예) 1234 ==> 짝수의 자리이다
		// 예) 1 ==> 1
		// 예) 1234567 ==> 4

		System.out.print("숫자입력:");
		int num = scan.nextInt();
		//987654 //98'7'65
		
		int arr[] = new int[6];
		int cnt = 0;
		for(int i=5; i>=0; i--) {
			arr[i] = (num%(10^(6-i)))/(10^(5-i));
			if(arr[i]!=0) {
				cnt += 1;
			}
		} 
		
		for(int i=0; i<6; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		if(cnt%2==0) {
			System.out.println("짝수자리이다.");
		}else if(cnt==1){
			System.out.println(arr[5]);
		}else if(cnt==3) {
			System.out.println(arr[4]);
		}else if(cnt==5) {
			System.out.println(arr[3]);
		}
		
		
		
	}

}
