package chapter03_11to16;
/*
 * # 2���� �迭[����]
 * ���� : ��
 * ���� : ���
 * ���� : ���
 * ö�� : ���
 * ö�� : ���
 */

public class Ch03_13_02 {

	public static void main(String[] args) {
			
		String[][] jang = {
				{"ö��", "���"},
				{"����", "��"},
				{"ö��", "���"},
				{"����", "���"},
				{"����", "���"}
		};
		
		for(int i=0;i<jang.length; i++) {      //jang[i] : heap �ּ� 
			System.out.println(jang[i]);
		}
		
		//1.�̸����� ���ؼ� ����
		for(int i=0; i<jang.length; i++) {
			String minName=jang[i][0]; 
			int minidx = i;
			for(int j=i+1; j<jang.length; j++) {
				if(minName.compareTo(jang[j][0])>0) {
					minName = jang[j][0];
					minidx = j;
				}
			}
			String[] temp = jang[i];
			jang[i] = jang[minidx];
			jang[minidx] = temp;
		}
		//2.�̸��� ���� ���ǾƷ����� �����۸����� ����
		for(int i=0; i<jang.length; i++) {
			String minname = jang[i][0];
			String minitem = jang[i][1];
			int minidx = i;
			for(int j=i+1; j<jang.length; j++) {
				if(minitem.compareTo(jang[j][1])>0&&minname.equals(jang[j][0])) {
					minitem = jang[j][1];
					minidx = j;
				}
			}
			String[] temp = jang[i];
			jang[i] = jang[minidx];
			jang[minidx] = temp;
			
		}
		
		//3.���
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0]+":"+jang[i][1]);
		}
		
	}

}
