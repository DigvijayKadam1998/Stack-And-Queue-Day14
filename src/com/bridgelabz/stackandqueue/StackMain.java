package com.bridgelabz.stackandqueue;

import java.util.Scanner;

public class StackMain {
	 public static void main(String[] args) {
		 System.out.println("Welcome to the stack program");
		 Operation operation = new Operation();
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter 1. To add element at the start  ");
		 switch (scanner.nextInt()) {
		 case 1:
			 operation.addElement();
			 break;
		 }
		 scanner.close();
	 }
}
