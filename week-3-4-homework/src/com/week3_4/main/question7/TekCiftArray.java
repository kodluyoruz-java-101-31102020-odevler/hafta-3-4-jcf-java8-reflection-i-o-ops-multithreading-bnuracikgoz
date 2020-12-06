package com.week3_4.main.question7;

import java.util.List;
import java.util.ArrayList;

public class TekCiftArray implements Runnable{
	
	 	private List<Integer> ortakArrayList;
	    static List<Integer> tekSayiListesi = new ArrayList<>();
	    static List<Integer> ciftSayiListesi = new ArrayList<>();

	    public TekCiftArray(List<Integer> ortakArrayList) {
	        this.ortakArrayList = ortakArrayList;
	    }

	    @Override
	    public void run() {
	    	
	        synchronized (this) {
	            for (int i = 0; i < ortakArrayList.size(); i++) {
	                if (ortakArrayList.get(i) % 2 != 0) {
	                	tekSayiListesi.add(i);
	                    System.out.println(ortakArrayList.get(i) + "- Tek Sayı");
	                } 
	                else {
	                	ciftSayiListesi.add(i);
	                    System.out.println(ortakArrayList.get(i) + " - Çift Sayı");
	                }
	                sleep(4);
	            }
	        }
	    }
	    public static void sleep(long milliseconds) {
	        try {
	            Thread.sleep(milliseconds);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
}
