public class Ue4_3_Einmaleins {
	public static void main(String[] args) {
		for (int n=1; n < 11; n++) {
			int m = 1;
			System.out.println("");
			do {
				System.out.println(n + " * " + m + " = " + ((int)n*(int)m++) );
			} while (m < 11);
		}
		
	}
}
