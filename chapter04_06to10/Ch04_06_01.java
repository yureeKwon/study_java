package chapter04_06to10;

/*
 * # ���ڿ� ��
 * equals() �޼��� ������ ������ ��ġ���� ��
 * ��) �ڳ���
 * �Է� : Ƽ����츣��
 * ��� : false;
 */
import java.util.Scanner;

public class Ch04_06_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String name = "�ڳ���";

		System.out.print("�����̸��� �Է��ϼ��� : ");
		String myname = scan.next();
		
		int cnt = 0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)==myname.charAt(i)) {
				cnt+=1;
			}
		}
		
		if(cnt==name.length()) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		

	}

}
