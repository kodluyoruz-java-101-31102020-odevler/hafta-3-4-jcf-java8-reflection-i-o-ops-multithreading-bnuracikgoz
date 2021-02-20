package com.week3_4.main.question2;
import java.util.Comparator;

public class BookComparatorByBookName implements Comparator<Book> {
	
	@Override
	public int compare(Book o1, Book o2) {
		
		String book1Publisher = o1.getIsim();
		String book2Publisher = o2.getIsim();
		
		return book1Publisher.compareTo(book2Publisher);
	}

}
