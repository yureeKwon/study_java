package chapter04_01to05;
/*
 * # �ֹε�Ϲ�ȣ �˻�
 */

public class Ch04_01_03 {

	public static void main(String[] args) {
		String jumin = "890101-2012932";

		// ����1) �������
		String year = jumin.substring(0,2);
		int numyear = Integer.parseInt(year);
		int age = 2020-(1900+numyear);
		System.out.println("����:"+age);
		
		// ����2) �������
		char key = jumin.charAt(7);
		if(key=='2'||key=='4') {
			System.out.println("����:����");
		}else {
			System.out.println("����:����");
		}

	}

}
