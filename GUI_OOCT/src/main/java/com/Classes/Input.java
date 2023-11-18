package com.Classes;

import java.io.IOException;
import java.util.Scanner;

public class Input {

    // Get input integers
    public static int GetInputInt() {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        int input = 0;
        while (!done) {
            try {
                input = scanner.nextInt();

                done = true;
            } catch (RuntimeException e) {
                System.err.println("Error! type of information provided is incorrect! Please provide correct type of input(Integer)");
                System.exit(1);
            }

        }
        return input;
    }

    // Get input Strings
    public static String GetInputString(){
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        String input_S = null;
        while(!done){
        try{input_S = scanner.nextLine();
        done = true;
        }
        catch(RuntimeException e){
            System.err.println("Error! type of information provided is incorrect! Please provide correct type of input(String)");}
        }

        return input_S;
    }
}
