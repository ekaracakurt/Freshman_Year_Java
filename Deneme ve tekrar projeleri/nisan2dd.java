import java.util.Scanner;
public class nisan2dd {
	public static void main (String [] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//var
		
		String ad1, ad2, ad3, ad4, soyad1, soyad2, soyad3, soyad4;
		int yas1, yas2, yas3, yas4;
		//inputs
		
		System.out.println("Rezervasyon yapılacak 1. kişinin adı:");
		ad1 = keyboard.nextLine();
		System.out.println("Rezervasyon yapılacak 1. kişinin soyadı:");
		soyad1 = keyboard.nextLine();
		System.out.println("Rezervasyon yapılacak 1. kişinin yaşı:");
		yas1 = keyboard.nextInt();
		
		System.out.println("Rezervasyon yapılacak 2. kişinin adı:");
		ad2 = keyboard.nextLine();
		ad2 = keyboard.nextLine();
		System.out.println("Rezervasyon yapılacak 2. kişinin soyadı:");
		soyad2 = keyboard.nextLine();
		System.out.println("Rezervasyon yapılacak 2. kişinin yaşı:");
		yas2 = keyboard.nextInt();
		
		System.out.println("Rezervasyon yapılacak 3. kişinin adı:");
		ad3 = keyboard.nextLine();
		ad3 = keyboard.nextLine();
		System.out.println("Rezervasyon yapılacak 3. kişinin soyadı:");
		soyad3 = keyboard.nextLine();
		System.out.println("Rezervasyon yapılacak 3. kişinin yaşı:");
		yas3 = keyboard.nextInt();
		
		System.out.println("Rezervasyon yapılacak 4. kişinin adı:");
		ad4 = keyboard.nextLine();
		ad4 = keyboard.nextLine();
		System.out.println("Rezervasyon yapılacak 4. kişinin soyadı:");
		soyad4 = keyboard.nextLine();
		System.out.println("Rezervasyon yapılacak 4. kişinin yaşı:");
		yas4 = keyboard.nextInt();
		
		
		//output
		
		System.out.println("Rezervasyonu alınan kişilerin bilgileri aşağıdaki gibidir: " + "\n" + ad1 + ", " + soyad1 + ", " + yas1 + "\n" + 
				ad2 + ", " + soyad2 + ", " + yas2 + "\n" + ad3 + ", " + soyad3 + ", " + yas3 + "\n" + ad4 + ", " + soyad4 + ", " + yas4 );
		
		//isim soyisim sondan 2
		
		int s2_ad1, s2_soyad1, s2_ad2, s2_soyad2, s2_ad3, s2_soyad3, s2_ad4, s2_soyad4;
		
		s2_ad1 = ad1.length();
		s2_soyad1 = soyad1.length();
		s2_ad2 = ad2.length();
		s2_soyad2 = soyad2.length();
		s2_ad3 = ad3.length();
		s2_soyad3 = soyad3.length();
		s2_ad4 = ad4.length();
		s2_soyad4 = soyad4.length();
		
		s2_ad1 -= 2 ;
		s2_soyad1 -= 2 ;
		s2_ad2 -= 2 ;
		s2_soyad2 -= 2 ;
		s2_ad3 -= 2 ;
		s2_soyad3 -= 2 ;
		s2_ad4 -= 2 ;
		s2_soyad4 -= 2 ;
		
		 char ad1_2 = ad1.charAt(s2_ad1) ;
		 char soyad1_2 = soyad1.charAt(s2_soyad1) ;
		 char ad2_2 = ad2.charAt(s2_ad2) ;
		 char soyad2_2 = soyad2.charAt(s2_soyad2) ;
		 char ad3_2 = ad3.charAt(s2_ad3) ;
		 char soyad3_2 = soyad3.charAt(s2_soyad3) ;
		 char ad4_2 = ad4.charAt(s2_ad4) ;
		 char soyad4_2 = soyad4.charAt(s2_soyad4) ;
		 
		
		//sondan 2. harfler output
		
		System.out.println("Güvenlik amacıyla kullanılacak olan rezervasyonlu kişilerin isim ve soyisimlerinin sondan 2. harfleri aşağıdaki gibidir:" +
		"\n" + "1. kişinin : " + ad1_2 + ", " + soyad1_2 + "\n" + "2. kişinin : " + ad2_2 + ", " + soyad2_2 + "\n" + "3. kişinin : " + ad3_2 + 
		", " + soyad3_2 + "\n" + "4. kişinin : " + ad4_2 + ", " + soyad4_2 );
		
		keyboard.close();
		
	}

}
