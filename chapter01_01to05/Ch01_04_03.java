package chapter01_01to05;
/*
 * 4. �� ������
 * 
 * 1. ����
 *  1) &&(and) : ���� ��� ���̾��, ��
 *  2) ||(or) : ��� �����̶� ���̸�, ��
 * 
 * 2. ����
 *  1) �������ڸ� ���� �������� �񱳿����ڸ� ������ �� �ִ�.
 *  2) �������ڸ� ���� ���� ������ �����ϴ�.
 */

public class Ch01_04_03 {

	public static void main(String[] args) {
		System.out.println(10 == 10 && 3 == 3);
		System.out.println(10 != 10 && 3 == 3);
		System.out.println(10 == 10 && 3 != 3);
		System.out.println(10 != 10 && 3 != 3);
		
		System.out.println();
		
		System.out.println(10 == 10 || 3 == 3);
		System.out.println(10 != 10 || 3 == 3);
		System.out.println(10 == 10 || 3 != 3);
		System.out.println(10 != 10 || 3 != 3);		

	}

}
