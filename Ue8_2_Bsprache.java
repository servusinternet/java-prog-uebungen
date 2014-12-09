import java.util.Scanner;


public class Ue8_2_Array {
	
	public static void main(String[] args) {	
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Wort:");
		String Wort = eingabe.nextLine();
		System.out.println(bSprache(Wort) );
		eingabe.close();
	}
	
	public static String bSprache(String Wort) {
		char[] WortArray = Wort.toCharArray();

		char[] WortBArray = new char[WortArray.length*3];
		int x = 0;
		
		for	(int i=0; i < WortArray.length; i++) {
			if (WortArray[i] == 97 | WortArray[i] == 101 | WortArray[i] == 105 | WortArray[i] == 111 | WortArray[i] == 117 ) {
				WortBArray[i+x] = WortArray[i];
				WortBArray[i+x+1] = 98;
				WortBArray[i+x+2] = WortArray[i];
				x = x+2;
			} else {
				WortBArray[i+x] = WortArray[i];
			}
		}		
		String WortB = String.valueOf(WortBArray);
		return WortB;
	}	
}
