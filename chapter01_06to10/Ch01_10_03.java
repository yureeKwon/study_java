package chapter01_06to10;
/*
 * # ´çÃ·º¹±Ç[1´Ü°è] 30%ÀÇ ´çÃ·È®·ü 
 */

import java.util.Random;
import java.util.Scanner;

public class Ch01_10_03 {

	public static void main(String[] args) {
		// 13:12 ~ 13:17 (5ºÐ)

		Random ran = new Random();

		int rNum = ran.nextInt(10);

		if (rNum < 3) {
			System.out.println("´çÃ·");
		}
		if (rNum >= 3) {
			System.out.println("³«Ã·");
		}

	}

}
