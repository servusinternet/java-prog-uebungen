package rsa_verschluesselung;

public class Receiver {
	public static void main(String[] args) {
		int p1 = 17;
		int p2 = 19;		
		int m = p1*p2;
		int ePhi = (p1-1)*(p2-1);
		

		int e = 43;
		/*
		int e;
		while(true) {
			e = (int)(Math.random()*ePhi);
			if(e>1 && ggT(e, ePhi) == 1) {
				break;
			}
		}*/
		
		// c = encrypted message
		long c = Sender.encryptNr(e, m);
		
		// d = e^-1 mod ePhi(m)
		int d = privateKey(ePhi, e);
		
		// a = decrypted message
		long a = decryptNr(c, m, e, ePhi);
				
		System.out.println("d=" + d + ", e=" + e + ", m=" + m + ", ePhi(m) = " + ePhi);
		System.out.println("Verschlüsselte Nachricht (c):" + c);
		System.out.println( "Entschlüsselte Nachricht (a): " + a);
	}
	
	public static int ggT(int e, int ePhi) {
		int a;
		int b;
		// a,b € N mit a >= b
		if (e >= ePhi) {
			a = e;
			b = ePhi;
		} else {
			a = ePhi;
			b = e;
		}
		int r;
		while (b != 0) {
			r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
	
	/*
	 *  RSA-Entschlüsselungsfunktion: D(c) = c^d mod m, mit c = encryptedNr
	 *  Methode: Square-and-Multiply Verfahren
	 */
	
	public static long decryptNr(long c, int m, int e, int ePhi) {
		int d = privateKey(ePhi, e);		
		int z = SquareAndMultiply.SquareAndMultiply((int)c, d, m);
		return z;
	}
	
	
	// Berechnung von d = e^-1 mod ePhi
	public static int privateKey(int ePhi, int e) {		
		// Erweiterter Eukl. Alg: z*m + y*a = 1 --> y = d!
		int d = euklidAlg(ePhi, e)[0];
		return d;
	}
	
	public static int[] euklidAlg(int a, int b) {
		int[] y_ggT = new int[2];
		/* 
		 * z*a + y*b = ggT(a,b);  
		 */
		//  1. Zeile
		int ya = 0;
		//2. Zeile
		int yb = 1;	
		
		int y=0;
		int r;
		int q;
		while(true) {
			// Ganzzahlige Division:
			q = a / b;
			// Berechnungen --> Zwischenspeicher
			r = a%b;
			if (r==0) {
				break;
			}
			y = ya - q*yb;
			// Alte b-Zeile wird neue a-Zeile
			ya = yb;
			a = b;
			// Zwischenspeicher --> neue b-Zeile
			yb = y;
			b = r;
			//System.out.println("y: " + y + ", r: " + r + ", q: " + q);
		}
		y_ggT[0] = y;
		y_ggT[1] = a;
		return y_ggT;
	}
}
