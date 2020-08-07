package chapter03_11to16;
/*
 * # 2Â÷¿ø ¹è¿­[Á¤·Ä]
 * ¿µÈñ : °¨
 * ¿µÈñ : ±è¹ä
 * ¿µÈñ : »ç°ú
 * Ã¶¼ö : ±è¹ä
 * Ã¶¼ö : »ç°ú
 */

public class Ch03_13_02 {

	public static void main(String[] args) {
			
		String[][] jang = {
				{"Ã¶¼ö", "±è¹ä"},
				{"¿µÈñ", "°¨"},
				{"Ã¶¼ö", "»ç°ú"},
				{"¿µÈñ", "»ç°ú"},
				{"¿µÈñ", "±è¹ä"}
		};
		
		for(int i=0;i<jang.length; i++) {      //jang[i] : heap ÁÖ¼Ò 
			System.out.println(jang[i]);
		}
		
		//1.ÀÌ¸§ºÎÅÍ ºñ±³ÇØ¼­ Á¤·Ä
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
		//2.ÀÌ¸§Àº °°Àº Á¶°Ç¾Æ·¡¿¡¼­ ¾ÆÀÌÅÛ¸íÀ¸·Î Á¤·Ä
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
		
		//3.Ãâ·Â
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0]+":"+jang[i][1]);
		}
		
	}

}
