package chapter02_06to10;

/*
 * # ATM[3단계]
 * 1. 가입
 * 계좌번호와 비밀번호를 입력받아 가입
 * 계좌번호 중복검사
 * 2.탈퇴
 * 계좌번호를 입력받아 탈퇴
 */
import java.util.Scanner;

public class Ch02_10_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] accs = { 1001, 1002, 0, 0, 0 };
		int[] pws = { 1111, 2222, 0, 0, 0 };

		int cnt = 2;
		
		int newAcc = 0;
		int newPw = 0;
		
		int delAcc = 0;
		int delPw = 0;
		
		boolean run = true;
		while(run) {
			System.out.println("1.가입 2.탈퇴");
			System.out.print("메뉴선택:");
			int sel = scan.nextInt();
			
			if(sel==1) {
				
				if(cnt==5) {
					System.out.println("더이상가입불가");
					continue;
				}
				
				System.out.print("새계좌번호입력:");
				newAcc = scan.nextInt();
				
				int check = 1;
				for(int i=0; i<cnt; i++) {
					if(accs[i]==newAcc) {
						check = -1;
					}
				}
				
				if(check==1) {
					System.out.print("새비번입력:");
					newPw = scan.nextInt();
					accs[cnt] = newAcc;
					pws[cnt] = newPw;
					cnt += 1;
					System.out.println("가입완료");
				}else if(check==-1) {
					System.out.println("이미존재하는계좌번호");
					continue;
				}
				
			}else if(sel==2) {
				int check = -1;
				System.out.print("탈퇴할계좌번호:");
				delAcc = scan.nextInt();
				for(int i=0; i<cnt; i++ ) {
					if(delAcc==accs[i]) {
						check = i;
					}
				}
				if(check==-1) {
					System.out.println("입력한계좌없음");
					continue;
				}else {
					System.out.print("비번입력:");
					delPw = scan.nextInt();
					if(delPw==pws[check]) {
						System.out.println("탈퇴완료");
						for(int i=check; i<cnt-1;i++) {
							accs[i] = accs[i+1];
							pws[i] = pws[i+1];
						}
	//********마지막값도 0으로초기화해줘야함. 위에 배열에 넣으면 범위에러나니까 아래처럼해줌
						accs[cnt-1] = 0; 
						pws[cnt-1] = 0;
					
						cnt = cnt - 1;
					}else {
						System.out.println("비번틀림");
						continue;
					}
					
				}
				
			}
		}
		

	}

}
