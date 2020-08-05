package chapter03_01to05;
import java.util.Random;
import java.util.Scanner;

public class Ch03_03_02 {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[] com = {1, 7, 3};
		int[] me = new int[3];

		while(true) {
			//me중복없이 저장
			for(int i=0; i<3; i++) {
				int check = 1;
				System.out.print((i+1)+"번째숫자입력:");
				me[i] = scan.nextInt();
				
				for(int j=0; j<i;j++) {
					if(me[i]==me[j]) {
						check=-1;
					}
				}
				
				if(check==-1) {
					i = i-1;
				}
				
				
			}
			System.out.print("me:");
			for(int i=0; i<3; i++) {
				System.out.print(me[i]+" ");
			}System.out.println();
			//룰체크
			int strike=0;
			int ball=0;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3;j++) {
					if(i!=j&&me[i]==com[j]) {
						ball++;
					}else if(i==j&&me[i]==com[j]) {
						strike++;
					}
				}
			}
			//결과
			System.out.println("strike:"+strike);
			System.out.println("ball:"+ball);
			
			if(strike==3) {
				System.out.println("3strikes out");
				break;
			}else if(ball==4) {
				System.out.println("4balls out");
				break;
			}
			
		}

	
	
	}
}
