package chapter01_11to15;

/*
 * # if���� ���� 3����
 * 1.
 * if(���ǽ�){ 
 *          ���ǽ��� ��(true)�� ��, ������ ����;
 * }  
 *        
 * 2.
 * if(���ǽ�){ 
 *          ���ǽ��� ��(true)�� ��, ������ ����;
 * }else{ 
 *       ���ǽ��� ����(false)�� ��, ������ ����;
 * }
 *   
 * 3.
 * if(���ǽ�){ 
 *          ���ǽ�1�� ��(true)�� ��, ������ ����;
 * }else if(���ǽ�2){
 *                 ���ǽ�2�� ��(true)�� ��, ������ ����;
 * }else if(���ǽ�3){ 
 *                 ���ǽ�3�� ��(true)�� ��, ������ ����;
 * }else{
 *       �� ������ ��� �������� ���� ��, ������ ����;
 * }                  
 */

public class Ch01_12_01 {

	public static void main(String[] args) {
		// ��) Ȧ¦
		int num = 10;
		if (num % 2 == 0) {
			System.out.println("¦��");
		}
		if (num % 2 == 1) {
			System.out.println("Ȧ��");
		}
		/*
		 * ������ ������ 1������ ���, ��{}�� ������ �� �ִ�. ������ �������� �ʴ´�.
		 */

//				
		if (num % 2 == 0)
			System.out.println("¦��");
		if (num % 2 == 1)
			System.out.println("Ȧ��");

		if (num % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		// ù��° ������ �����̸� ������ ���� ����
		// if���� �ٽ� �Ⱦ��� else�� ��°��� ����
		// ����� ���� 2������ ��쿡 ������ �� ����..

		/*
		 * if - else if ������ ���� �� �Ϸ� ���� ���ǽ��� ������, ���� ������ �������� �ʴ´�.
		 */

		if (10 == 10) {
			System.out.println(10);
		}
		if (11 == 11) {
			System.out.println(11);
		}
		// ----------------------
		if (10 == 10) {
			System.out.println(10);
		} else if (11 == 11) {
			System.out.println(11);
		}

	}

}
