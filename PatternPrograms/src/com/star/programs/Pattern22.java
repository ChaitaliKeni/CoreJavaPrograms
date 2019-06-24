package com.star.programs;

import java.util.Scanner;

public class Pattern22
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");
        
        // Print i number of stars
        for (int i=1; i<=rows; i++)
        {
            for (int j=1; j<=i; j++)
            {
                if( j == 1 || j == i )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
        for (int i=1; i<=rows-1; i++)
        {
            // Print star in decreasing order
            for (int j = rows-1; j >= i; j--)
            {
                if( j == rows-1 || j == i || i == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            // Print space in increasing order
            for (int k = 1; k < i; k++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
        scanner.close();
    }
}