package chapter04_01to05;

/*
 * # 끝말잇기 게임
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * ...
 */
import java.util.Scanner;

public class Ch04_04_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String start = "자전거";
		
		
		boolean run = true;
		while(run) {
			System.out.println("제시어:"+start);
			char lastword = start.charAt(start.length()-1);
			System.out.print("입력:");
			String input = scan.next();
			char firstword = input.charAt(0);
			if(lastword!=firstword) {
				System.out.println("다시입력");
				continue;
			}else {
				start = input;
			}
		}

	}

}
