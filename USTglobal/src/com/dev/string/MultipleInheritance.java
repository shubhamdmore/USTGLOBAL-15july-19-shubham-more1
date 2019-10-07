/**
 * 
 */
package com.dev.string;

/**
 * @author more
 *
 */

interface I1
{
	default void display()
	{
		System.out.println("This is I1 inteface");
	}
}
interface I2
{
	default void display()
	{
		System.out.println("This is I2 inteface");
	}
}
public class MultipleInheritance implements I1,I2 {

	/**
	 * @param args
	 */
	public void display()
	{
		I1.super.display();
		I2.super.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleInheritance obj = new MultipleInheritance();
		obj.display();
	}

}
