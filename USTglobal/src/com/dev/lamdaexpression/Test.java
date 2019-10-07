package com.dev.lamdaexpression;

public class Test {

	public static void main(String[] args) {
		

		 FunInt f = () ->{
			
			try {
				
				int c = 10 / 0;
				System.out.println("result "+c);
			} catch (Exception e) {
				
				System.out.println(e);
			}
			
		 };
		
		 f.show();
		
	}

}
