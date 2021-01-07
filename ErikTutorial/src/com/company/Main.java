package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       //setting up Scanner to take user input
        Scanner input = new Scanner(System.in);//lean towards a generic name for scanner, you'll reuse it later!
        //use ctrl+f2 in repl.it to rename a variable
        //System.out.print("Type your name: ");//using "print" instead of println to keep input next to the question
//        String name = scanner.nextLine();
//        System.out.println("Your name is: " + name);
        //formatting strings
        //System.out.printf("Hello %s\n",name);

        //leaving out a " throws unclosed string literal error
        //System.out.println("Enter a name: );

        //throws error empty character literal
        //String name = input.nextLine('');

        //java: cannot find symbol
        //  symbol:   method nextline()
        //  location: variable input of type java.util.Scanner
        //String name = input.nextline();

        //java: cannot find symbol
        //  symbol:   class Int
        //  location: class com.company.Main
        //Int name = input.nextLine();

        System.out.println("Enter a name: ");
        String name = input.nextLine();
        System.out.println("Give me an adverb: ");
        String adverb = input.nextLine();
        System.out.println("Give me an adjective: ");
        String adjective = input.nextLine();
        System.out.println("Give me a verb: ");
        String verb = input.nextLine();
        System.out.println("Give me a noun two: ");
        String nounTwo = input.nextLine();
        System.out.println("Give me an number: ");
        String number = input.nextLine();
        System.out.println("Give me your name: ");
        String yourName = input.nextLine();

        System.out.printf("Here's your story: \n");
        System.out.printf("\n Dear %s,", name);
        System.out.printf("\n You are %s %s and I want to be your %s!", adverb, adjective, verb);
        System.out.printf("\n I want to go to the %s with you in %S days.", nounTwo, number);
        System.out.printf("\n Sincerely, %s \n", yourName);
    }
}
