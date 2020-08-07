package chapter03_11to16;
/*
 * # 쇼핑몰 [관리자]
 * 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다.
 * 2. 카테고리는 각 행의 첫번째 열에 저장한다.
 * 3. 아이템은 각 행의 두번째 열에 저장한다.
 *  단, 아이템은 여러개를 추가할 수 있도록 슬러시(/)를 구분자로 연결한다.
 * 예)
 * {
 *   {"과일", "사과/포도/"},
 *   {"과자", "홈런볼/조리퐁/"},
 *   {"음료", "콜라/"},
 *   {"육류", "소고기/"}
 *   ...
 * }
 * 
 */
import java.util.Scanner;

public class Ch03_11_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[][] items = new String[100][2];
		for(int i=0; i<items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		
		int itemCount = 0;
		
		while(true) {
			
			
			System.out.println("1.카테고리추가 2.아이템추가 3.전체상품출력");
			System.out.print("메뉴선택:");
			int sel = scan.nextInt();
			if(sel==1) {
				System.out.print("카테고리이름입력:");
				String category = scan.next();
				items[itemCount][0] = category;
				items[itemCount][0] += ":";
				itemCount += 1;
			}else if(sel==2) {
				System.out.print("카테고리번호선택:");
				int categoryNum = scan.nextInt();
				System.out.print("아이템입력:");
				String item = scan.next();
				items[categoryNum][1] += item;
				items[categoryNum][1] += "/";
			
			}else if(sel==3) {
				for(int i=0; i<itemCount; i++) {
					System.out.println(items[i][0]+":"+items[i][1]);
				}
			}
			
		}
		
		
	}
}
