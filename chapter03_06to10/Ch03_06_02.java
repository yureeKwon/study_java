package chapter03_06to10;
/*
 * # ���� ���
 * ���� ������ �̸� ���
 */

public class Ch03_06_02 {

	public static void main(String[] args) {

		String[] name = {"ȫ�浿", "�迵", "�ڹ�ŷ", "�κ�ö", "�ް���"};
		int[] score = {87, 42, 100, 11, 98};

		for(int i=0;i<score.length-1;i++) {
			int maxNum = score[i];
			int maxidx = i;
			for(int j=i+1;j<score.length;j++) {
				if(maxNum<score[j]) {
					maxNum=score[j];
					maxidx = j;
				}
			}
			int temp = score[i];
			score[i] = score[maxidx];
			score[maxidx] = temp;
			
			String stemp = name[i];
			name[i] = name[maxidx];
			name[maxidx] = stemp;
		}
		
		System.out.print("���������:");
		for(int i=0; i<score.length; i++) {
			System.out.print(name[i]+" ");
		}
		
		
	}

}
