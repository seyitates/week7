package uygulamaHafta5;

import java.util.ArrayList;

public class KisiMain {

	public static void main(String[] args) {
		
		ArrayList<Kisi> bireyler = new ArrayList<>();
		
		bireyler.add(new Kisi("Ahmet",24));
		bireyler.add(new Kisi("Kaya",30));
		bireyler.add(new Kisi("Hayri",40));
		
		bireyler.forEach(birey ->{
			System.out.println("isim: "+birey.getIsim()+",yas:"+birey.getYas());
		});
		System.out.println();
		
		
		for(Kisi birey:bireyler) {
			System.out.println("isim: "+birey.getIsim()+",yas:"+birey.getYas());
		}

	}

}
