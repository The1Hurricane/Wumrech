package wumrech_main;
import java.util.Scanner;


public class Wumrech_main {
	public static void main(String[] args) {
		String euroSymbol = " Euro";

		System.out.println("Gib den umzurechnenden Betrag in Euro an: ");

		

		Scanner gegebenerBetrag = new Scanner(System.in);
		System.out.println("Dein angegebener Betrag sind: " + gegebenerBetrag.nextLine() + euroSymbol + " Ist das korrekt? J/N?");
        
		Scanner userJaNein = new Scanner(System.in);
		System.out.println("Deine Angabe ist: " + userJaNein.nextLine());
		
		

		
		
		
		
	}

}
