package chapter01_01to05;
import java.util.Scanner;
/*
 * # 입력받기
 * 1. import java.util.Scanner;
 * 		java.util패키지 안의 Scanner클래스 파일을
 * 		현재 페이지로 불러온다.
 * 2. scan 변수 설정
 * 		Scanner scan = new Scanner(System.in);
 * 3. 안내문 작성
 * 	System.out.println("나이를 입력하세요 : ");
 * 4. 입력받기
 * 		int age = scan.nextInt();
 * 
 */
public class Ch01_05_01 {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		
		System.out.println("입력하신 숫자는 "+ num + "입니다.");
		
		System.out.println("나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.println("당신의 나이는 " + age + "세이군요!");
		
	}
}
