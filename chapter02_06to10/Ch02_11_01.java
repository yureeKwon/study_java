package chapter02_06to10;

/*
 * # 2차원 반복문
 * 
 */
public class Ch02_11_01 {

	public static void main(String[] args) {

		// 문제1
		/*
		 * # 
		 * ## 
		 * ###
		 */
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(j<=i) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// 문제2
		/*
		 * ### 
		 * ## 
		 * #
		 */
		for(int i=0; i<3; i++) {
			for(int j=3; j>0; j--) {
				if(j>i) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// 문제3
		/*
		 * @##
		 * @@#
		 * @@@
		 */
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(j<=i) {
					System.out.print("@");
				}else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		
		// 문제4
		/*
		 *  #
		 * ###
		 *#####
		 */
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1;j++) {
				System.out.print("#");
			}
			for(int j=0;j<2-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}
}
