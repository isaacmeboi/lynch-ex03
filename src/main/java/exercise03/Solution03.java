/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Isaac Lynch
 */
package exercise03;

import java.util.Scanner;
public class Solution03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the quote?");
        String q = sc.nextLine();//reads input on next line

        System.out.println("Who said it?");
        String n = sc.nextLine();

        System.out.println(n + " says, \"" + q + "\"");

    }
}
/*once again a process of trying to remember that I'm not limited
to just on + in the print statements first, java.util is imported to
use the scanner function in the library. then, a public class and a
main function is declared. an instance and declaration of the scanner
function is made on line 6. the system prints out the first prompt,
then reads in the following line. next, it prints out the second prompt
and reads THAT following line. finally, it prints out the name of the
character/actor and then the quote inputted.
 */