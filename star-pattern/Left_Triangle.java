package com.jsp.star.patterns;

import java.util.Scanner;

public class Left_Triangle 
{
	public static void patterns() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows.");
		int n = sc.nextInt();
		System.out.println("Start to Printing Left Triangle....");

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=i)
				{
					System.out.print("*"+" ");
				}
				
			}
			System.out.println();
		}
		sc.close();
	}

	public static void main(String[] args) 
	{
		
           patterns();
	}

}
