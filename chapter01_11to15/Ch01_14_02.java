package chapter01_11to15;

/*
 * # ���Ĺ��� ��¹�
 *  %d : ����
 *  %f : �Ҽ�
 *  %c : ����1��
 *  %s : ���� ������
 */

public class Ch01_14_02 {
	public static void main(String[] args) {

		System.out.printf("%d",10);
		System.out.println();
		
		System.out.printf("%f\n",3.14);    // %f�� �Ҽ��� ������°���� ���
		System.out.printf("%.2f\n",3.143); // %.2�� �Ҽ��� �ι�°�ڸ�����
		
		System.out.printf("%c\n", 'b');    // %c�� ���� �Ѱ� ���
		System.out.printf("%s\n", "��¹��� ����");//&s�� ���ڿ����
		
		String fruit = "���";
		int cnt = 5;
		System.out.printf("%s�� %d�� �ֽ��ϴ�.\n", fruit, cnt);
	    
		//�������� ���� ���

	}
}
