package com.week3_4.main.question2;
import java.util.Comparator;

public class BookComparatorByPageCount implements Comparator<Book>{
	@Override
	public int compare(Book o1, Book o2) {
		
		int book1PublishYear = o1.getSayfaSayısı();
		int book2PublishYear = o2.getSayfaSayısı();
		
		
		// Integer.compare(book1PublishYear, book2PublishYear);
		
		if(book2PublishYear > book1PublishYear) {
			return -1;
		}
		else if(book1PublishYear > book2PublishYear) {
			return 1;
		}
		else {
			
			return 0;
		}
		
	}
}
