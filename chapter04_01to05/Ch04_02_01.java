package chapter04_01to05;

//# ���ڿ� 1����
public class Ch04_02_01 {

	public static void main(String[] args) {

		String str = "11/100/89";
		// ���� 1) arr �迭�� �� ������ �����ϰ�, ���� ���
		// ���� 1) 200
		String[] strarr = str.split("/");
		int[] arr = new int[strarr.length];
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(strarr[i]);
			total += arr[i];
		}
		System.out.println(total);

		// ���� 2) scores �迭�� �� ������ �����ø� �����ڷ� �ϳ��� ���ڿ��� ����
		// ���� 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		for(int i=0; i<scores.length; i++) {
			text += scores[i];
			if(i!=scores.length-1) {
				text += "/";
			}
		}
		System.out.println(text);

		
		
	}

}
