package com.number.programs;

import java.util.Scanner;

public class Pattern38
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();
        
        System.out.println("** Printing the pattern... **");
        
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            
            for (int j= i*2 ; j < rows*2; j++) 
            { 
                System.out.print(" "); 
            } 
            for (int l = i; l >= 1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
        scanner.close();
    }
}