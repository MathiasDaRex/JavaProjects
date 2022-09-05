package fajlAllasokGyakorlas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Feladatok {

	public void adatokKiir(List<AllasTarolo> allasLista) {
		for (AllasTarolo item : allasLista) {
			System.out.print(item.getId());
			System.out.print("\t");
			System.out.print(item.getMegnevezes());
			System.out.print("\t");
			System.out.print(item.getBruttoFizetes());
			System.out.print("\t");
			System.out.print(item.getElvartTapasztalatiEvek());
			System.out.print("\t");
			String tavmunka = item.getTavmunkaSzovegesen();
			System.out.print(tavmunka);
			System.out.print("\t");
			System.out.printf("%tF",item.getPublikacioIdeje());
			System.out.println("");
		}
		System.out.println("");
	}
	
	public void allasokSzamaKiir(List<AllasTarolo> allasLista) {
		int x = 0;
		for (AllasTarolo item : allasLista) {
			x++;
		}
		System.out.println("Az állások száma: "+x);
		System.out.println();
	}
	
	public void maxFizetesKiir(List<AllasTarolo> allasLista) {
		int maxFizu = 0;
		for (AllasTarolo item : allasLista) {
			if(item.getBruttoFizetes()>=maxFizu) {
				maxFizu=item.getBruttoFizetes();
			}
		for (AllasTarolo item2 : allasLista) {
			if(maxFizu==item.getBruttoFizetes()) {
				System.out.print(item2.getId());
				System.out.print("\t");
				System.out.print(item2.getMegnevezes());
				System.out.print("\t");
				System.out.print(item2.getBruttoFizetes());
				System.out.print("\t");
			}
		}
		}
	}
	
	public void rendszergazdaDbSzamol(List<AllasTarolo> allasLista) {
		int x = 0;
		for (AllasTarolo item : allasLista) {
			if(item.getMegnevezes().toLowerCase().equals("rendszergazda")) {
				x++;
			}
		}
		System.out.println("Rendszergazdák száma: "+x);
		System.out.println("");
	}
	
	public void tavmunkaAllasokKiir(List<AllasTarolo> allasLista) {
		for (AllasTarolo item : allasLista) {
			if(item.getTavmunka()==true) {
				System.out.print(item.getId());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.print(item.getBruttoFizetes());
				System.out.print("\t");
				System.out.print(item.getElvartTapasztalatiEvek());
				System.out.print("\t");
				String tavmunka = item.getTavmunkaSzovegesen();
				System.out.print(tavmunka);
				System.out.print("\t");
				System.out.printf("%tF",item.getPublikacioIdeje());
				System.out.println("");
			}
		}
		System.out.println("");
	}
	
	public void tavmunkaAtlagSzamol(List<AllasTarolo> allasLista) {
		int penz = 0;
		int db = 0;
		int atlag = 0;
		for (AllasTarolo item : allasLista) {
			if(item.getTavmunka()) {
				penz += item.getBruttoFizetes();
				db++;
			}
		}
		atlag = penz/db;
		System.out.println("A távmunkás állások átlag fizetése: "+atlag+" ft.");
		System.out.println("");
	}
	
	public void allasokTapasztalatNelkul(List<AllasTarolo> allasLista) {
		System.out.println("Tapasztalat nélkül végezhető munkák: ");
		for (AllasTarolo item : allasLista) {
			if(item.getElvartTapasztalatiEvek()==0) {
				System.out.print(item.getId());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.print(item.getBruttoFizetes());
				System.out.print("\t");
				System.out.print(item.getElvartTapasztalatiEvek());
				System.out.print("\t");
				String tavmunka = item.getTavmunkaSzovegesen();
				System.out.print(tavmunka);
				System.out.print("\t");
				System.out.printf("%tF",item.getPublikacioIdeje());
				System.out.println("");
			}
		}
		System.out.println("");
	}
	
	public void allasokNegyEvnelTobbKiir(List<AllasTarolo> allasLista) {
		System.out.println("Csak négy évnél több tapasztalattal végezhető munkák: ");
		for (AllasTarolo item : allasLista) {
			if(item.getElvartTapasztalatiEvek()>4) {
				System.out.print(item.getId());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.print(item.getBruttoFizetes());
				System.out.print("\t");
				System.out.print(item.getElvartTapasztalatiEvek());
				System.out.print("\t");
				String tavmunka = item.getTavmunkaSzovegesen();
				System.out.print(tavmunka);
				System.out.print("\t");
				System.out.printf("%tF",item.getPublikacioIdeje());
				System.out.println("");
			}
		}
		System.out.println("");
	}
	
	public void haromHetnelTobbKiir(List<AllasTarolo> allasLista) {
		System.out.println("3 hétnél régebbi állások: ");
		LocalDate most = LocalDate.now();
		LocalDate haromhet = most.minusWeeks(3);
		Date haromhet2 = Date.from(haromhet.atStartOfDay(ZoneId.systemDefault()).toInstant());
		for (AllasTarolo item : allasLista) {
			if(item.getPublikacioIdeje().before(haromhet2)) {
				System.out.print(item.getId());
				System.out.print("\t");
				System.out.print(item.getMegnevezes());
				System.out.print("\t");
				System.out.print(item.getBruttoFizetes());
				System.out.print("\t");
				System.out.print(item.getElvartTapasztalatiEvek());
				System.out.print("\t");
				String tavmunka = item.getTavmunkaSzovegesen();
				System.out.print(tavmunka);
				System.out.print("\t");
				System.out.printf("%tF",item.getPublikacioIdeje());
				System.out.println("");
			}
		}
		System.out.println("");
		
	}
	
	public void legfrissebbAllasajanlat(List<AllasTarolo> allasLista) {
		List<Date> dates = new ArrayList<Date>();
		for (AllasTarolo item : allasLista) {
			dates.add(item.getPublikacioIdeje());
		}
		Date last = Collections.max(dates);
		System.out.println("Legfrissebb állásajánlat:");
		for (AllasTarolo item2 : allasLista) {
			if(item2.getPublikacioIdeje()==last) {
				System.out.print(item2.getId());
				System.out.print("\t");
				System.out.print(item2.getMegnevezes());
				System.out.print("\t");
				System.out.print(item2.getBruttoFizetes());
				System.out.print("\t");
				System.out.print(item2.getElvartTapasztalatiEvek());
				System.out.print("\t");
				String tavmunka = item2.getTavmunkaSzovegesen();
				System.out.print(tavmunka);
				System.out.print("\t");
				System.out.printf("%tF",item2.getPublikacioIdeje());
				System.out.println("");
			}
		}
		System.out.println("");
	}
}
