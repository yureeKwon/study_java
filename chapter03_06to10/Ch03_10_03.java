package chapter03_06to10;
/*
 * # ���ڿ�[����]
 * 1.compareTo() �޼���
 * 2.2���� ���ڿ��� ���� int�� ���� ��ȯ�ϴ� �޼���
 * 3.A.compareTo(B)
 * 4.���
 *  A�� B�� ������ 0
 *  A�� B���� ���������� ������ ���̸� ����
 *  A�� B���� ���������� ������ �ڸ�    ���
 * 
 */

public class Ch03_10_03 {

	public static void main(String[] args) {

		String str1 = "��";
		String str2 = "��";
		String str3 = "��";

		int rs1 = str1.compareTo(str2); // str1 < str2
		System.out.println(rs1); // ����

		int rs2 = str2.compareTo(str1); // str2 > str1
		System.out.println(rs2); // ���

		int rs3 = str1.compareTo(str3); // str1 = str3
		System.out.println(rs3); // 0

		// ����) ���� ������ �̸� ����
		String[] name = { "�׸�", "����", "����", "Ÿ��", "���", "ī��" };
		
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
		}//�׸� ���� ��� ���� ī�� Ÿ��
		
		

	}

}
