import java.util.Scanner;

public class Ue7_1_Rekursion {
	public static float potenz(float basis, int exponent) {
		if (exponent == 0) return 1;
		if (exponent == 1) return basis;
		return basis*potenz(basis, exponent-1);		
	}
	
	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		do {
			System.out.print("Basis x: ");
			float basis = eingabe.nextFloat();
			System.out.print("Exponent n: ");
			System.out.println(potenz(basis, eingabe.nextInt()));
		} while (true);
	}
}
