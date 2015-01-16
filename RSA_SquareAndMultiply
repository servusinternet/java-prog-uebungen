package rsa_verschluesselung;

/*
 * Square-and-multiply Methode:
 * Rechnet: a^b modulo(m) aus für Gleichungen mit hohen Exponenten b.
 */

public class SquareAndMultiply {
	public static int SquareAndMultiply(int a, int b, int m){
			
				//String der Zahl d in Binärschreibweise erstellen (z.B. "10111")
				String dBinaer = "";
				double x = 0;
				int rest = b;
				boolean write = false;
				for(int i=b; i>=0;i--) {
					x = Math.pow(2, i);
					if (x<=b && x<=rest){
						dBinaer = dBinaer + "1";
						rest = (int)(rest - x);
						write = true;
					} else if(write == true){
						dBinaer = dBinaer + "0";
					}
				}
				char[] bArray = dBinaer.toCharArray();
				
				
				// Square-and-multiply Verfahren
				int z;
				int t = bArray.length;
				if (bArray[t-1] == '1') {
					z = a%m;
				} else {
					z = 1;
				}
				for (int i=t-2;i>-1;i--) {
					a = a*a % m;
					if(bArray[i] == '1'){
						z = z*a%m;
					}
				}
				return z;
	}
}
