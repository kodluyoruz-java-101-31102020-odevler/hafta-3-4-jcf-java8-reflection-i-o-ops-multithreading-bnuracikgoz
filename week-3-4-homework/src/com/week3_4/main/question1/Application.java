package com.week3_4.main.question1;

public class Application {

	public static void main(String[] args) {
		
			LinkedList<Integer> liste = new  LinkedList<Integer>();
	        liste.addTop(1); 
	        liste.addEnd(2);
	        liste.addEnd(3);
	        liste.addEnd(4);
	        liste.addEnd(5);
	        liste.write(); //1 2 3 4 5

	        liste.addTop(44);//44 1 2 3 4 5
	        liste.addTop(55);// 55 44 1 2 3 4 5

	        liste.write();

	        liste.delete(3); // 55 44 2 3 4 5
	        liste.write();
	}

}
