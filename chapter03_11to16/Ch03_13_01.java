package chapter03_11to16;

/*
 * # 2���� �迭[����]
 * �̸��� ��ȣ�� �Է¹޾� �����ϱ�
 * ��)
 * �Է� : ö��1
 * ���� : ���
 * 
 * �Է� : ö��2
 * ���� : �ٳ���
 */
import java.util.Scanner;

public class Ch03_13_01 {

	public static void main(String[] args) {
		String[][] jang = { { "ö��", "�Ұ��" }, 
							{ "ö��", "���" }, 
							{ "ö��", "��ġ" }, 
							{ "����", "���" }, 
							{ "����", "����" },
							{ "ö��", "�����" } };

		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<jang.length;i++) {
			System.out.println(jang[i][0]+" : "+jang[i][1]);
		}
		
		System.out.print("������ �̸� �Է� : ");
		String name = scan.next();
		System.out.print("������ ��ȣ �Է� : ");
		int idx = scan.nextInt();

		int cnt = 0;
		int delidx = 0;
		
		for(int i=0; i<jang.length; i++) {
			if(jang[i][0].equals(name)) {
				if(cnt==idx) {
					System.out.println("�����ҹ�ǰ:"+jang[i][1]);
					delidx = i;
				}
				cnt += 1;
			}
		}
		
		String[][] temp = jang;
		jang = new String[temp.length-1][2];
		
		int j = 0;
		for(int i=0; i<temp.length; i++) {
			if(i!=delidx) {
				jang[j] = temp[i];
				j = j + 1;
			}
		}
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0]+":"+jang[i][1]);
		}
		
		
		
		
		
		
		

	}

}
