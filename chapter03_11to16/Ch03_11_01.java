package chapter03_11to16;
/*
 * # ���θ� [������]
 * 1. ī�װ��� �������� �Է¹޾� �Ʒ��� ���ÿ� ���� �����Ѵ�.
 * 2. ī�װ��� �� ���� ù��° ���� �����Ѵ�.
 * 3. �������� �� ���� �ι�° ���� �����Ѵ�.
 *  ��, �������� �������� �߰��� �� �ֵ��� ������(/)�� �����ڷ� �����Ѵ�.
 * ��)
 * {
 *   {"����", "���/����/"},
 *   {"����", "Ȩ����/������/"},
 *   {"����", "�ݶ�/"},
 *   {"����", "�Ұ��/"}
 *   ...
 * }
 * 
 */
import java.util.Scanner;

public class Ch03_11_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[][] items = new String[100][2];
		for(int i=0; i<items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		
		int itemCount = 0;
		
		while(true) {
			
			
			System.out.println("1.ī�װ��߰� 2.�������߰� 3.��ü��ǰ���");
			System.out.print("�޴�����:");
			int sel = scan.nextInt();
			if(sel==1) {
				System.out.print("ī�װ��̸��Է�:");
				String category = scan.next();
				items[itemCount][0] = category;
				items[itemCount][0] += ":";
				itemCount += 1;
			}else if(sel==2) {
				System.out.print("ī�װ���ȣ����:");
				int categoryNum = scan.nextInt();
				System.out.print("�������Է�:");
				String item = scan.next();
				items[categoryNum][1] += item;
				items[categoryNum][1] += "/";
			
			}else if(sel==3) {
				for(int i=0; i<itemCount; i++) {
					System.out.println(items[i][0]+":"+items[i][1]);
				}
			}
			
		}
		
		
	}
}
