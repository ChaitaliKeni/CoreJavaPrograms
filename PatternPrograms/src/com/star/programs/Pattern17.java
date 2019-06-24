package com.star.programs;

import java.util.Scanner;

public class Pattern17
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");
        
        for (int i=1; i<=rows; i++)
        {
            // Print star in decreasing order
            for (int j=rows; j >=i; j--)
            {
                if( i == 1 || j == i || j == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            // Print space in increasing order
            for (int k=1; k<i; k++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
        scanner.close();
    }
}