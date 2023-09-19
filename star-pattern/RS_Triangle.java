package com.jsp.star.patterns;

import java.util.Scanner;

public class RS_Triangle // RIGHT SIDE INCREASEING TRIANGLE
{
	//METHODS
	public static void rstriangle() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The No.Of Rows");
		int n = sc.nextInt();
		System.out.println("Start To Print....");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n-1;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		sc.close();
	}

	public static void main(String[] args) 
	{
		rstriangle();

	}

}
