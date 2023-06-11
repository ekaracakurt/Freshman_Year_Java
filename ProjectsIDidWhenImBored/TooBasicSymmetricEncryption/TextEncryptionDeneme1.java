import java.util.*;
public class TextEncryptionDeneme1 {
	
	public static void main (String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//var
		String txtinp, encrykey;
		char trfm;
		int intrfm;
		
		//input
		
		System.out.println("Please enter text: ");
		txtinp = keyboard.nextLine();
		System.out.println("Please enter a 14 digit integer as text encryption key: ");
		encrykey = keyboard.nextLine();
		encrykey = encrykey.trim();
		//key ops
		
		int k1 = Integer.parseInt(encrykey.substring(0,1));
		int k2 = Integer.parseInt(encrykey.substring(1,2));
		int k3 = Integer.parseInt(encrykey.substring(2,3));
		int k4 = Integer.parseInt(encrykey.substring(3,4));
		int k6 = Integer.parseInt(encrykey.substring(5,6));
		int k7 = Integer.parseInt(encrykey.substring(6,7));
		int k8 = Integer.parseInt(encrykey.substring(7,8));
		int k9 = Integer.parseInt(encrykey.substring(8,9));
		int k10 = Integer.parseInt(encrykey.substring(9,10));
		int k11 = Integer.parseInt(encrykey.substring(10,11));
		int k12 = Integer.parseInt(encrykey.substring(11,12));
		int k13 = Integer.parseInt(encrykey.substring(12,13));
		int k14 = Integer.parseInt(encrykey.substring(13,14));
		
		int key_x = (k1 * k4) - k7 ;
		int key_y = ((k2 - k3) * k10) + k9 ;
		int key_z = 2*(k14 + k6) - k11 ;
		int key_t = ((k13 + k12) - k8) ;
		
		
		//encryption ops
		int rem_select ;
		int count = 0;
		int encryptiontime = txtinp.length();
		do {
			
			trfm = txtinp.charAt(count);
			intrfm = trfm;
			rem_select = count % 4;
			switch (rem_select) {
			
			case 0:
				intrfm += key_x ; 
				trfm = (char) intrfm ;
				System.out.print(trfm);
				break;
			case 1:
				intrfm -= key_y ; 
				trfm = (char) intrfm ;
				System.out.print(trfm);
				break;
			case 2:
				intrfm -= key_z ; 
				trfm = (char) intrfm ;
				System.out.print(trfm);
				break;
			case 3:
				intrfm += key_t ; 
				trfm = (char) intrfm ;
				System.out.print(trfm);
				break;
					
			}
				count++;		
		}
		while (count < encryptiontime);
		
		

		keyboard.close();
	}
	
	
	
	

}
