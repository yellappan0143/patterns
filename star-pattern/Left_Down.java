package com.jsp.star.patterns;

import java.util.Scanner;

public class Left_Down 
{
	public static void pattern() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The NO.Of.Rows ");
		int n = sc.nextInt();
        System.out.println("Start To Printing Left Down Triangle....");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				if(j>=i)
				{
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}

	public static void main(String[] args) 
	{
	    pattern();
	}

}
