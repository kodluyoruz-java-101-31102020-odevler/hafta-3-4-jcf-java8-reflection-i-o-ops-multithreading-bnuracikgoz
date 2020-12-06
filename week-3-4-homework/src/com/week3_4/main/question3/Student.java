package com.week3_4.main.question3;

public class Student{

	private String name;
	private String surname;
	private int age;
	private String bolum;

	public Student(String name, String surname, int age, String bolum) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.bolum = bolum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}
	
	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(this.getName());
		builder.append("-");
		builder.append(this.getSurname());
		builder.append("-");
		builder.append(this.getAge());
		builder.append("-");
		builder.append(this.getBolum());
		builder.append("]");
		return builder.toString();
		

	}
}
