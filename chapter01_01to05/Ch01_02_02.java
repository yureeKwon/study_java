package chapter01_01to05;

public class Ch01_02_02 {
	
	public static void main(String[] args) {
		// 1. ���� ������
		System.out.println(10+3);
		
		// 2. ���� ������
		//  1) "����" + "����" = "����" 
        System.out.println("�ȳ�"+"�ϼ���");
        //  2) ���� + "����" = "����"
        System.out.println(3+"10");
        //  3) "����" + ���� = "����"
        System.out.println("10"+3);
        // ex) "����" + ���� + ���� = "����"
        // ex) "����" + (���� + ����) = "���� + (����)����"
        System.out.println("���ϱ� = " + 10 + 3);
        System.out.println("���ϱ� = " +(10+3));
        //  4) ���� + ���� = (����)����
        System.out.println(10+6);
	}
}
