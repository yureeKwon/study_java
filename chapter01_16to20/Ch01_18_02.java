package chapter01_16to20;
/*
 * # 369게임[2단계]
 * 1.1~50까지 반복한다.
 * 2.그 안에서 해당 숫자의 369게임 결과를 출력한다.
 * 예)
 * 1 2 짝 4 5 짝 7 8 짝 . . .
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
				System.out.println("짝짝");
			}else if(cnt == 1) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
			
			i += 1;
		}
		
		
	}
}
