package chapter01_01to05;

public class Ch01_02_02 {
	
	public static void main(String[] args) {
		// 1. 덧셈 연산자
		System.out.println(10+3);
		
		// 2. 연결 연산자
		//  1) "문자" + "문자" = "문자" 
        System.out.println("안녕"+"하세요");
        //  2) 숫자 + "문자" = "문자"
        System.out.println(3+"10");
        //  3) "문자" + 숫자 = "문자"
        System.out.println("10"+3);
        // ex) "문자" + 숫자 + 숫자 = "문자"
        // ex) "문자" + (숫자 + 숫자) = "문자 + (연산)문자"
        System.out.println("더하기 = " + 10 + 3);
        System.out.println("더하기 = " +(10+3));
        //  4) 숫자 + 숫자 = (연산)숫자
        System.out.println(10+6);
	}
}
