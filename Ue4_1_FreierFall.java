import java.util.Scanner;


public class Ue4_1_FreierFall {
	public static void main(String[] args) {
		final double g = 9.80665;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie eine Falldauer in Sek. ein:");
		int falldauer = scanner.nextInt();

		//for (int t = 1; t <= falldauer; t++) {
		for (int t = 1; t <= falldauer; t = t+5) {
			System.out.println("Zeit: " + t + " Sekunden: " + " Zurückgelegte Strecke: " + ((double)0.5 * g * t * t) + "m" );	
		}
		scanner.close();
	}
}
