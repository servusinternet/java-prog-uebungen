import java.util.Random;
import java.util.Arrays;

public class Ue8_1_Lottoziehung {
	public static void main(String[] args) {
		int[] zahlen = new int[6];
		for (int i=0; i<6; i++) {
			//zahlen[i] = (int)(Math.random()*100)/2;
			Random rand = new Random();
			zahlen[i] = rand.nextInt(49) + 1;
			// Keine doppelten Zahlen:
			for (int n=1; n<6; n++) {
				if (zahlen[i] == zahlen[n] && i>0 && i!=n) {
					i = i-1;
				}
			}	
		}
		
		Arrays.sort(zahlen);
		System.out.print("Die Lottozahlen: ");
		for (int i=0; i<zahlen.length; i++) {
			System.out.print(zahlen[i] + " ");
		}
		
	}
}
