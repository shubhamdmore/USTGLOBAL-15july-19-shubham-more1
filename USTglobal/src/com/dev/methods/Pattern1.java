package com.dev.methods;

public class Pattern1 {

	public static void main(String[] args) {
		
	    char ch = 'A';
	    char ch1 = 'a';
	    for(int k=1;k<=3;k++)
	    {
	    for(int l=1;l<=k;l++) 	
		{
			System.out.print(ch+ ""+ch1+ " ");
			ch++;
			ch1++;
		}
	    System.out.println();
	}
	

	}

}
