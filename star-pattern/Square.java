package com.jsp.star.patterns;

import java.util.Scanner;

public class Square {
	
	public static void square() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The No.Of Rows");
		int n = sc.nextInt();
		System.out.println("Start To Print....\n");
		
		for(int i=1;i<=n;i++)     // TO PRINT ROWS
		{
			for(int j=1;j<=n;j++)// TO PRINT CLOUMNS
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

	public static void main(String[] args) 
	{
	    square();

	}

}
