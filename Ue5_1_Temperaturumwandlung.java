public class Ue5_1_Temperaturumwandlung {
	public static void main(String[] args) {
		
		System.out.println("Fahrenheit" + "\t" + "Celsius");
		
		for (int i = 0; i <= 300; i++) {
			double celsius = ((double)5/(double)9)*(i-32); 
			double celsiusKurz = (Math.round(celsius*100));
			System.out.println(i + "\t \t" + (celsiusKurz / 100) );			
		}
	}
	//Grad Celsius = (5/9) * (Grad Fahrenheit - 32);
}
