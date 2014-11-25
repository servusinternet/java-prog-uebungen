public class Ue7_1_Rekursion {
	public static float potenz(float basis, int exponent) {
		if (exponent == 0) return 1;
		if (exponent == 1) return basis;
		return basis*potenz(basis, exponent-1);		
	}
	
	public static void main(String[] args) {
		float basis = 2.451f;
		int exponent = 3;
		System.out.println(potenz(basis, exponent));
	}
}
