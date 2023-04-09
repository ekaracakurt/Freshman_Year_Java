import java.util.Scanner;
public class StringPlay {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String input_1, last_2_inp_1, lowc_inp_1, uppc_inp_1, repl_inp_1, conc_inp_1, cmpe_wor, ba_wor_ws_1 ;
		int len_1, index1_j_1, len_conc_1, index1_ws_1 ;
		boolean comp_uppc_lowc_1 ;
		char fifth_inp_1 ;
		//input
		
		System.out.println("Please enter a String:");
		input_1 = keyboard.nextLine();		
		
		//last 2 char input 1
		
		len_1 = input_1.length();
		last_2_inp_1 = input_1.substring(len_1 - 2);
		System.out.println("Last two characters in your entry is: " + last_2_inp_1);
				
		//print out length
		
		System.out.println("Your entry has: " + len_1 + " characters");
		
		//upper lower case
		
		uppc_inp_1 = input_1.toUpperCase();
		lowc_inp_1 = input_1.toLowerCase();
		System.out.println("The UPPERCASE value of the string you entered is: " + uppc_inp_1);
		System.out.println("The lowercase value of the string you entered is: " + lowc_inp_1);
		
		//compare uppc and lowc strings
		
		comp_uppc_lowc_1 = uppc_inp_1.equalsIgnoreCase(lowc_inp_1);
		System.out.println("Are they equal? " + comp_uppc_lowc_1);
		
		//first index of "j"
		
		index1_j_1 = input_1.indexOf("j");
		System.out.println("Index of character 'j' in your entry is: " + index1_j_1);
		
		//replace 5th char with "!"
		
		fifth_inp_1 = input_1.charAt(4);
		repl_inp_1 = input_1.replace(fifth_inp_1, '!');
		System.out.println("The fifth character is replaced.: " + repl_inp_1);
		
		//concatenate with "-cmpe113-" and its length
		
		cmpe_wor = "-cmpe113-" ;
		conc_inp_1 = input_1.concat(cmpe_wor);
		len_conc_1 = conc_inp_1.length();
		System.out.println("The strings are concatenated: " + conc_inp_1 + "It's length becomes: " + len_conc_1);
		
		//first white space and the letters before and after
		
		index1_ws_1 = input_1.indexOf(" ");
		ba_wor_ws_1 = input_1.substring(index1_ws_1 - 1, index1_ws_1 + 2);
		System.out.println(ba_wor_ws_1);
		
		keyboard.close();
		// TODO Auto-generated method stub

	}

}
