package chapter02_01to05;

import java.util.Random;

/*
 * # OMRī��
 * 1. �迭 answer�� ���蹮���� �������̴�.
 * 2. �迭 hgd�� 1~5 ������ �������� 5���� �����Ѵ�.
 * 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�.
 * 4. �ѹ����� 20���̴�.
 * 
 * ��)
 * answer = {1, 3, 4, 2, 5}
 * hgd = {1, 1, 4, 4, 3}
 * ����ǥ = {o, x, o, x, x}
 * ���� = 40�� 
 */

public class Ch02_03_01 {

	public static void main(String[] args) {
		// 13:08 ~ 13:27��(19��)

		Random ran = new Random();

		// hgd ����------------

		int[] answer = { 1, 3, 4, 2, 5 };                       
		int[] hgd = new int[5];
		
		int cnt = 0;
		int score = 0;
		
		System.out.print("����ǥ = [");
		for(int i=0; i<5; i++) {
			hgd[i] = ran.nextInt(5)+1;
			if(answer[i]==hgd[i]) {
				System.out.print("O ");
				cnt += 1;
			}else {
				System.out.print("X ");
			}
		}
		System.out.println("]");
		score = cnt*20;
		System.out.println("���� : "+score+"��");

	}

}
