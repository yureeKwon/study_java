package chapter03_01to05;
/*
 * # 중복숫자 금지[2단계]
 * 1. arr배열에 1~10사이의 랜덤 숫자 5개를 저장한다.
 * 2. 단 중복되는 숫자가 없어야 한다.
 */
import java.util.Random;

public class Ch03_03_01 {

	public static void main(String[] args) {

		Random ran = new Random();
		
		int[] arr = new int[5];
		
		int i=0;
		while(i<5) {
			
			int check = 1;
			
			arr[i] = ran.nextInt(10)+1;
			
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					check = -1;
				}
			}
			if(check==1) {
				i++;
			}
		}
		
		for(int k=0;k<5;k++) {
			System.out.print(arr[k]+" ");
		}
		
		
		
	}

}
