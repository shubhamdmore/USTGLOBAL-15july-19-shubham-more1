package com.dev.exception;

public class NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null;

		try {
			@SuppressWarnings("null")
			int l = name.length();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println( e);
		}

	}

}
