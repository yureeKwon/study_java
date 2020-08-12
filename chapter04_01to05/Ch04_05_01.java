package chapter04_01to05;
/*
 * # 타자연습 게임[1단계]
 * 1. 문제를 섞는다.(shuffle)
 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 * 예) 
 * 문제 : mysql
 * 입력 : mydb
 * 문제 : mysql
 * 입력 : mysql <- 문제 맞추면 다음문제 제시
 * 문제 : jsp
 */

import java.util.Scanner;
import java.util.Random;

public class Ch04_05_01 {

	public static void main(String[] args) {
		String[] words = { "java", "mysql", "jsp", "spring" };

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int k = 0;
		while(k<100) {
			int r = ran.nextInt(4);
			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
			k++;
		}

		for(int i=0; i<words.length; i++) {
			System.out.println("문제:"+words[i]);
			System.out.print("입력:");
			String input = scan.next();
			if(words[i].equals(input)) {
				continue;
			}else {
				i-=1;
			}
		}
	}

}
