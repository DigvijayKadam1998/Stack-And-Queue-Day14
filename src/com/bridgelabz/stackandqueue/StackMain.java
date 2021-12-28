package com.bridgelabz.stackandqueue;

import java.util.Scanner;

public class StackMain {
	public static void main(String[] args) {
		Operation operation = new Operation();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1. To add element at the start \n" + "Enter 2. To show the peek element \n" + "Enter 3. To Pop the element");
		switch (scanner.nextInt()) {
		case 1:
			operation.addElement();
			break;
		case 2:
			operation.peek();
			break;
		case 3:
			operation.pop();
			break;
		}
		scanner.close();
	}
}
