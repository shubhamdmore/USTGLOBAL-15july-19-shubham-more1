
package com.dev.array;
import java.util.*;
public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a = {10,20,30,40,50};
		
		int i=a.length;
		
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter array index");
		
		int in=input.nextInt();
		
		if(in>i)
		{
			System.out.println("enter index between 0 to 4");
		}
		else
		{
			System.out.println("valid array index " );
			
			for(int j=0;j<=in;j++)
			{
				System.out.println(a[j]);
			}
		}
		
		int m=(i)/(2);
		System.out.println("middle element = "+a[m]);		
		
		
	}

}
