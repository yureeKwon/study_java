package chapter02_06to10;

/*
 * # 2���� �ݺ���
 * 
 */
public class Ch02_11_01 {

	public static void main(String[] args) {

		// ����1
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
		
		// ����2
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
		
		// ����3
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
		
		// ����4
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
