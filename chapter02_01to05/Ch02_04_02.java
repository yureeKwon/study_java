package chapter02_01to05;
/*
 * # �ߺ����� ����[1�ܰ�]
 * 1. 0~4 ������ ���ڸ� arr �迭�� �����Ѵ�.
 * 2. ��, �ߺ��Ǵ� ���ڴ� ����� �Ѵ�.
 * ��Ʈ)�������ڸ� check �迭�� �ε����� Ȱ���Ѵ�.
 * ��)
 * 
 * ��������:1
 * check = {0, 1, 0, 0, 0}
 * arr = {1, 0, 0, 0, 0}
 * 
 * ��������:3 
 * check = {0, 1, 0, 1, 0}
 * arr = {1, 3, 0, 0, 0}
 */

import java.util.Random;

public class Ch02_04_02 {

	public static void main(String[] args) {

		Random ran = new Random();
		
		int[] check = new int[5];
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = ran.nextInt(5);
			if(check[arr[i]]==1) {
				i--;
			}else if(check[arr[i]]==0){
				check[arr[i]]=1;
			}
		}
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
