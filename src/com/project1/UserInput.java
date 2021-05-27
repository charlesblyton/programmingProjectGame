package com.project1;

import java.util.Scanner;

public class UserInput {

    public int numOfOptions;

    public int ask() {
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
