package prog.Uebungen;

import java.util.Scanner;

public class Ue7_2_Sinusberechnung {
	
	/**
	 * Diese Klasse "Ue7_2_Sinusberechnung" berechnet sin(x)
	 * @author servusinternet
	 * @param x eine reelle Zahl, deren sinus berechnet werden soll.
	 * @return Ergebnis der sinus-Berechnung von x, also sin(x)
	 *
	 */

	public static double sinus(double x) {
		// Erste Berechnung für k=0 --> 1*(x/1!)=x; 
		double zaehler = x;
		double nenner = 1;
		double summe = x;
		double summand = 1;
		for (int i=2; summand > 1E-15 || summand < -1E-15; i=i+2) {
			zaehler = zaehler * x * x * (-1);
			nenner = nenner * i * (i+1); 
			summand = zaehler / nenner;
			summe = summe + summand;
			// Anzahl der Durchäufe anzeigen
			//System.out.println((i/2) + ". Durchgang, " + "summe = " + summe);
		} 
		return summe;
	}	
	
	// main Methode zur einfachen Ausgabe in der Klasse 
	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		System.out.print("x:");
		double x = eingabe.nextDouble();
		System.out.println("Sinus von x = " + sinus(x));
		eingabe.close();
		// Überprüfen der Werte
		//System.out.println(Math.sin(x));
	} 
	
}
