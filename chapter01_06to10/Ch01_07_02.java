package chapter01_06to10;

/*
 * # �α���[1�ܰ�]
 * 1. ID�� PW�� �Է� �޴´�. 
 * 2. �Է¹��� �����Ϳ� db�����͸� ���� �α��� ó���� �����Ѵ�.
 * ��) �α��� ���� or �α��� ����
 */
import java.util.Scanner;

public class Ch01_07_02 {

	public static void main(String[] args) {
		
		int dbID = 1234;
		int dbPW = 1111;
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("ID PW �Է��ϼ���");

        int myID = scan.nextInt();
        int myPW = scan.nextInt();
		
		if(myID == dbID) {
			if(myPW == dbPW) {
				System.out.println("�α��� ����");
			}else{
				System.out.println("�α��� ����");
			}
		}else {
			System.out.println("�α��� ����");
		}
		

	}

}
