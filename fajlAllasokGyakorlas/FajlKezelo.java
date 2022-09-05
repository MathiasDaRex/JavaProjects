package fajlAllasokGyakorlas;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class FajlKezelo {
	public List<AllasTarolo> fajlBeolvas(String fajlNev) {
		List<AllasTarolo> allasLista = new ArrayList<AllasTarolo>();
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(fajlNev), "UTF-8"));
			@SuppressWarnings("unused")
			String fejlec = br.readLine();
			while(br.ready()) {
				String sor = br.readLine();
				String[] sorAdatok = sor.split(";");
				Boolean tavmunka = false;
				if(sorAdatok[4].equals("1"))  {
					tavmunka=true;
				}
				Date pubDatum = new SimpleDateFormat("yyyy-MM-dd").parse(sorAdatok[5]);
				AllasTarolo allasObj = new AllasTarolo(Integer.parseInt(sorAdatok[0]),
						sorAdatok[1],
						Integer.parseInt(sorAdatok[2]),
						Byte.parseByte(sorAdatok[3]),
						tavmunka,
						pubDatum
				);
				allasLista.add(allasObj);
			}
			br.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allasLista;
	}
}
