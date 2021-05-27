package com.project1;

import java.util.Scanner;

public class Main {
    UserInput test = new UserInput();

    public static void main(String[] args) {
        //First Paragraph of introduction text
        System.out.println("Standing on the cold tiles of the bathroom floor you wait patiently for the hot water to come through to the shower head.");
        System.out.println("It's been a relaxed evening alone of Netflix on the couch while the family has been out. ");
        System.out.println("You're looking forward to climbing into bed. ");
        System.out.println("In your mind you run through everything you needed to do before bed: All the lights downstairs are off, and the doors are locked. ");
        System.out.println("You left garage door roller door is open! Damn! You'll have to go back downstairs after my shower.");

        switch (getUserResponse(3);) {
            // Enter the number of options you have for this question in the (). example: getUserResponse(3) for 3 options
            // The switch statement tells the code what to do given the user's User's selection, don't forget to add 'break' afterwards...
            // make sure you have a case for each option as well as setting the number of options in the switch() function
            case 1:
                break; //We just want to continue in the story so we don't need any other code here
            case 2:
                newmethod():
                System.out.println("you selected the 2nd option");
                break;
            case 3:
                System.out.println("You selected the 3rd option");
                break;
        }
        // Second Paragraph of introduction text
        System.out.println("We are actually making some headway!");
        System.out.println("How do we make this work on Git?");
        System.out.println("How do we make this work on Git?");


    }

    public static int getUserResponse(int numOfOptions) { //This is our user input method

        Scanner userResponse = new Scanner(System.in); //Initialising a scanner object to get user feedback, and calling it 'userResponse'
        int number;
        do {
            System.out.print("Choose an option between 1 and " + numOfOptions + ": \n");
            while (!userResponse.hasNextInt()) {
                System.out.print("\"" + userResponse.next() + "\" is not a valid number.\n");
            }
            number = userResponse.nextInt();
        } while (number <= 0 || number > numOfOptions);

        return number;
    }

}
