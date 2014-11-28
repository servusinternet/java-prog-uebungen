package prog.Uebungen;

public class Ue7_2_Sinusberechnung {
	
	/**
	 * Diese wundervolle Klasse "Ue7_2_Sinusberechnung" berechnet sin(x)
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
		for (int i=2; summand < -1E-20 || summand > 1E-20; i=i+2) {
			zaehler = zaehler * x * x * (-1);
			nenner = nenner * i * (i+1); 
			summand = zaehler / nenner;
			summe = summe + summand;
			// Anzahl der Durchäufe abfragen
			//System.out.println((i-1) + ". Durchgang"); 
		}
		return summe;
	}	
	
	// main Methode zur einfachen Ausgabe als Übung 
	public static void main(String[] args) {
		double x = 5;
		System.out.println(sinus(x));
	} 
	
}
