package chapter03_06to10;
/*
 * # 배열 컨트롤러[2단계] : 벡터(Vector)
 * 1.추가
 * 값을 입력받아 순차적으로 추가
 * 2.삭제(인덱스)
 * 인덱스를 입력받아 해당 위치의 값 삭제
 * 3.삭제(값)
 * 값을 입력받아 삭제
 * 없는 값 입력 시 예외처리
 * 4.삽입
 * 인덱스와 값을 입력받아 삽입
 */
import java.util.Scanner;

public class Ch03_07_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] score = null;
		int cnt = 0;
		
		while(true) {
			for(int i=0; i<score.length; i++) {
				System.out.print(score[i]+" ");
			}System.out.println();
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if(sel==1) {
				if(cnt==0) {
					score = new int[cnt+1];
				}else if(cnt>0) {
					int[] temp = score;
					score = new int[cnt+1];
					for(int i=0; i<cnt; i++) {
						score[i] = temp[i];
					}
					
					System.out.print("[추가]값입력:");
					int data = scan.nextInt();
					score[cnt] = data;
					cnt+=1;
				}
				
			}else if(sel==2) {
				
				System.out.print("[삭제]인덱스입력:");
				int delidx=scan.nextInt();
				if(delidx>=cnt||delidx<0) {
					System.out.println("삭제불가능");
					continue;
				}
				
				if(cnt==1) {
					score = null;
				}else if(cnt>1) {
					int[] temp = score;
					score = new int[cnt-1];
					for(int i=0; i<delidx; i++) {
						score[i] = temp[i];
					}
					for(int i=delidx; i<cnt-1; i++) {
						score[i] = temp[i+1];
					}
					temp = null;
				}
				cnt-=1;
				
			}else if(sel==3) {
				 System.out.print("[삭제]값입력:");
				 int deldata = scan.nextInt();
				 
				 int delidx=-1;
				 for(int i=0; i<cnt; i++) {
					 if(deldata==score[i]) {
						 delidx=i;
					 }
				 }
				 if(delidx==-1) {
					 System.out.println("해당값존재하지않음");
					 continue;
				 }
				 
				 if(cnt==1) {
					 score = null;
				 }else if(cnt>1) {
					 int[] temp = score;
					 score = new int[cnt-1];
					 
					 int j=0;
					 for(int i=0; i<cnt; i++) {
						 if(i!=delidx) {
							 score[j] = temp[i];
							 j += 1;
						 }
					 }
					 temp = null;
				 }
				 cnt -= 1;
			}else if(sel==4) {
				System.out.print("[삽입]인덱스입력:");
				int insertidx = scan.nextInt();
				if(insertidx<0||insertidx>=cnt) {
					System.out.println("해당위치삽입불가");
					continue;
				}
				System.out.print("[삽입]값입력:");
				int insertdata = scan.nextInt();
				
				if(cnt==0) {
					score = new int[1];
				}else if(cnt>1) {
					int[] temp = score;
					score = new int[cnt+1];
					
					int j=0;
					for(int i=0; i<cnt+1; i++) {
						if(i!=insertidx) {
							score[i] = temp[j];
							j+=1;
						}
					}
					temp=null;
				}
				
				score[insertidx] = insertdata;
				cnt+=1;
			}else if(sel==0) {
				System.out.println("종료");
				break;
			}
			
			
		}
		
	}

}
