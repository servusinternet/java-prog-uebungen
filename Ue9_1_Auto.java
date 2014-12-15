package übung09;

public class Auto {
	private String marke;
	private int hubraum;
	private String farbe;
	private boolean zulassung;
	
	// Konstruktor mit this-Referenzen
	public Auto(String marke, int hubraum, String farbe, boolean zulassung) {
		this.marke = marke;
		if (hubraum > 0) {
			this.hubraum = hubraum;
		}
		this.farbe = farbe;
		this.zulassung = zulassung;
	}
	
	//Konstruktor für leeres Auto-Objekt
	public Auto() {
		this.marke = null;
		this.hubraum = 0;
		this.farbe = null;
		this.zulassung = false;
	}
	
	// Getter-Methoden
	public String getMarke() {
		return marke;
	}
	public int getHubraum() {
		return hubraum;
	}
	public String getFarbe() {
		return farbe;
	}
	public boolean getZulassung() {
		return zulassung;
	}
	public String getAll() {
		String Info = marke + ", " +  hubraum + "ccm, " + farbe + " " + zulassung;
		return Info;
	}
	
	//Setter-Methoden
	public void setMarke(String marke) {
		this.marke = marke;
	}
	public void setHubraum(int hubraum) {
		if (hubraum > 0) {
			this.hubraum = hubraum;
		}
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public void setZulassung(boolean zulassung) {
		this.zulassung = zulassung;
	}
	
}
