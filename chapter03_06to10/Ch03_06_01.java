package chapter03_06to10;
/*
 * # �����ϱ�
 * 1. �ε��� 0���� �������� �˻��Ѵ�.
 * 2. ���� ū ���� ã�� ��ȯ�Ѵ�.
 * 3. �ε��� 1 �����Ѵ�.
 * 4. [1~3]�� ������ �ݺ��Ѵ�.
 * ��)
 * 10, 50, 30, 40, 80, 7 10�̶� 80 �ٲ�
 * 80, 50, 30, 40, 10, 7 50 �״��
 * 80, 50, 30, 40, 10, 7 30�̶� 40 �ٲ�
 * 80, 50, 40, 30, 10, 7 
 */

public class Ch03_06_01 {

	public static void main(String[] args) {

		int[] score = {10, 50, 30, 40, 80, 7};

		int idx = 0;
		
		while(idx<6) {
			int maxNum = score[idx];
			int maxIdx = idx;
			
			for(int i=idx; i<6; i++) {
				if(maxNum<score[i]) {
					maxNum=score[i];
					maxIdx=i;
				}
			}
			int temp = score[idx];
			score[idx] = score[maxIdx];
			score[maxIdx] = temp;
			
			idx += 1;
			
			if(idx==5) {
				for(int i=0; i<score.length; i++) {
					System.out.print(score[i]+" ");
				}
			}
		}
		
		
		
		
	}

}
