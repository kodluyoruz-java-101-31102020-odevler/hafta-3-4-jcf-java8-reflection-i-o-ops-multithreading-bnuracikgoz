package com.week3_4.main.question1;

public class Node <T> {
	public T Data;
	public Node <T> Next;
    public Node() { }
    public Node(T Data) {

        this.Data = Data;
    }
    public void show(){
        System.out.print(Data + " ");
    }
}
