package com.selenium;

interface printable
{
	void print();
	default void message()
	{
		System.out.println("Welcome to default method in interface");
	}
	static void staticmethod()
	{
		System.out.println("Static method executed");
	}
}
interface wrightable extends printable
{
	void write();
}

class A3 implements wrightable
{
	public void print()
	{
		System.out.println("welcome to printable");
	}
	public void write()
	{
		System.out.println("Welcome to wrightable");
	}
}
public class Multipleinterface {

	public static void main(String[] args) {
		A3 a=new A3();
		a.print();
		a.write();
		/*a.message();
		printable.staticmethod();
		*/
		
		

	}

}
