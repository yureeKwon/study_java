package chapter01_11to15;
/*
 * # 369����[1�ܰ�]
 * 1. 1~50 ������ �������ڸ� �����Ѵ�.
 * 2. �� ���� 369�� ������ 
 *    1)2���̸�, ¦¦�� ���
 *    2)1���̸�, ¦�� ���
 *    3)0���̸�, �ش� ���ڸ� ���
 */
import java.util.Random;

public class Ch01_13_01 {

	public static void main(String[] args) {

		Random ran = new Random();
		int r = ran.nextInt(50)+1;
		System.out.println(r);
		
		int a = r/10;
		int b = r%10;
		int count = 0;
		if(a!=0&&a%3==0) {
			count += 1;
		}
		if(b!=0&&b%3==0) {
			count += 1;
		}
		
		if(count==2) {
			System.out.println("¦¦");
		}else if(count==1) {
			System.out.println("¦");
		}else {
			System.out.println(r);
		}
		
		
	}

}
