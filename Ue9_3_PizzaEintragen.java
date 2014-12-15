import java.util.Scanner;

public class PizzaEintragen {
	public static void main(String[] args) {
		Scanner eintrag = new Scanner(System.in);
		
		int z = 0;
		Pizza[] pizza = new Pizza[5];
		while (z<5) {
			System.out.print("Name:");
			pizza[z] = new Pizza(eintrag.nextLine(), 0, 0);
			System.out.print("Durchmesser 1:");
			pizza[z].setDurchmesser1(eintrag.nextInt());
			System.out.print("Preis 1:" );
			pizza[z].setPreis1(eintrag.nextFloat());
			System.out.print("Durchmesser 2:");
			pizza[z].setDurchmesser1(eintrag.nextInt());
			System.out.print("Preis 2:");
			pizza[z].setPreis1(eintrag.nextFloat());
			z++;
		}		
		
		eintrag.close();
		
		//System.out.println(pizza[0].getName() + ", " + pizza[0].getDurchmesser1() + "cm, " + pizza[0].getPreis1());
	}
}
