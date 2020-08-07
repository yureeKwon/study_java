package chapter03_11to16;
/*
 * # 쇼핑몰 [장바구니]
 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
 *  1) 사과 2) 바나나 3) 딸기
 * 2. 번호를 선택하여 상품을 장바구니에 담을 수 있다.
 * 3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
 * 4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
 * {
 * 		{0, 1},				qwer회원 			> 사과구매
 * 		{1, 2},				javaking회원 		> 바나나구매
 * 		{2, 1},				abcd회원			> 사과구매
 * 		{0, 3},				qwer회원			> 포도구매
 * 		...
 * }
 */
import java.util.Scanner;

public class Ch03_11_02 {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		
		String[] ids = {"술래", "동동", "리타", "벽타"};
		String[] pws = {"1111", "2222", "3333", "4444"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		int cnt = 0;
		String[] items = {"사과", "바나나", "딸기"};
		
		int log = -1;
		
		while(true) {
			System.out.println("로그인상태");
			if(log==-1) {
				System.out.println("로그아웃");
			}else {
				System.out.println(ids[log]+"님 로그인중");
			}
			System.out.println("----------");
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");

			System.out.print("메뉴선택 : ");
			int sel = scan.nextInt();
			
			if(sel==1) {
				if(log!=-1) {
					System.out.println("로그아웃 후 이용가능");
					continue;
				}else {
					System.out.print("id입력:");
					String myid = scan.next();
					System.out.print("pw입력:");
					String mypw = scan.next();
					
					for(int i=0; i<ids.length; i++) {
						if(ids[i].equals(myid)&&pws[i].equals(mypw)) {
							log = i;
						}
					}
					
					if(log==-1) {
						System.out.println("로그인정보다시확인");
					}else {
						System.out.println(ids[log]+"님 로그인완료");
					}
				}
			}
			else if(sel==2) {
				if(log==-1) {
					System.out.println("로그인 후 이용가능");
					continue;
				}else {
					log = -1;
					System.out.println("로그아웃완료");
				}
			}
			else if(sel==3) {
				if(log==-1) {
					System.out.println("로그인 후 이용가능");
					continue;
				}
				
				while(true) {
					for(int i=0; i<items.length;i++) {
						System.out.println((i+1)+")"+items[i]);
					}
					System.out.println("4)뒤로가기");
					System.out.println("쇼핑품목선택:");
					int choice = scan.nextInt();
					
					if(choice==4) {
						break;
					}
					jang[cnt][0] = log;
					jang[cnt][1] = choice;
					cnt += 1;
				}
			}
			else if(sel==4) {
				if(log==-1) {
					System.out.println("로그인 후 이용가능");
					continue;
				}else {
					System.out.println(ids[log]+"님의 장바구니");
					int[] itemCount = new int[items.length];
					for(int i=0; i<cnt; i++) {
						if(jang[i][0]==log) {
							if(jang[i][1]==1) {
								itemCount[0] += 1;
							}else if(jang[i][1]==2) {
								itemCount[1] += 1;
							}else if(jang[i][1]==3) {
								itemCount[2] += 2;
							}
						}
					}
					//로그인한 회원에 따라(log) 장바구니에 있는 아이템이랑 갯수 출력
					for(int i=0; i<items.length; i++) {
						System.out.println((i+1)+")"+items[i]+":"+itemCount[i]+"개");
					}
				}
			}
			else if(sel==0) {
				System.out.println("쇼핑종료");
				break;
			}

				
			
			
		}
		
		
	}

}
