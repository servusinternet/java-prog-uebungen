package bonus_uebungsblatt;
import java.util.Arrays;

public class MehrdimArray {
	public static double[] zeilenMaxima(double[][] matrix) {
		int zeilen = matrix.length;
		int spalten = matrix[0].length;
		double[] maxima = new double[zeilen];
		for (int i=0; i<zeilen;i++) {
			maxima[i] = 0;
			for (int n=0;n<spalten;n++) {
				if(matrix[i][n] > maxima[i]) maxima[i] = matrix[i][n];
			}
		}
		return maxima;
	}
	
	public static void main(String[] args) {
		double[][] matrix = new double[2][3];
		matrix[0][0] = -3.22;
		matrix[0][1] = 21;
		matrix[0][2] = 7.2;
		matrix[1][0] = 2;
		matrix[1][1] = -32;
		matrix[1][2] = 4.4;
		System.out.println( Arrays.toString(zeilenMaxima(matrix)) );
	}
}
