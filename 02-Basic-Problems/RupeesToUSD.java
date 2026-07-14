//Input currency in rupees and output in USD.
//At 14 Jul, 1:54 pm UTC 2026 the exchange rates where these
import java.util.Scanner;
public class RupeesToUSD{
	public static void main(String[] args){
		System.out.println("Enter the rupees: ");
		Scanner input = new Scanner(System.in);
		double rupee = input.nextDouble();
		double dollar = rupee * 0.010 ;
		System.out.println("You have "+dollar+"$");

	}

}

