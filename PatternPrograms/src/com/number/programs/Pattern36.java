package com.number.programs;

import java.util.Scanner;

public class Pattern36
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
            int j = (i * 2) - 1;

            for (int k = 1; k <= rows; k++) 
            { 
                System.out.print(j + " "); 
                j += 2; 
                if (j > (rows * 2) - 1)
                    j = 1;
            }
            System.out.println();
        }
        scanner.close();
    }
}