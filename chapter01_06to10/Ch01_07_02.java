package chapter01_06to10;

/*
 * # 로그인[1단계]
 * 1. ID와 PW를 입력 받는다. 
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 * 예) 로그인 성공 or 로그인 실패
 */
import java.util.Scanner;

public class Ch01_07_02 {

	public static void main(String[] args) {
		
		int dbID = 1234;
		int dbPW = 1111;
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("ID PW 입력하세요");

        int myID = scan.nextInt();
        int myPW = scan.nextInt();
		
		if(myID == dbID) {
			if(myPW == dbPW) {
				System.out.println("로그인 성공");
			}else{
				System.out.println("로그인 실패");
			}
		}else {
			System.out.println("로그인 실패");
		}
		

	}

}
