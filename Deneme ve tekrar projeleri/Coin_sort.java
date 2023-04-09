
public class Coin_sort {

	public static void main(String[] args) {
		
		int coin_value,coin_50,coin_25,coin_10,coin_5,coin_1;
		
		coin_value = 523;
		
		System.out.println("You have " + coin_value + " kurus.");
		
		coin_50 = coin_value / 50 ;
		coin_value = coin_value % 50;
		coin_25 = coin_value / 25 ; 
		coin_value = coin_value % 25;
		coin_10 = coin_value / 10 ; 
		coin_value = coin_value % 10;
		coin_5 = coin_value / 5 ; 
		coin_value = coin_value % 5;
		coin_1 = coin_value / 1 ; 
		coin_value = coin_value % 1 ;
		
		
		
		
		
		System.out.println("It can be separated with minimum count of coins as: ");
		System.out.println(coin_50 + " 50's,");
		System.out.println(coin_25 + " 25's,");
		System.out.println(coin_10 + " 10's,");
		System.out.println(coin_5 + " 5's and " + coin_1 +" 1's.");
		System.out.println("Have a great day!");
		
		
		// TODO Auto-generated method stub

	}

}
