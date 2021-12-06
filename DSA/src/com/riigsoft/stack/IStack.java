package com.riigsoft.stack;
/**
 * @author Abdallah Mahmoud
 * linked in profile {@link https://www.linkedin.com/in/abdallahmahmud/}
 * **/

public interface IStack {

	void push(int e);
	int pop();
	int peek();
	int search(int e);
	void display();
	boolean isEmpty();
	boolean isFull();
	int getSize();
	
}
