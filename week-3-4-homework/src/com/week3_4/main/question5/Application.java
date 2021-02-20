package com.week3_4.main.question5;
import java.io.IOException;
import java.util.*;

public class Application {

	public static void main(String[] args) throws IOException {
		// a-Şıkkı için
		List<Book> list= new ArrayList<Book>();
		list.add(new Book("Ateşten Gömlek","Halide Edip Adıvar",2019,224));
		list.add(new Book("İstanbul Hatırası","Ahmet Ümit",2019,590));
		list.add(new Book("Katre-i Matem","İskender Pala",2014,480));
		list.add(new Book("Beyaz Gemi","Cengiz Aytmatov",1970,168));
		list.add(new Book("OD","İskender Pala",2011,361));
		list.add(new Book("Kuyucaklı Yusuf","Sabahattin Ali",1937,221));
		list.add(new Book("Kürk Mantolu Madonna","Sabahattin Ali",1943,160));
		list.add(new Book("Satranç","Stefan Zweig",1943,85));
		list.add(new Book("Sol Ayağım","Christy Brown",2017,189));
		list.add(new Book("Sefiller","Victor Hugo",1862,1606));
		
	    Map<String,String> map = new HashMap< String, String>();

		        list.stream().forEach(s ->
		                map.put(s.getIsim(),s.getYazarAdi())
		        );
		       
		        for (Map.Entry<String,String> entry: map.entrySet()){
		            String key = entry.getKey();
		            String value = entry.getValue();
		            System.out.println(key + " : " + value);
		        }
		        System.out.println();
		        //b-şıkkı satranç kitap hariç diğerlerinin listelenmesi gerekir.
		        
		        list.stream().filter(s -> s.getSayfaSayisi()> 100 ).forEach(s -> System.out.println(s.toString()));
		    }
	}


