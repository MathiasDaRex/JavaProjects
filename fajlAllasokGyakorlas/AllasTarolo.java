package fajlAllasokGyakorlas;

import java.util.Date;

public class AllasTarolo {

	private Integer id;
	private String megnevezes;
	private Integer bruttoFizetes;
	private Byte elvartTapasztalatiEvek;
	private Boolean tavmunka;
	private Date publikacioIdeje;
	
	public AllasTarolo(Integer id, String megnevezes, Integer bruttoFizetes, Byte elvartTapasztalatiEvek,
			Boolean tavmunka, Date publikacioIdeje) {
		this.id = id;
		this.megnevezes = megnevezes;
		this.bruttoFizetes = bruttoFizetes;
		this.elvartTapasztalatiEvek = elvartTapasztalatiEvek;
		this.tavmunka = tavmunka;
		this.publikacioIdeje = publikacioIdeje;
	}

	public Integer getId() {
		return id;
	}

	public String getMegnevezes() {
		return megnevezes;
	}

	public Integer getBruttoFizetes() {
		return bruttoFizetes;
	}

	public Byte getElvartTapasztalatiEvek() {
		return elvartTapasztalatiEvek;
	}

	public Boolean getTavmunka() {
		return tavmunka;
	}

	public Date getPublikacioIdeje() {
		return publikacioIdeje;
	}
	
	public String getTavmunkaSzovegesen() {
		return tavmunka ? "Van távmunka" : "nincs távmunka";
	}
	
}
