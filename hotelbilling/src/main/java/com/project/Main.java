package com.project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		MethodImplementation obj = new MethodImplementation();

		System.out.println("enter your choice");
		System.out.println("press 1 to show all items");
		System.out.println("press 2 to take order from customer");
		System.out.println("press 3 to oprate on food");
		System.out.println("press 4 to total bill of the day");

		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			obj.showAllItems();
			break;
		case 2:
			obj.takeOrder();
			break;
		case 3:
			System.out.println("enter your choice");
			System.out.println("enter 1 to add food items");
			System.out.println("enter 2 to remove food items");
			System.out.println("enter 3 to modify food items");
			int st = sc.nextInt();

			switch (st) {
			case 1:
				obj.addItems();
				break;
			case 2:
				obj.remove();
				break;
			case 3:
				obj.modify();
				break;
			default:
				System.out.println("enter valid choice");
				break;
			}
			break;
		case 4:
			obj.totalBill();
			break;
		default:
			System.out.println("please enter vallid choice");
			break;
		}

	}

}
