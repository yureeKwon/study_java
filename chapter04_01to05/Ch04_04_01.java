package chapter04_01to05;

/*
 * # �����ձ� ����
 * ���þ� : ������
 * �Է� : �Ź�
 * ���þ� : �Ź�
 * �Է� : �̼�
 * ...
 */
import java.util.Scanner;

public class Ch04_04_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String start = "������";
		
		
		boolean run = true;
		while(run) {
			System.out.println("���þ�:"+start);
			char lastword = start.charAt(start.length()-1);
			System.out.print("�Է�:");
			String input = scan.next();
			char firstword = input.charAt(0);
			if(lastword!=firstword) {
				System.out.println("�ٽ��Է�");
				continue;
			}else {
				start = input;
			}
		}

	}

}
