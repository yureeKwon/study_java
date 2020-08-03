package chapter01_11to15;

//# 반복문 기본문제[2단계]
public class Ch01_15_02 {

	public static void main(String[] args) {

		// 문제1) 1~5까지의 합 출력
		// 정답1) 15
		int tot = 0;
		int i = 1;
		while (i <= 5) {
			tot += i;
			i++;
		}
		System.out.println(tot);

		
		// 문제2) 1~10까지 반복해 3미만 7이상 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		i = 1;
		while (i < 11) {
			if (i < 3 || i > 6) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();

		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		tot = 0;
		i = 1;
		while (i < 11) {
			if (i < 3 || i > 6) {
				tot += i;
			}
			i++;
		}
		System.out.println(tot);

		
		// 문제4) 문제2의 조건에 맞는 수들의 갯수 출력
		// 정답4) 6
		int cnt = 0;
		i = 1;
		while (i <= 10) {
			if (i < 3 || i > 6) {
				cnt += 1;
			}
			i++;
		}
		System.out.println(cnt);

	}
}