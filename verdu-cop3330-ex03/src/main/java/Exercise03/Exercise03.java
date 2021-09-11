package Exercise03;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise03 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = scanner.nextLine();

        System.out.print("Who said it? ");
        String author = scanner.nextLine();

        System.out.print(author + " says, \"" +  quote + "\"");
    }

}
