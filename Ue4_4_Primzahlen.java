import java.util.Scanner;

public class Ue4_4_Primzahlen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben zu untersuchende Zahl eingeben:");
		int zahl = scanner.nextInt();
		
		int rest;
		int x = 2; 
		
		do {
			rest = zahl%x;
			x++;
			System.out.println(x);
		} while (x < zahl && rest != 0);
		
		if (x == zahl) {
			System.out.println("Primzahl.");
		} else {
			System.out.println("Koa Primzahl.");
		}
		scanner.close();
	}
}
