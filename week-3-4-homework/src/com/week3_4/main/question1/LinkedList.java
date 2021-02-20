package com.week3_4.main.question1;

public class LinkedList <T> {

	public Node <T> top;
    public int size = 0;
    Node <T> temp;
    
    public void addTop(T value) {
    	
    	temp=new Node <T>(value);

        if (top == null) {
        	top = temp;
        }
        else {
            temp.Next = top;
            top = temp;
        }
       size++;
    }
    
    public void addEnd(T value) {
    	
    	temp=new Node <T>(value);

        if (top == null) {
        	top = temp;
        }
        else {
        	Node <T>sayac = top;
            while (sayac.Next != null)
                sayac = sayac.Next;
            sayac.Next = temp;
        }
        size++;
    }
    public void delete(int pozisyon) {
        if (pozisyon > size || pozisyon < 0) {
            throw new IndexOutOfBoundsException("Hatalı Pozisyon!");
        }
        else if (pozisyon == 1)
            System.out.println("bas");// basiSil();
        else {
        	Node <T> sayac = top;
        	temp=new Node <T>();
            for (int i = 1; i < pozisyon - 1; i++) {
                if (sayac.Next != null)
                    sayac = sayac.Next;
            }
            temp = sayac;
            sayac = sayac.Next;
            temp.Next = sayac.Next;
            sayac = null;
            size--;
        }
    }
    public void write() {
        System.out.print("Liste : ");
        Node <T> aktif = top;
        while (aktif != null)
        {
            aktif.show();
            aktif = aktif.Next;
        }
        System.out.println("");
    }
}
