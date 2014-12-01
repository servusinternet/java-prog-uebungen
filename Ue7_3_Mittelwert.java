package prog.Uebungen;

import java.util.Scanner;

public class Ue7_3_Mittelwert {
	public static void main(String[] args) {
		double groessterWert = -1;
		double kleinsterWert = -1;
		double ergebnis = 0;
		
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Anzahl Werte:");
		int n = eingabe.nextInt();
		
		while (n < 1) {
			System.out.println("Bitte eine Zahl > 0 eingeben! \n Anzahl Werte:");
			n = eingabe.nextInt();
		}
		
		for (int i=1; i <= n; i++) {
			System.out.print("Wert x" + i + ": ");
			double x = eingabe.nextDouble();
			if (kleinsterWert == -1) {
				kleinsterWert = x;
			} else if (kleinsterWert > x) {
				kleinsterWert = x;
			}
			if (x > groessterWert) {
				groessterWert = x;
			}
			ergebnis = ergebnis + x;
		}
		System.out.println("Größter Wert: " + groessterWert);
		System.out.println("Kleinster Wert: " + kleinsterWert);
		System.out.println("Arithm. Mittelwert: " + ergebnis/n);
		eingabe.close();
	}
}
