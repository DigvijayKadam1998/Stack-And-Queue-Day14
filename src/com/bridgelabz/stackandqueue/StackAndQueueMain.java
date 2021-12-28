package com.bridgelabz.stackandqueue;

import java.util.Scanner;

public class StackAndQueueMain {
	public static void main(String[] args) {
        Operation operation = new Operation();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1. To add element at the start \n" + "Enter 2. To show the peek element\n" +
        		"Enter 3. To show the pop \n " + "Enter 4. To queue the element");
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
        case 4:
        	operation.queueElement();
        	break;
        }
        scanner.close();
	}
}
