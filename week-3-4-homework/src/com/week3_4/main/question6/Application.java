package com.week3_4.main.question6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws URISyntaxException, FileNotFoundException {
		String no ;
		String name;
		String surname;
		int age;
		String bolum;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Öğrenci numaranızı giriniz: ");
		no=sc.nextLine();
		
		System.out.println("Öğrenci ismini giriniz: ");
		name=sc.nextLine();
		
		System.out.println("Öğrenci soyismini giriniz: ");
		surname=sc.nextLine();
		
		System.out.println("Öğrenci yaşını giriniz: ");
		age=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Öğrenci bolumunu giriniz: ");
		bolum=sc.nextLine();
		
		
		WriteResourceFile(no,name,surname,age,bolum);
		readResourceFile();
		sc.close();
	}


private static void WriteResourceFile(String no,String name,String surname,int age,String bolum) throws FileNotFoundException, URISyntaxException {
	
	// write operation from resource file
	
		String resourceFilePath = "uygulama.txt";
		File resourceFileOrg = FileOperations.getFile(resourceFilePath);
		FileOperations.write(resourceFileOrg,no,name,surname,age,bolum);

}

private static void readResourceFile() throws FileNotFoundException, URISyntaxException {
	
	String resourceFilePath = "uygulama.txt";
	
	// read operation from resource file
	InputStream inputStream = FileOperations.getInputStream(resourceFilePath, true);
	String fileContent = FileOperations.read(inputStream);
	System.out.println("Dosya İçeriği:");
	System.out.println(fileContent);
	}
}
