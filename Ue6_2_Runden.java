import java.util.Scanner;

public class Ue6_2_Runden {
	
	public static int einfachesRunden(double zahl) {
		int zehner = (int)(zahl*10);
		int modulo = zehner%10;
		int ergebnis;
		if (modulo<5) {
			ergebnis = (zehner - modulo)/10;
		} else {
			ergebnis = (zehner + (10-modulo)) / 10;
		}
		return ergebnis;
	}
	
	public static double aufNksRunden(double zahl, int nks) {
		// a = (10^nks), b = zahl * (10^nks)
		double a = 1;
		for (int i=1;i<=nks;i++) {
			a = a*10;
		}
		double b = zahl*a;
		
		int zehner = (int)(b*10);
		int modulo = zehner%10;
		double ergebnis;
		if (modulo<5) {
			ergebnis = ((zehner - modulo)/10) / a;
		} else {
			ergebnis = ((zehner + (10-modulo)) / 10) / a;
		}
		return ergebnis;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zahl:");
		double zahl = scanner.nextDouble();		
		System.out.println("Anzahl Nachkommastellen:");
		int nks = scanner.nextInt();	
		
		System.out.println(zahl + " gerundet ergibt " + einfachesRunden(zahl) );
		System.out.println(zahl + " auf " + nks + " Nachkommstellen gerundet ergibt " + aufNksRunden(zahl, nks) );
		
		scanner.close();
	}
}
