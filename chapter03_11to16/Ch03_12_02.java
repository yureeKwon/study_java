package chapter03_11to16;
/*
 * # 중복안된 숫자 제거
 */

public class Ch03_12_02 {

	public static void main(String[] args) {

		int test1[] = {1, 2, 3, 2, 1};  // -> 1, 2, 2, 1
//		int temp[] = {1, 2, 3, 2, 1};  // -> 1, 2, 2, 1
		int test2[] = {1, 3, 4, 4, 2};  // -> 4, 4
		int test3[] = {1, 1, 1, 2, 1};  // -> 1, 1, 1, 1

		for(int i=0; i<5; i++) {
			int check = -1;
			for(int j=0; j<5; j++) {
				if(i!=j&&test3[i]==test3[j]) {
					check=1;
				}
			}
			if(check==1) {
				System.out.print(test3[i]+" ");
			}
		}
		
		
		
		
	}

}
