package chapter04_06to10;

/*
 * # �ܾ�˻�
 * 1. �ܾ �Է¹޾� text���� ���� �ӿ� �ش� �ܾ �ִ��� �˻��Ѵ�.
 * 2. �ܾ �����ϸ� true, �������� ������ false�� ����Ѵ�.
 */
import java.util.Scanner;

public class Ch04_09_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);

		System.out.print("�˻��� �ܾ �Է��ϼ��� : ");
		String word = scan.next();
		
		char[] arr = new char[text.length()];
		for(int i=0; i<text.length(); i++) {
			arr[i] = text.charAt(i);
		}
		
		int check = -1;
		int size = word.length();
		
		for(int i=0; i<text.length()-(size-1); i++) {
			int cnt = 0;
			for(int j=0; j<size; j++) {
				if(arr[i+j]==word.charAt(j)) {
					cnt+=1;
				}
			}
			if(cnt == size) {
				check = 1;
			}
		}
		if(check==1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		

	}

}
