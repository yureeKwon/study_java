package chapter01_16to20;
/*
 * # 카카오 택시
 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
 * 3. 메뉴는 아래와 같다.
 * 		1) 속도설정 : 1~3까지만 가능
 * 		2) 방향설정 : 동(1)서(2)남(3)북(4)
 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
 * 4. 거리 2칸 당 50원씩 추가되어 요금도 출력한다.
 * 예) 1(50) 2(50) 3(100) 4(100) ...
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

		System.out.println("목적지:"+desX+","+desY);
		boolean run = true;
		while(run) {
			System.out.println("현재위치:"+x+","+y);
			System.out.println("메뉴선택");
			System.out.print("1.속도설정 2.방향설정 3.이동하기");
			int sel = scan.nextInt();
			
			if(sel==1) {
				System.out.print("속도입력:");
				speed = scan.nextInt();
				if((speed+1)%2==0) {
					charge = 50+speed/2*50;
				}else {
					charge = speed/2*50;
				}
				System.out.println(speed+"("+charge+"원)");
			}else if(sel==2) {
				System.out.print("방향입력:");
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
				System.out.println("누적금액"+totalCharge+"원");
			}
			
			if(desX==x&&desY==y) {
				System.out.println("목적지 도착");
				System.out.println("총요금:"+totalCharge+"원");
				run = false;
			}
			
		}
		
		
	}
}
