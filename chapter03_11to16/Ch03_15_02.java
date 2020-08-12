package chapter03_11to16;
/*
 * #���� 2�ο�
 */
import java.util.Random;
import java.util.Scanner;

public class Ch03_15_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int max = 5; //? 6�̻����� �ٲٸ� �ȵ��ư� ;; ����?
		int size = 50;

		int turn = 0;
		int win = 0;

		int[][] mebingo = new int[max][max];
		int[][] youbingo = new int[max][max];

		int[][] memark = new int[max][max];
		int[][] youmark = new int[max][max];

		int[] temp = new int[max * max];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = ran.nextInt(size) + 1;
			for (int j = 0; j < i; j++) {
				if (temp[i] == temp[j]) {
					i -= 1;
				}
			}
		}
		int k = 0;
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max; j++) {
				mebingo[i][j] = temp[k];
				k++;
			}
		}
		for (int i = 0; i < temp.length; i++) {
			temp[i] = ran.nextInt(size) + 1;
			for (int j = 0; j < i; j++) {
				if (temp[i] == temp[j]) {
					i--;
				}
			}
		}
		k = 0;
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max; j++) {
				youbingo[i][j] = temp[k];
				k++;
			}
		}
		temp = null;

		boolean run = true;
		while(run) {
			//1.���
			System.out.println("mebingo");
			System.out.print("\t");
			for(int i=0; i<max; i++) {
				System.out.print(i+"\t");
			}System.out.println();
			for(int i=0; i<max; i++) {
				System.out.print(i+"\t");
				for(int j=0; j<max; j++) {
					if(memark[i][j]==0) {
						System.out.print(mebingo[i][j]+"\t");
					}else if(memark[i][j]==1) {
						System.out.print("O\t");
					}
				}
				System.out.println();
			}
			System.out.println("youbingo");
			System.out.print("\t");
			for(int i=0; i<max; i++) {
				System.out.print(i+"\t");
			}System.out.println();
			for(int i=0; i<max; i++) {
				System.out.print(i+"\t");
				for(int j=0; j<max; j++) {
					if(youmark[i][j]==0) {
						System.out.print(youbingo[i][j]+"\t");
					}else if(youmark[i][j]==1) {
						System.out.print("X\t");
					}
				}
				System.out.println();
			}
			
			//2.����
			if(win==1) {
				System.out.println("[p1]�¸�");
				break;
			}else if(win==2) {
				System.out.println("[p2]�¸�");
				break;
			}
			
			//3.turn����
			if(turn%2==0) {
				System.out.print("[p1]y:");
				int mey = scan.nextInt();
				System.out.print("[p1]x:");
				int mex = scan.nextInt();
				
				if(memark[mey][mex]==0) {
					memark[mey][mex] = 1;
					turn += 1;
				}else {
					System.out.println("�̹̼������ڸ�");
					continue;
				}
				
				for(int i=0; i<max; i++) {
					for(int j=0; j<max; j++) {
						if(youbingo[i][j]==mebingo[mey][mex]) {
							youmark[i][j] = 1;
						}
					}
				}
				
			}else if(turn%2==1) {
				System.out.print("[p2]y:");
				int youy = scan.nextInt();
				System.out.print("[p2]x:");
				int youx = scan.nextInt();
				
				if(youmark[youy][youx]==0) {
					youmark[youy][youx] = 1;
					turn += 1;
				}else {
					System.out.println("�̹̼������ڸ�");
					continue;
				}
				
				for(int i=0; i<max; i++) {
					for(int j=0; j<max; j++) {
						if(mebingo[i][j]==youbingo[youy][youx]) {
							memark[i][j] = 1;
						}
					}
				}
			}
			
			//4.����üũ
			for(int i=0; i<max; i++) {
				int cntme = 0; int cntyou = 0;
				for(int j=0; j<max; j++) {
					if(memark[i][j]==1) {
						cntme += 1;
					}else if(memark[i][j]==0) {
						cntme = 0;
					}
					
					if(youmark[i][j]==1) {
						cntyou += 1;
					}else if(youmark[i][j]==0) {
						cntyou = 0;
					}
					
					if(cntme==5) {
						win = 1;
					}else if(cntyou==5) {
						win = 2;
					}
				}
			}
			//5.����üũ
			for(int j=0; j<max; j++) {
				int cntme = 0; int cntyou = 0;
				for(int i=0; i<max; i++) {
					if(memark[i][j]==1) {
						cntme += 1;
					}else if(memark[i][j]==0) {
						cntme = 0;
					}
					
					if(youmark[i][j]==1) {
						cntyou += 1;
					}else if(youmark[i][j]==0) {
						cntyou = 0;
					}
					
					if(cntme==5) {
						win = 1;
					}else if(cntyou==5) {
						win = 2;
					}
				}
			}
			//6.�밢�� -����
			int cntme = 0; int cntyou = 0;
			for(int i=0; i<max; i++) {
				if(memark[i][i]==1) {
					cntme += 1;
				}else if(memark[i][i]==0){
					cntme = 0;
				}
				if(youmark[i][i]==1) {
					cntyou += 1;
				}else if(youmark[i][i]==0){
					cntyou = 0;
				}
				
				if(cntme==5) {
					win = 1;
				}else if(cntyou==5) {
					win = 2;
				}
			}
			//7.�밢�� +����
			cntme = 0; cntyou = 0;
			for(int i=0; i<max; i++) {
				if(memark[4-i][i]==1) {
					cntme += 1;
				}else if(memark[4-i][i]==0){
					cntme = 0;
				}
				if(youmark[4-i][i]==1) {
					cntyou += 1;
				}else if(youmark[4-i][i]==0){
					cntyou = 0;
				}
				
				if(cntme==5) {
					win = 1;
				}else if(cntyou==5) {
					win = 2;
				}
			}
			
			
		}
		

	}

}
