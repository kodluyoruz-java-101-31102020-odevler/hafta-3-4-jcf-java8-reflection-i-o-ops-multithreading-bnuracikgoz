package com.week3_4.main.question7;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Application {

	public static void main(String[] args) {
		
	List<Integer> ortakArrayList = new ArrayList<>();
		for (int i = 0; i < 10000; i++) {
			ortakArrayList.add(i + 1);
	     }
		
		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
        int start = 0, finish = 2500;
        for (int i = 0; i < 4; i++) {
        	TekCiftArray TekCiftArray=new TekCiftArray(ortakArrayList.subList(start, finish));
        	start += 50;
        	finish += 50;
            threadPoolExecutor.execute(TekCiftArray);
        }
        threadPoolExecutor.shutdown();
        while (!threadPoolExecutor.isTerminated()) {

        }
        System.out.println(" ");
        System.out.println("Tek Sayılar ");
        System.out.println("-------------");
        TekCiftArray.tekSayiListesi.stream().forEach(sayi -> System.out.println(sayi));
        System.out.println(" ");
        System.out.println("Çift Sayılar ");
        System.out.println("-------------");
        TekCiftArray.ciftSayiListesi.stream().forEach(sayi -> System.out.println(sayi));


	}

}
