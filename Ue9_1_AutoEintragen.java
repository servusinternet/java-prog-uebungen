import java.util.Scanner;

public class AutoEintragen {
    public static void main(String[] args) {
    	Scanner eingabe = new Scanner(System.in);
    	
    	System.out.println("Wieviele Autos möchten Sie eintragen?");
    	int eintraege = eingabe.nextInt();
    	
    	Auto[] autos = new Auto[eintraege];
    	Auto groessterHubraum = new Auto();
    	
    	for (int i=0; i<eintraege; i++) {
    		autos[i] = new Auto();
    		
    		System.out.println("\n" + (i+1) + ". Eintrag \nMarke:");
    		autos[i].setMarke(eingabe.next());
    		
    		System.out.println("Hubraum (in ccm):");
    		autos[i].setHubraum(eingabe.nextInt());
    		
    		System.out.println("Farbe:");
    		autos[i].setFarbe(eingabe.next());

    		System.out.println("TÜV? (j/n):");
    		if (eingabe.next().equalsIgnoreCase("j")) {
    			autos[i].setZulassung(true);
    		} else {
    			autos[i].setZulassung(false);
    		}
    		
    		if (i>0 && autos[i].getHubraum() > autos[i-1].getHubraum()) {
    			groessterHubraum = autos[i];
    		} else if (i==0) {
    			groessterHubraum = autos[0];
    		}
    	} 	
    	
    	System.out.println("Das Auto mit dem grössten Hubraum:" + groessterHubraum.getAll());
    	
    	System.out.println("Neuer Hubraum für das Auto 1: (bisher " + autos[0].getHubraum() + "ccm):");
    	autos[0].setHubraum(eingabe.nextInt());
    	
       /*
    	Auto[] autos = new Auto[3];
        autos[0] = new Auto("Mercedes", 4200, "Silber", true);
        autos[1] = new Auto("VW", 1400, "Grau", false);
        autos[2] = new Auto("Alfa Romeo", 2100, "Blau", true);
        
        System.out.println(autos[0].getFarbe());
        */
        
        eingabe.close();
    }
}
