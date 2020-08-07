package chapter03_11to16;

/*
 * # 2차원 배열[삭제]
 * 이름과 번호를 입력받아 삭제하기
 * 예)
 * 입력 : 철수1
 * 삭제 : 김밥
 * 
 * 입력 : 철수2
 * 삭제 : 바나나
 */
import java.util.Scanner;

public class Ch03_13_01 {

	public static void main(String[] args) {
		String[][] jang = { { "철수", "소고기" }, 
							{ "철수", "김밥" }, 
							{ "철수", "김치" }, 
							{ "영희", "사과" }, 
							{ "영희", "맛밤" },
							{ "철수", "새우깡" } };

		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<jang.length;i++) {
			System.out.println(jang[i][0]+" : "+jang[i][1]);
		}
		
		System.out.print("삭제할 이름 입력 : ");
		String name = scan.next();
		System.out.print("삭제할 번호 입력 : ");
		int idx = scan.nextInt();

		int cnt = 0;
		int delidx = 0;
		
		for(int i=0; i<jang.length; i++) {
			if(jang[i][0].equals(name)) {
				if(cnt==idx) {
					System.out.println("삭제할물품:"+jang[i][1]);
					delidx = i;
				}
				cnt += 1;
			}
		}
		
		String[][] temp = jang;
		jang = new String[temp.length-1][2];
		
		int j = 0;
		for(int i=0; i<temp.length; i++) {
			if(i!=delidx) {
				jang[j] = temp[i];
				j = j + 1;
			}
		}
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0]+":"+jang[i][1]);
		}
		
		
		
		
		
		
		

	}

}
