package com.week3_4.main.question2;

public class Book implements Comparable<Book> {
	
	private String isim;
	
	private String yazarAdı;
	
	private int yayinTarihi;
	
	private int sayfaSayısı;
	
	
	public Book(String isim, String yazarAdı, int yayinTarihi, int sayfaSayısı) {
		
		this.isim = isim;
		this.yazarAdı = yazarAdı;
		this.yayinTarihi = yayinTarihi;
		this.sayfaSayısı = sayfaSayısı;
	
	}
	

	public String getIsim() {
		return isim;
	}

	public String getYazarAdı() {
		return yazarAdı;
	}

	public int getYayinTarihi() {
		return yayinTarihi;
	}

	public int getSayfaSayısı() {
		return sayfaSayısı;
	}



	@Override
	public int compareTo(Book book) {
		// doğal sıralamayı kitap ismine göre yapıyoruz.
		return this.getIsim().compareTo(book.getIsim());
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(this.getIsim());
		builder.append(" - ");
		builder.append(this.getYazarAdı());
		builder.append(" - ");
		builder.append(this.getYayinTarihi());
		builder.append(" - ");
		builder.append(this.getSayfaSayısı());
		builder.append("]");
		
		return builder.toString();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isim == null) ? 0 : isim.hashCode());
		result = prime * result + sayfaSayısı;
		result = prime * result + yayinTarihi;
		result = prime * result + ((yazarAdı == null) ? 0 : yazarAdı.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isim == null) {
			if (other.isim != null)
				return false;
		} else if (!isim.equals(other.isim))
			return false;
		if (sayfaSayısı != other.sayfaSayısı)
			return false;
		if (yayinTarihi != other.yayinTarihi)
			return false;
		if (yazarAdı == null) {
			if (other.yazarAdı != null)
				return false;
		} else if (!yazarAdı.equals(other.yazarAdı))
			return false;
		return true;
	}
}
