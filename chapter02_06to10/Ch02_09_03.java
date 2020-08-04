package chapter02_06to10;
/*
 * # 배열 컨트롤러[1단계] : 최종
 * 1) 추가
 * 2) 삭제
 * 3) 삽입
 */
import java.util.Scanner;

public class Ch02_09_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {10, 20, 30, 0, 0};
		
		int cnt = 3;
		int data = 0;
		int idx = -1;

		boolean run = true;
		while(run) {
			
			for(int i=0;i<cnt;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
			System.out.println("[1]추가");
			System.out.println("[2]삭제");
			System.out.println("[3]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴선택 : ");
			int sel = scan.nextInt();

			if(sel==1) {
				if(cnt==5) {
					System.out.println("더이상추가불가능");
					continue;
				}
				System.out.println("추가할 데이터 입력:");
				data = scan.nextInt();
				arr[cnt] = data;
				cnt += 1;
			}else if(sel==2) {
				if(cnt==0) {
					System.out.println("삭제불가능");
					continue;
				}
				System.out.println("삭제할 데이터 입력:");
				data = scan.nextInt();
				for(int i=0; i<cnt; i++) {
					if(data==arr[i]) {
						idx = i;
					}
				}
				for(int i=idx; i<cnt-1; i++) {
					arr[i] = arr[i+1];
				}
				cnt -= 1;
			}else if(sel==3) {
				System.out.print("삽입할 인덱스입력:");
				idx = scan.nextInt();
				if(idx<0||idx>=cnt) {
					System.out.println("삽입불가능");
					continue;
				}else {
					System.out.print("삽입할 데이터입력:");
					data = scan.nextInt();
					
					for(int i=idx+1; i<cnt+1; i++) {
						arr[i]=arr[i-1];
					}
					arr[idx] = data;
					cnt += 1;
				}
			}else if(sel==0) {
				System.out.println("종료");
				run = false;
			}
		}

		
		
	}

}
