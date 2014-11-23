import java.util.Scanner;

public class Ue6_1_Rechtecknaeherung {
	
	public static void main(String[] args) {
		System.out.println("Anzahl der zu verwendenden Rechtecke:");
		Scanner anzahlRechtecke = new Scanner(System.in);
		int n = anzahlRechtecke.nextInt();
		
		double ergebnis = 0;
		
		for (int i=1; i <= n; i++) {
			// a = (i-1)/ n
			double a = (double)(i-1)/n;
			// b = a²
			double b = (Math.pow(a, 2));
			// c = Wurzel[1 - (a²)]
			double c = Math.sqrt(1-b);
			// d = 1/n * c
			double d = (double)1/n * c;
			ergebnis = ergebnis + (double)d;
			/*System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);
			System.out.println(ergebnis);	*/		
		}
		
		double kreiszahl = (double)(4 * ergebnis);
		
		System.out.println("Bei " + n + " Rechtecken ergibt die Näherung PI = " + kreiszahl);
		
		anzahlRechtecke.close();
	}
	
}
