package chapter01_16to20;
/*
 * # īī�� �ý�
 * 1. �մ��� �¿� ���������� �̵��ϴ� �����̴�.
 * 2. -10~10 ������ ���� ���� 2���� ������ �������� �����Ѵ�.
 * 3. �޴��� �Ʒ��� ����.
 * 		1) �ӵ����� : 1~3������ ����
 * 		2) ���⼳�� : ��(1)��(2)��(3)��(4)
 * 		3) �̵��ϱ� : ������ �������� ������ �ӵ���ŭ �̵�
 * 4. �Ÿ� 2ĭ �� 50���� �߰��Ǿ� ��ݵ� ����Ѵ�.
 * ��) 1(50) 2(50) 3(100) 4(100) ...
 */
import java.util.Scanner;
import java.util.Random;

public class Ch01_20_02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int desX = ran.nextInt(21)-10;
		int desY = ran.nextInt(21)-10;
		
		int x =0; int y = 0;
		int speed = 0;
		int dir = 0;
		int charge = 0;
		int totalCharge = 0;

		System.out.println("������:"+desX+","+desY);
		boolean run = true;
		while(run) {
			System.out.println("������ġ:"+x+","+y);
			System.out.println("�޴�����");
			System.out.print("1.�ӵ����� 2.���⼳�� 3.�̵��ϱ�");
			int sel = scan.nextInt();
			
			if(sel==1) {
				System.out.print("�ӵ��Է�:");
				speed = scan.nextInt();
				if((speed+1)%2==0) {
					charge = 50+speed/2*50;
				}else {
					charge = speed/2*50;
				}
				System.out.println(speed+"("+charge+"��)");
			}else if(sel==2) {
				System.out.print("�����Է�:");
				dir = scan.nextInt();
			}else if(sel==3) {
				if(dir==1) {
					x -= speed;
				}else if(dir==2) {
					x += speed;
				}else if(dir==3) {
					y += speed;
				}else if(dir==4) {
					y -= speed;
				}
				
				totalCharge += charge;
				System.out.println("�����ݾ�"+totalCharge+"��");
			}
			
			if(desX==x&&desY==y) {
				System.out.println("������ ����");
				System.out.println("�ѿ��:"+totalCharge+"��");
				run = false;
			}
			
		}
		
		
	}
}
