package com.dev.lamdaexpression;

public class table {

	public static void main(String[] args) {
		
		FunInt f = () ->
		{
			 for(int i=1;i<=10;i++)
			 {
				 System.out.println("i ="+i);
			 }
		};
		FunInt1 f1 = (int j) ->
		{
			 for(int i=1;i<=10;i++)
			 {
				 System.out.println("i ="+i*j);
			 }
		};
		
		
		
		f.show();
		f1.show1(5);

		
	}


}
