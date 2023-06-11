package tr.edu.medipol.ygova;

import java.util.HashMap;
import java.util.Map;

public class AdanaSecimApi {

	public static void main(String[] args) {
		Parti partiler = new Parti();

		partiler.partiOyArttir("CHP");
		partiler.partiOyArttir("CHP");
		partiler.partiOyArttir("CHP");
		partiler.partiOyArttir("CHP");
		partiler.partiOyArttir("CHP");
		partiler.partiOyArttir("AKP");
		partiler.partiOyArttir("AKP");
		partiler.partiOyAzalt("AKP");
		partiler.partiOyAzalt("ZP");

		partiler.partiOyListele();

	}
}

class Parti {
	public Map<String, Integer> partiler;

	public Parti() {
		partiler = new HashMap<String, Integer>();
	}

	public void partiOyArttir(String partiAdi) {
		if (partiler.containsKey(partiAdi) != true) {
			partiler.put(partiAdi, 1);
		} else {
			int oySayisi = partiler.get(partiAdi);
			oySayisi++;
			partiler.put(partiAdi, oySayisi);
		}
	}

	public void partiOyAzalt(String partiAdi) {
		if (partiler.containsKey(partiAdi) != true) {
			System.out.println(partiAdi + " sistemde kayıtlı değildir.");
		} else {
			int oySayisi = partiler.get(partiAdi);
			oySayisi--;
			partiler.put(partiAdi, oySayisi);
		}
	}

	public void partiOyListele() {
		for (String i : partiler.keySet()) {
			System.out.println("Parti: " + i + " | Oy Sayısı: " + partiler.get(i));
		}
	}
}