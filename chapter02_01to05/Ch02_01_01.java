package chapter02_01to05;
/*
 * # 변수 : 값 한개만 저장하는 기술
 * # 배열(array)
 * 1.(같은 종류의)값을 여러개 저장하는 기술
 * 2.사용법
 *       int num = 10;
 *       int[] arr = new int[방의 갯수]; 
 *       int arr[] = new int[방의 갯수];
 * 3.인덱스(index)
 *       0부터 시작하는 방번호(index)가 부여된다.      
 * 4.주소 변수 
 * 
 */

public class Ch02_01_01 {

	public static void main(String[] args) {
		// 1.일반변수(값 저장)
		int num = 0;
		num = 10;
		System.out.println("num =" + num);

		// 2.주소변수(주소저장)
		int[] arr = null; // null(주소가 없음)
		// new(힙 메모리에) int(정수)를 저장할 수 있는 방 5개를 만들어줘!
		arr = new int[5];
		System.out.println("arr =" + arr); // [I@7852e922

		System.out.println(arr[0]); // 0
		System.out.println(arr[1]); // 0
		System.out.println(arr[2]); // 0
		System.out.println(arr[3]); // 0
		System.out.println(arr[4]); // 0

		// java.lang.ArrayIndexOutOfBoundsException: 5
		// System.out.println(arr[5]);

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}

	}

}
