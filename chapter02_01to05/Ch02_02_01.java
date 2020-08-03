package chapter02_01to05;
/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */

import java.util.Scanner;
import java.util.Random;

public class Ch02_02_01 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		// 문제1) arr 배열에 1~100점 사이의 정수를 5개 저장

		Random ran = new Random();

		System.out.println(">>>문제1");
		System.out.println("점수출력");

		int i = 0;
		for (i = 0; i < 5; i++) {
			arr[i] = ran.nextInt(100) + 1;
			System.out.println(arr[i]);
		}
		System.out.println("점수출력완료");

		// 문제2) 전교생의 총점과 평균 출력
		System.out.println(">>>문제2");
		int tot = 0;
		double avg = 0.0;
		for (i = 0; i < 5; i++) {
			tot = tot + arr[i];
		}
		avg = tot / 5;
		System.out.println("총점:" + tot + "점");
		System.out.println("평균:" + avg + "점");

		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		System.out.println("문제3");
		int cnt = 0;
		for (i = 0; i < 5; i++) {
			if (arr[i] >= 60) {
				cnt = cnt + 1;
			}
		}
		System.out.println("합격생 수:" + cnt + "명");

	}

}
