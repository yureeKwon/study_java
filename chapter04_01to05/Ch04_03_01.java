package chapter04_01to05;
/*
 * # 문자열 2차원(2단계)
 */

public class Ch04_03_01 {

	public static void main(String[] args) {
		// 문제) 이름과 성적을 하나의 문자열로 연결
		// 정답) "김영희/87,이만수/42,이철수/31"

		String[] name = { "김영희", "이만수", "이철수" };
		int[] score = { 87, 42, 31 };
		
		String text = "";
		for(int i=0; i<name.length; i++) {
			text += name[i];
			text += "/";
			text += score[i];
			if(i!=name.length-1) {
				text += ",";
			}
		}
		
		System.out.println(text);
		

	}

}
