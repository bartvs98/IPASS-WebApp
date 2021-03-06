package nl.hu.ipass.model;

public class Koersverandering {
	private int id;
	private String aandeelNaam;
	private String datum;
	private double koers;
	private double totaal;
	
	public Koersverandering(int id, String aandeelNaam, String datum, double koers, double totaal) {
		super();
		this.id = id;
		this.aandeelNaam = aandeelNaam;
		this.datum = datum;
		this.koers = koers;
		this.totaal = totaal;
	}
	
	public Koersverandering(String aandeelNaam, String datum, double koers, double totaal) {
		super();
		this.aandeelNaam = aandeelNaam;
		this.datum = datum;
		this.koers = koers;
		this.totaal = totaal;
	}
	
	public Koersverandering(String datum, double koers, double totaal) {
		super();
		this.datum = datum;
		this.koers = koers;
		this.totaal = totaal;
	}
	
	public Koersverandering(String datum, double totaal) {
		super();
		this.datum = datum;
		this.totaal = totaal;
	}
	
	public Koersverandering(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAandeelNaam() {
		return aandeelNaam;
	}

	public void setAandeelNaam(String aandeelNaam) {
		this.aandeelNaam = aandeelNaam;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public double getKoers() {
		return koers;
	}

	public void setKoers(double koers) {
		this.koers = koers;
	}

	public double getTotaal() {
		return totaal;
	}

	public void setTotaal(double totaal) {
		this.totaal = totaal;
	}
	
}
