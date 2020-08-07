package chapter03_11to16;
import java.util.Random;
/*
 * # 1부터 5 사이의 랜덤 숫자를 2개씩 arr배열에 저장하기
 * 예) 1 3 2 1 4 4 5 2 3 2
 * * 추가조건 셔플사용금지
 */
public class Ch03_13_05 {

	public static void main(String[] args) {

	Random ran = new Random();
	
	int[] arr = new int[10];
	
	for(int i=0; i<10; i++) {
		int cnt=0;
		arr[i] = ran.nextInt(5)+1;
		for(int j=0;j<i;j++) {
			if(arr[i]==arr[j]) {
				cnt += 1;
			}
		}
		if(cnt==2) {
			i -= 1;
		}
	}
	
	for(int i=0; i<10;i++) {
		System.out.print(arr[i]+" ");
	}
	
	}

}
