package chapter01_06to10;
/*
 * # ��÷����[1�ܰ�] 30%�� ��÷Ȯ�� 
 */

import java.util.Random;
import java.util.Scanner;

public class Ch01_10_03 {

	public static void main(String[] args) {
		// 13:12 ~ 13:17 (5��)

		Random ran = new Random();

		int rNum = ran.nextInt(10);

		if (rNum < 3) {
			System.out.println("��÷");
		}
		if (rNum >= 3) {
			System.out.println("��÷");
		}

	}

}
