package chapter01_16to20;
/*
 * # �����л�
 * 1.10ȸ �ݺ��� �Ѵ�.
 * 2.1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
 * 3.������ 60�� �̻��̸� �հݻ��̴�.
 * ------------------------------------- 
 * * ������(10��)�� ������ ����� ����Ѵ�.
 * * �հ��� ���� ����Ѵ�.
 * * 1�� �л��� ��ȣ�� ������ ����Ѵ�.
 */

import java.util.Random;

public class Ch01_19_02 {

	public static void main(String[] args) {

		Random ran = new Random();
		
		int num = 10;
		int cnt = 0;
		int tot = 0;
		int maxScore=0;
		int maxNum = 0;
		
		int i = 0;		
		while(i<num) {
			int score = ran.nextInt(100)+1;
			if(score>=60) {
				cnt += 1;
			}
			if(score>maxNum) {
				maxScore = score;
				maxNum = i+1;
			}
			tot += score;
			i++;
		}
		
		System.out.println("���� : "+tot+"��");
		System.out.println("��� : "+tot/num+"��");
		System.out.println("�հݻ�:"+cnt+"��");
		System.out.println("1�� :"+maxNum+"��-"+maxScore+"��");
		
		
	}
}
