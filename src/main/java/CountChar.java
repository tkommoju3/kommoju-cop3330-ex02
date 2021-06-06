/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;
public class CountChar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String text = input.nextLine();
        System.out.println(text + " has " + text.length() + " characters.");

    }
}
