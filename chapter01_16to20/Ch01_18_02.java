package chapter01_16to20;
/*
 * # 369����[2�ܰ�]
 * 1.1~50���� �ݺ��Ѵ�.
 * 2.�� �ȿ��� �ش� ������ 369���� ����� ����Ѵ�.
 * ��)
 * 1 2 ¦ 4 5 ¦ 7 8 ¦ . . .
 */
public class Ch01_18_02 {

	public static void main(String[] args) {

		int i = 1;
		
		while(i<51) {
			
			int a = i/10;
			int b = i%10;
			int cnt = 0;
			
			if(a!=0&&a%3==0) {
				cnt += 1;
			}
			if(b!=0&&b%3==0) {
				cnt += 1;
			}
			
			if(cnt == 2) {
				System.out.println("¦¦");
			}else if(cnt == 1) {
				System.out.println("¦");
			}else {
				System.out.println(i);
			}
			
			i += 1;
		}
		
		
	}
}
