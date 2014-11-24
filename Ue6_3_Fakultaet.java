import java.util.Scanner;

public class Ue6_3_Fakultaet {
	
	public static int fakultieren(int eingabe) {
		int ergebnis = 1;
		for (int i=1; i<=eingabe; i++) {
			ergebnis = ergebnis * i;
		}
		return ergebnis;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zu fakultierende Zahl: ");
		System.out.println(fakultieren(scanner.nextInt()) );
		
		scanner.close();
	}
}
