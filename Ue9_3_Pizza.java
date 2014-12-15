package übung09;

public class Pizza {
	
	private static int anzahlPizzen = 0;
	private String name;
	private int durchmesser1;
	private float preis1;
	private int durchmesser2;
	private float preis2;
	private int durchmesser3;
	private float preis3;
	
	// Konstruktoren
	private Pizza() {
		anzahlPizzen++;
	}
	public Pizza(String name, int durchmesser1, float preis1) {
		this(name, durchmesser1, preis1, 0, 0);
	}
	public Pizza(String name, int durchmesser1, float preis1, int durchmesser2, float preis2) {
		this(name, durchmesser1, preis1, durchmesser2, preis2, 0, 0);
		this.name = name;
		this.durchmesser1 = durchmesser1;
		this.preis1 = preis1;
		this.durchmesser2 = durchmesser2;
		this.preis2 = preis2;
	}	

	public Pizza(String name, int durchmesser1, float preis1, int durchmesser2,
			float preis2, int durchmesser3, float preis3) {
		this();
		this.name = name;
		this.durchmesser1 = durchmesser1;
		this.preis1 = preis1;
		this.durchmesser2 = durchmesser2;
		this.preis2 = preis2;
		this.durchmesser3 = durchmesser3;
		this.preis3 = preis3;
	}
	
	//Getter-Methoden
	public String getName() {
		return name;
	}
	public int getDurchmesser1() {
		return durchmesser1;
	}
	public float getPreis1() {
		return preis1;
	}
	public int getDurchmesser2() {
		return durchmesser2;
	}
	public String getPreis2() {
		String preis = String.valueOf(preis2);
		return (preis.substring(0,3) + "EUR");
	}
	public int getDurchmesser3() {
		return durchmesser3;
	}
	public float getPreis3() {
		return preis3;
	}
	
	// Setter-Methoden
	public void setName(String name) {
		this.name = name;
	}
	public void setDurchmesser1(int durchmesser1) {
		this.durchmesser1 = durchmesser1;
	}
	public void setPreis1(float preis1) {
		this.preis1 = preis1;
	}
	public void setDurchmesser2(int durchmesser2) {
		this.durchmesser2 = durchmesser2;
	}
	public void setPreis2(float preis2) {
		this.preis2 = preis2;
	}
	public void setDurchmesser3(int durchmesser3) {
		this.durchmesser3 = durchmesser3;
	}
	public void setPreis3(float preis3) {
		this.preis3 = preis3;
	}
	
	
}
