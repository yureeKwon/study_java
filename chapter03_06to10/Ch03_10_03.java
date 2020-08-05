package chapter03_06to10;
/*
 * # 문자열[정렬]
 * 1.compareTo() 메서드
 * 2.2개의 문자열을 비교해 int형 값을 반환하는 메서드
 * 3.A.compareTo(B)
 * 4.결과
 *  A와 B가 같으면 0
 *  A가 B보다 사전적으로 순서가 앞이면 음수
 *  A가 B보다 사전적으로 순서가 뒤면    양수
 * 
 */

public class Ch03_10_03 {

	public static void main(String[] args) {

		String str1 = "가";
		String str2 = "나";
		String str3 = "가";

		int rs1 = str1.compareTo(str2); // str1 < str2
		System.out.println(rs1); // 음수

		int rs2 = str2.compareTo(str1); // str2 > str1
		System.out.println(rs2); // 양수

		int rs3 = str1.compareTo(str3); // str1 = str3
		System.out.println(rs3); // 0

		// 문제) 사전 순으로 이름 정렬
		String[] name = { "네모", "세모", "두유", "타마", "블랑", "카야" };
		
		for(int i=0; i<name.length; i++) {
			String minname = name[i];
			int minidx = i;
			for(int j=i; j<name.length; j++) {
				if(name[j].compareTo(minname)<0) {
					minname = name[j];
					minidx = j;
				}
			}
			
			String temp = name[i];
			name[i] = name[minidx];
			name[minidx] = temp;
		}
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}//네모 두유 블랑 세모 카야 타마
		
		

	}

}
