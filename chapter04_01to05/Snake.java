package chapter04_01to05;

import java.util.Scanner;

public class Snake {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int APPLE = 7;
		int SNAKE = 3;
		int len;
		int ydir;
		int xdir;

		int n;
		int k;
		int l;

		System.out.print("1.N:");
		n = scan.nextInt();
		int[][] board = new int[n][n];

		System.out.print("2.K:");
		k = scan.nextInt();
		for (int i = 0; i < k; i++) {
			System.out.print("사과위치Y좌표:");
			int Xk = scan.nextInt();
			System.out.print("사과위치X좌표:");
			int Yk = scan.nextInt();
			board[Yk][Xk] = APPLE;
		}
		int TEMP[][] = board;

		System.out.print("3.L:");
		l = scan.nextInt();
		int movesecond[] = new int[l];
		int movedir[] = new int[l];
		for (int i = 0; i < l; i++) {
			System.out.print("X:");
			movesecond[i] = scan.nextInt();
			System.out.print("C:");
			String c = scan.next();
			if (c.equals("L")) {
				movedir[i] = -1;
			} else if (c.equals("D")) {
				movedir[i] = 1;
			}
		}

		len = 1;
		int[] SY = new int[len];
		int[] SX = new int[len];
		SX[0] = 0;
		SY[0] = 0;
		ydir = 0;
		xdir = 1;

		int time = 0;
		while (true) {
			// 1.출력
			board = TEMP;
			for (int i = 0; i < len; i++) {
				board[SY[i]][SX[i]] = SNAKE;
			}
			System.out.println("------------");
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
			// 2.방향이동체크
			for (int i = 0; i < l; i++) {
				if (time == movesecond[i]) {
					if (movedir[i] == 1) {
						if (ydir == 0 && xdir == 1) {
							ydir = -1;
							xdir = 0;
						} else if (ydir == -1 && xdir == 0) {
							ydir = 0;
							xdir = -1;
						} else if (ydir == 0 && xdir == -1) {
							ydir = 1;
							xdir = 0;
						} else if (ydir == 1 && xdir == 0) {
							ydir = 0;
							xdir = -1;
						}
					} else if (movedir[i] == -1) {
						if (ydir == 0 && xdir == 1) {
							ydir = 1;
							xdir = 0;
						} else if (ydir == 1 && xdir == 0) {
							ydir = 0;
							xdir = -1;
						} else if (ydir == 0 && xdir == -1) {
							ydir = -1;
							xdir = 0;
						} else if (ydir == -1 && xdir == 0) {
							ydir = 0;
							xdir = 1;
						}
					}
				}
			}
			// 3.뱀머리이동
			int A_check = -1;
			int[] tempY = SY;
			int[] tempX = SX;
			SY[0] += ydir;
			SX[0] += xdir;
			// 4.뱀머리==사과일때
			if (board[SY[0]][SX[0]] == APPLE) {
				A_check = 1;
			}
			// 5.뱀머리==몸통일때
			int die = -1;
			if (SY[0] < 0 || SX[0] < 0 || SY[0] >= n || SX[0] >= n) {
				die = 1;
			}
			if (board[SY[0]][SX[0]] == SNAKE) {
				die = 1;
			}
			

			// 4.몸통이동
			if (A_check == 1) {
				len += 1;
				SY = new int[len];
				SX = new int[len];
				for (int i = len - 1; i > 0; i--) {
					SY[i] = tempY[i - 1];
					SX[i] = tempX[i - 1];
				}
			} else {
				for (int i = len - 1; i > 0; i--) {
					SY[i] = tempY[i - 1];
					SX[i] = tempX[i - 1];
				}
			}

			time += 1;
			if (die == 1) {
				System.out.println("게임종료 time:" + time);
				break;
			}
			
		}

	}

}
