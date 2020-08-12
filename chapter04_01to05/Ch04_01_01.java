package chapter04_01to05;
/*
 * # ���ڿ�(= ������ �迭)
 * 1. ���ڿ��� "������ �迭"�� ���Ӹ�
 * 2. 0������ �����ϴ� ��ȣ�� �ο�(index)
 */

public class Ch04_01_01 {

	public static void main(String[] args) {
		// 012345
		String str = "megait";
		System.out.println(str);

		// [1]������ ���� : length()
		int size = str.length();
		System.out.println(size); // 6

		// [1]���� �Ѱ� ����(�ε���) : charAt(index)
		char ch = str.charAt(0);
		System.out.println(ch);
		ch = str.charAt(size - 1);
		System.out.println(ch);

		// [2]���� ������ ����(�����̽�)
		// 1) substring(index1, index2)
		// �������� �������� �ʴ´�. (index1���� index2�̸�����)
		String rs = str.substring(4, 6); // 4 <= rs < 6
		System.out.println(rs);

		// [3] �����ڷ� �߶󳻱�
		str = "hello,java,android";
		String[] ar = str.split(",");
		System.out.println(ar.length); // 3
		System.out.println(ar[0]); // hello
		System.out.println(ar[1]); // java
		System.out.println(ar[2]); // android

	}

}
