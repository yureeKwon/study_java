package chapter04_01to05;
/*
 * # Ÿ�ڿ��� ����[1�ܰ�]
 * 1. ������ ���´�.(shuffle)
 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
 * ��) 
 * ���� : mysql
 * �Է� : mydb
 * ���� : mysql
 * �Է� : mysql <- ���� ���߸� �������� ����
 * ���� : jsp
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
			System.out.println("����:"+words[i]);
			System.out.print("�Է�:");
			String input = scan.next();
			if(words[i].equals(input)) {
				continue;
			}else {
				i-=1;
			}
		}
	}

}
