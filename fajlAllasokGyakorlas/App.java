package fajlAllasokGyakorlas;

import java.util.List;

public class App {

	public static void main(String[] args) {

		FajlKezelo fk = new FajlKezelo();
		Feladatok felObj = new Feladatok();
		
		List<AllasTarolo> allasLista = fk.fajlBeolvas("allasok.csv");
		felObj.adatokKiir(allasLista);
		felObj.allasokSzamaKiir(allasLista);
		felObj.rendszergazdaDbSzamol(allasLista);
		felObj.tavmunkaAllasokKiir(allasLista);
		felObj.tavmunkaAtlagSzamol(allasLista);
		felObj.allasokTapasztalatNelkul(allasLista);
		felObj.allasokNegyEvnelTobbKiir(allasLista);
		felObj.haromHetnelTobbKiir(allasLista);
		felObj.legfrissebbAllasajanlat(allasLista);
	}

}
