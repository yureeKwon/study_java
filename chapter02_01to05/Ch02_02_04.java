package chapter02_01to05;
/*
 * # 학생성적관리 프로그램[4단계] : 1등학생 
 */

public class Ch02_02_04 {

	public static void main(String[] args) {
		// 12:55 ~ 13:00(5분)

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// 문제) 1등 학생의 학번과 성적 출력
		// 정답) 1004번(98점)

		int i = 0;
		int maxScore = 0;
		int maxhak = 0;

		for (i = 0; i < 5; i++) {
			if (maxScore < scores[i]) {
				maxScore = scores[i];
				maxhak = hakbuns[i];
			}
		}
		System.out.println("1등학생의 학번과 성적");
		System.out.println("학번 :" + maxhak + "번");
		System.out.println("성적 :" + maxScore + "점");

	}

}
