package com.dev.exception;

public class ArrayException {

	public static void main(String[] args) {

		try {

			int a[] = new int[10];
			int c = a[11] / 5;
		} catch (Exception e) {
		
		
			e.printStackTrace();
		}
	}

}
