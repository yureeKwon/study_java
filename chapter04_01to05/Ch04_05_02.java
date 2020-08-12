package chapter04_01to05;
/*
 * # 타자연습2단계
 */
import java.util.Scanner;
import java.util.Random;

public class Ch04_05_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String[] words = {"java", "mysql", "jsp", "spring"};

		int k=0;
		while(k<100) {
			int r = ran.nextInt(4);
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
			k++;
		}
		
		for(int i=0; i<4; i++) {
			int len = words[i].length();
			int r = ran.nextInt(len);
			System.out.print("문제:");
			for(int j=0; j<len; j++) {
				if(j==r) {
					System.out.print('*');
				}else {
					System.out.print(words[i].charAt(j));
				}
			}
			System.out.println();
			String input = scan.next();
			if(input.equals(words[i])) {
				continue;
			}else {
				i -= 1;
			}
		}
		
		
	}

}
