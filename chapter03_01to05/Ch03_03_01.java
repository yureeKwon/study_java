package chapter03_01to05;
/*
 * # �ߺ����� ����[2�ܰ�]
 * 1. arr�迭�� 1~10������ ���� ���� 5���� �����Ѵ�.
 * 2. �� �ߺ��Ǵ� ���ڰ� ����� �Ѵ�.
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
