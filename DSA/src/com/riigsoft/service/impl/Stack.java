package com.riigsoft.service.impl;

import java.util.NoSuchElementException;

import com.riigsoft.service.IStack;

public class Stack implements IStack {
	private int size[];
	private int capacity;
	private int top;
	private int len;
	
	public Stack(int size) {
		capacity=size;
		this.size= new int[size];
		top=-1;
		len=0;
	}

	@Override
	public void push(int e) {
		if(isFull())
			throw new NoSuchElementException("Stack is OrverFlow.");
		size[++top]=e;
		len++;
	}

	@Override
	public int pop() {
		if(isEmpty())
			throw new NoSuchElementException("Stack is UnderFlow.");
		len--;
		return size[top--];
	}

	@Override
	public int peek() {
		if(isEmpty())
			throw new NoSuchElementException("Stack is UnderFlow.");
		return size[top];
	}

	@Override
	public int search(int e) {
		if(isEmpty())
			throw new NoSuchElementException("Stack is UnderFlow.");
		for(int index=0;index<size.length;index++) {
			if(size[index]==e)
				return index;
		}
		return -1;
	}

	@Override
	public void display() {
		if(isEmpty())
			throw new NoSuchElementException("Stack is UnderFlow.");
		System.out.print("Stack Elements :");
		for(int i=top;i>=0;i--)
			System.out.print(size[i]+" ");
	}

	@Override
	public boolean isEmpty() {
		return top==-1;
	}

	@Override
	public boolean isFull() {
		
		return top==capacity-1;
	}

	@Override
	public int getSize() {
		
		return len;
	}

}
