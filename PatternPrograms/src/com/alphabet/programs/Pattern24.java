package com.alphabet.programs;

import java.util.Scanner;

public class Pattern24
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the String from the user
        System.out.println("Enter the String which needs to be printed ");

        String input = scanner.nextLine();
        System.out.println("** Printing the pattern... **");

        for (int i = 1; i <= input.length(); i++) 
        { 
            for (int j = input.length(); j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = i * 2 - 1; k >= 1; k--)
            {
                System.out.print(input.charAt(i - 1));
            }
            System.out.println("");
        }
    }
}