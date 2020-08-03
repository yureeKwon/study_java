package chapter02_01to05;
/*
 * # 중복숫자 금지[1단계]
 * 1. 0~4 사이의 숫자를 arr 배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트)랜덤숫자를 check 배열의 인덱스로 활용한다.
 * 예)
 * 
 * 랜덤숫자:1
 * check = {0, 1, 0, 0, 0}
 * arr = {1, 0, 0, 0, 0}
 * 
 * 랜덤숫자:3 
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
