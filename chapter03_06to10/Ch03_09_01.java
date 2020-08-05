package chapter03_06to10;
/*
 * # 관리비
 */
import java.util.Scanner;

public class Ch03_09_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] apt = { { 101, 102, 103 }, 
						{ 201, 202, 203 }, 
						{ 301, 302, 303 } };

		int[][] pay = { { 1000, 2100, 1300 }, 
						{ 4100, 2000, 1000 },
						{ 3000, 1600, 800 } };

		// 문제1) 각층별 관리비 합 출력 (정답 : 4400, 7100, 5400)
		int[] floor = new int[3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				floor[i] += pay[i][j];
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "층 관리비 합 : " + floor[i]);
		}

		// 문제2) 호를 입력하면 관리비 출력 (입력 : 202호, 관리비 : 2000원)
		System.out.print("호 입력 : ");
		int ho = scan.nextInt();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (apt[i][j] == ho) {
					System.out.println("관리비 : " + pay[i][j] + "원");
				}
			}
		}

		// 문제3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력 (정답: 201호, 303호)
		int maxpay = pay[0][0];
		int maxidx1 = 0;
		int maxidx2 = 0;
		int minpay = pay[0][0];
		int minidx1 = 0;
		int minidx2 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (pay[i][j] > maxpay) {
					maxpay = pay[i][j];
					maxidx1 = i;
					maxidx2 = j;
				} else if (pay[i][j] < minpay) {
					minpay = pay[i][j];
					minidx1 = i;
					minidx2 = j;
				}
			}
		}
		System.out.println("가장 많이 나온 집 : " + apt[maxidx1][maxidx2] + "호");
		System.out.println("가장 적게 나온 집 : " + apt[minidx1][minidx2] + "호");

		// 문제4) 호 2개를 입력하면 관리비 교체
		System.out.print("호1 입력 : ");
		int ho1 = scan.nextInt();
		System.out.print("호2 입력 : ");
		int ho2 = scan.nextInt();

		int idx1 = 0;
		int idx2 = 0;
		int idx3 = 0;
		int idx4 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (apt[i][j] == ho1) {
					idx1 = i;
					idx2 = j;
				} else if (apt[i][j] == ho2) {
					idx3 = i;
					idx4 = j;
				}
			}
		}
		int temp = pay[idx1][idx2];
		pay[idx1][idx2] = pay[idx3][idx4];
		pay[idx3][idx4] = temp;

		// 출력
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}

	}

}
