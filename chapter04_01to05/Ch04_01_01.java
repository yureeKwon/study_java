package chapter04_01to05;
/*
 * # 문자열(= 문자의 배열)
 * 1. 문자열은 "문자의 배열"의 줄임말
 * 2. 0번부터 시작하는 번호가 부여(index)
 */

public class Ch04_01_01 {

	public static void main(String[] args) {
		// 012345
		String str = "megait";
		System.out.println(str);

		// [1]문자의 길이 : length()
		int size = str.length();
		System.out.println(size); // 6

		// [1]문자 한개 추출(인덱싱) : charAt(index)
		char ch = str.charAt(0);
		System.out.println(ch);
		ch = str.charAt(size - 1);
		System.out.println(ch);

		// [2]문자 여러개 추출(슬라이싱)
		// 1) substring(index1, index2)
		// 마지막은 포함하지 않는다. (index1부터 index2미만까지)
		String rs = str.substring(4, 6); // 4 <= rs < 6
		System.out.println(rs);

		// [3] 구분자로 잘라내기
		str = "hello,java,android";
		String[] ar = str.split(",");
		System.out.println(ar.length); // 3
		System.out.println(ar[0]); // hello
		System.out.println(ar[1]); // java
		System.out.println(ar[2]); // android

	}

}
