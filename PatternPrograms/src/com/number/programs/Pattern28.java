package com.number.programs;

import java.util.Scanner;

public class Pattern28
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        int temp = 1;
        for(int i=1; i<=rows/2+1; i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(temp*j+" ");
            }
            System.out.println();
            temp++;
        }
        for(int i=1; i<=rows/2; i++)
        {
            for(int j=1;j<=rows/2+1-i;j++)
            {
                System.out.print(temp*j+" ");
            }
            System.out.println();
            temp++;
        }
    }
}