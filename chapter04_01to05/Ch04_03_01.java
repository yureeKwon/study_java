package chapter04_01to05;
/*
 * # ���ڿ� 2����(2�ܰ�)
 */

public class Ch04_03_01 {

	public static void main(String[] args) {
		// ����) �̸��� ������ �ϳ��� ���ڿ��� ����
		// ����) "�迵��/87,�̸���/42,��ö��/31"

		String[] name = { "�迵��", "�̸���", "��ö��" };
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
