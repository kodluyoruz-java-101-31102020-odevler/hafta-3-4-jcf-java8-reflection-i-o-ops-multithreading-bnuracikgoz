package com.week3_4.main.question2;

import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {
		
		runTreeSetSamples();
	}

public static void runTreeSetSamples() {
		

	// TreeSet yapısını kullanarak Book tipindeki nesneleri sıralı bir şekilde tutuyoruz.
	// Book sınıfımız 'Comparable' interface'den kalıtım almaktadır. Dolayısıyla sınıf içinde 'compareTo' fonksiyonunu override ettik.
	// Kitapları A-Z olacak şekilde sıralı şekilde tutuyoruz
	
	Set<Book> books = new TreeSet<Book>();
	books.add(new Book("Java Book", "Penguen Yayınevi", 2019, 500));
	books.add(new Book("Python Book", "Panda Yayınevi", 2019, 250));
	books.add(new Book("C# Book", "Elma Yayınevi", 2020, 660));
	books.add(new Book("Ruby Book", "Beyaz Balina Yayınevi", 2014, 450));
	books.add(new Book("Go Book", "Kanarya Yayınevi", 2017, 420));

	System.out.println("Doğal bir şekilde sıralanmış kitap listesi");
	printAll(books);

		
		
// TreeSet veri yapısına Comparator tipinden türemiş bir nesne vermezsek, 
// TreeSet, Book sınıfındaki 'compareTo' fonksiyonuna bakarak sıralama yapar.
// 'BookComparatorByPublisher' sınıfı 'Comparator' interface'den kalıtım almış bir alt sınıfdır.
// Bu sıralama sınıfı kitapları yayıncı ismine göre A-Z şeklinde sıralamaktadır.
	BookComparatorByBookName comparatorByPublisher = new BookComparatorByBookName();
	Set<Book> sortedBooksByPublisher = new TreeSet<Book>(comparatorByPublisher);
	sortedBooksByPublisher.addAll(books);
		
	System.out.println("Kitap ismine göre A-Z sıralanmış kitap listesi");
	printAll(sortedBooksByPublisher);
		
	
	// Bu örnekte ise farklı bir Comparator tasarlayarak kitapları sayfa sayısına göre  göre sıralıyoruz.
	BookComparatorByPageCount comparatorByPublisheryear = new BookComparatorByPageCount();
	Set<Book> sortedBooksByPublishyear = new TreeSet<Book>(comparatorByPublisheryear);
	sortedBooksByPublishyear.addAll(sortedBooksByPublisher);
	
	System.out.println("Sayfa sayısına göre sıralanmış kitap listesi");
	printAll(sortedBooksByPublishyear);

}
public static <T> void printAll(Set<T> set) {
	
	for(T item : set) {
		
		System.out.println(item);
	}
	System.out.println();
}

}
