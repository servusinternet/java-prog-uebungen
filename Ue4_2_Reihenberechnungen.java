public class Ue4_2_Reihenberechnung {
	public static void main(String[] args) {
		
		double summe = 0;
		double aenderung = 1;
		double x = Math.pow(10, -5);
				
		for (int k = 1 ; aenderung >= x; k++) {
			aenderung = 1/(double)(k*k);
			summe = summe + aenderung;
			System.out.println(k + ". Durchlauf: 6*" + summe + " = " + 6*summe);
			//System.out.println(aenderung);
		}
		
	}
	
}
