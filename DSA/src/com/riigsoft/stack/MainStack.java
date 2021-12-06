package com.riigsoft.stack;

import java.util.Scanner;

/**
 * @author Abdallah Mahmoud
 * linked in profile {@link https://www.linkedin.com/in/abdallahmahmud/}
 * **/

public class MainStack {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Stack Capacity :");
		int capacity = scanner.nextInt();
		Stack stack = new Stack(capacity);
		char ch;
		
		do {
			System.out.println("==Stact Operation==");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.PEEK");
			System.out.println("4.SEARCH");
			System.out.println("5.EMPTY");
			System.out.println("6.FULL");
			System.out.println("7.DISPLAY");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				try {
					System.out.print("Enter Integer Element :");
					stack.push(scanner.nextInt());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					System.out.print("Popped Element :"+stack.pop());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					System.out.print("Peek Element :"+stack.peek());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try {
					System.out.print("Enter Searched Element :");
					int element = scanner.nextInt();
					System.out.println("Element Found At Index :"+stack.search(element));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				try {
					System.out.print("Stack is Empty :"+stack.isEmpty());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				try {
					System.out.print("Stack is Full :"+stack.isFull());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 7:
				try {
					stack.display();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
				default:
					System.out.println("You Entered Wrong Entry !!!");
					break;
			}
			System.out.println("\nDo You Want To Continue...[y/n]?");
			ch = scanner.next().charAt(0);
		}while(ch=='y' || ch=='Y');

	}

}
