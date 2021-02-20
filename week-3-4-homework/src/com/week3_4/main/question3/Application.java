package com.week3_4.main.question3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
	
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
		
		
		complexHashMapAndTreeMap(no,name,surname,age,bolum);
		sc.close();
	}
private static void complexHashMapAndTreeMap(String no, String name,String surname,int age,String bolum) {	
	// Map için Key alanına StudentNumber sınıfından oluşturduğumuz nesneyi veriyoruz.
	// Key alanına verdiğimiz verilerin hashcode'una bakacaktır.
	Map<StudentNumber, List<Student>> studentLessonMap = new HashMap<StudentNumber, List<Student>>();
			
			studentLessonMap.put(
					
					new StudentNumber(no), 
					
					Arrays.asList(
							new Student(name,surname,age,bolum)));
							
			showMap(studentLessonMap);
			
}
public static void showMap(Map<StudentNumber, List<Student>> studentLessonMap) {
	
	Set<StudentNumber> keys = studentLessonMap.keySet();
	
	for(StudentNumber key : keys) {
		
		System.out.println("Numara:"+key + "Öğrenci Bilgileri Listesi");
		
	 	List<Student> lessonsOfStudent = studentLessonMap.get(key);
	 	
	 	for(Student lesson : lessonsOfStudent) {
	 		System.out.println(lesson);
	 	}
	 	System.out.println();
	}
}}