package com.riigsoft.service;

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
