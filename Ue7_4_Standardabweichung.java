package prog.Uebungen;

import java.util.Scanner;

public class Ue7_4_Standardabweichung {
	
	public static double standardabweichung(double[] zahlen, double mittel, int n) {
		double a = 0;
		for (int i=0; i < n; i++) {
			 a = a + Math.pow((zahlen[i]-mittel),2);
		}
		double b = a / n;
		double abweichung = Math.sqrt(b);
		return abweichung;
	}
		
	public static void main(String[] args) {
		double groessterWert = -1;
		double kleinsterWert = -1;
		double ergebnis = 0;
		
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Anzahl Werte:");
		int n = eingabe.nextInt();
		
		double[] zahlen = new double[n];
		
		for (int i=1; i <= n; i++) {
			System.out.print("Wert x" + i + ": ");
			double x = eingabe.nextDouble();
			zahlen[i-1] = x;
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
		
		double mittel = ergebnis/n;
		
		System.out.println("Größter Wert: " + groessterWert);
		System.out.println("Kleinster Wert: " + kleinsterWert);
		System.out.println("Arithm. Mittelwert: " + mittel);
		System.out.println("Standardabweichung: " + standardabweichung(zahlen, mittel, n));
		eingabe.close();
	}
}
