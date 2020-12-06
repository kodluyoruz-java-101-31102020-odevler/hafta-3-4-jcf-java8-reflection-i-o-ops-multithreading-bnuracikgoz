package com.week3_4.main.question5;

public class Book  implements Comparable<Book>{
	
	private String isim;
	
	private String yazarAdi;
	
	private int yayinTarihi;
	
	private int sayfaSayisi;
	
	public Book(String isim, String yazarAdi, int yayinTarihi, int sayfaSayisi) {
		
		this.isim = isim;
		this.yazarAdi = yazarAdi;
		this.yayinTarihi = yayinTarihi;
		this.sayfaSayisi = sayfaSayisi;
	
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
	        this.isim = isim;
	}
	
	public String getYazarAdi() {
		return yazarAdi;
	}
	public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
	}

	public int getYayinTarihi() {
		return yayinTarihi;
	}
	public void setYayinTarihi(int yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
	}

	public int getSayfaSayisi() {
		return sayfaSayisi;
	}
	public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
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
		builder.append(this.getYazarAdi());
		builder.append(" - ");
		builder.append(this.getYayinTarihi());
		builder.append(" - ");
		builder.append(this.getSayfaSayisi());
		builder.append("]");
		
		return builder.toString();
	}
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isim == null) ? 0 : isim.hashCode());
		result = prime * result + sayfaSayisi;
		result = prime * result + yayinTarihi;
		result = prime * result + ((yazarAdi == null) ? 0 : yazarAdi.hashCode());
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
		if (sayfaSayisi != other.sayfaSayisi)
			return false;
		if (yayinTarihi != other.yayinTarihi)
			return false;
		if (yazarAdi == null) {
			if (other.yazarAdi != null)
				return false;
		} else if (!yazarAdi.equals(other.yazarAdi))
			return false;
		return true;
    }
}
