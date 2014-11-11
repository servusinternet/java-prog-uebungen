import java.util.Scanner;

public class Ue5_2_Querprodukt {
	
	public static int querproduktrechner(int eingabe) {
		if (eingabe > 1000000 || eingabe < 0) {
			return 0;
		} else {
			int querprodukt = 1;
			
			while (eingabe%10 != 0) {
				querprodukt = querprodukt * (eingabe%10);
				eingabe = eingabe/10;
			} 
			return querprodukt;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int eingabe;
		int x;
		
		for (int i=1; i != 0; i++) {

			System.out.println("Bitte Zahl zwischen 1 und 1 Mio. eingeben:");
			
			eingabe = scanner.nextInt();
			
			x = querproduktrechner(eingabe);		
			
			if (x == 0) {
				System.out.println("Sorry - ungültige Zahl.");
			} else {
				System.out.println("Querprodukt von " + eingabe + " = " + querproduktrechner(eingabe));
			}
		}		
		scanner.close();
	}
}
