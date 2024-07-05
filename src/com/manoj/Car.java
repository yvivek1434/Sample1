package com.manoj;

public class Car extends Engine
{
	public void drive()
	{
		int n=super.startE();
		if(n>=1)
			System.out.println("Journey Started successfully Inheritance");
		else
			System.out.println("Engine having problem Inheritance");
	}
}
