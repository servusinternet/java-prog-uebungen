import java.util.Scanner;

public class Ue5_4_Potenz {
	
	public static double potenziere(double basis, int exponent) {
		
		double ergebnis = 1;
		
		if (exponent == 0) {
			ergebnis = 1;
		} else if (exponent > 0) {
			for (int i = 1; i <= exponent; i++) {
				ergebnis = ergebnis * basis;
			}
		} else {
			for (int i = 1; -i >= exponent; i++) {
				ergebnis = ergebnis * basis;
				if (-i == exponent) {
					ergebnis = 1 / ergebnis;
				}
			}
		}
		
		return ergebnis;
	}
	
	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Basis a:");
		double a = eingabe.nextDouble();
		System.out.println("Exponent b:");
		int b = eingabe.nextInt();
		
		System.out.println(a + " hoch " + b + " = " + potenziere(a,b));
		
		eingabe.close();
		
	}
}
