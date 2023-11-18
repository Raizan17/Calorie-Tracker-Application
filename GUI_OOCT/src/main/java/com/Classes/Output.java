package com.Classes;

public class Output {

    public static void giveOutputIntro(){
        System.out.println("Hello!, Welcome to The Calorie Tracker \n" +
                "In order to start your Calorie Tracking process,");
    }

    public static void giveOutputHeight(){
        System.out.println("Please enter your height in centimetres. (rounded to the nearest integer):");
    }

    public static void giveOutputWeight(){
        System.out.println("Please enter your weight in kilograms. (rounded to the nearest integer):");
    }

    public static void giveOutputAge(){
        System.out.println("Please enter your age (rounded to the nearest integer):");
    }

    public static void giveOutputMenu(){
        System.out.println("""
                TRACKING SOFTWARE:
                CALORIES TRACKER

                Basic data
                1) Add a food, add calorie of food (Kcal)

                Add additional data
                2) provide protein amount in certain food (gm)
                3) provide carbohydrate amount in certain food(gm)
                4) provide fat amount in certain food(gm)

                General Information:
                5) Show my total calorie requirement and my total intake for the day.(Kcal)

                Additional Information:
                6) Show my Total protein intake for the day(gm)
                7) Show the food with the  highest amount of protein.
                8) Show my Total carbohydrate intake for the day(gm)
                9) Show the food with the highest amount of carbohydrate.
                10) Show my Total fat intake for the day(gm)
                11) Show the food with the highest amount of fat.
                12) Save Data
                13) Load Data
                0) Terminate program.

                 Please enter a number to choose your option.""");
    }


   public static void giveOutputStart1(){
       System.out.println("Enter the name of food you had:");
   }


    public static void giveOutputMid1(){
        System.out.println("Successfully added food:");
    }

    public static void giveOutputEnd1(){
        System.out.println("Do you want to add another food?(Press 1 to add and 0 to cancel):");
    }

    public static void giveOutputStart2(){
        System.out.println("Enter name of food:");
    }

    public static void giveOutputEnd2(){
        System.out.println("Enter amount of protein in food in grams:");
    }

    public static void giveOutputStart3(){
        System.out.println("Enter name of food:");
    }

    public static void giveOutputEnd3(){
        System.out.println("Enter amount of carbohydrate in food in grams:");
    }
    public static void giveOutputCal(){
        System.out.println("Enter total calorie of food in Kcal:");}


    public static void giveOutputStart4(){
        System.out.println("Enter name of food:");
    }

    public static void giveOutputEnd4(){
        System.out.println("Enter amount of fat in food in grams:");
    }

    public static void giveOutputStart5(double expected_v,int total_mycalorie_v){
        System.out.println("Your total calorie requirement for the day is " + expected_v + " kcal.\n " +
                "Your total calorie intake for the day is " + total_mycalorie_v + "kcal.");
    }

    public static void giveOutputStart6(int Total_protein){
        System.out.println("Your total protein intake for the day is:" + Total_protein + "grams.");
    }

    public static void giveOutputStart7(String Highest_protein_food){
        System.out.println("The food with the highest amount of protein you have eaten today is:" + Highest_protein_food);
    }

    public static void giveOutputStart8(int Total_carb){
        System.out.println("Your total carbohydrate intake for the day is:" + Total_carb + "grams.");
    }
    public static void giveOutputStart9(String Highest_carb_food){
        System.out.println("The food with the highest amount of carbohydrate you have eaten today is:" + Highest_carb_food);
    }

    public static void giveOutputMore(){
        System.out.println("\n///////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Task completed, choose another option.");

    }
    public static void giveOutput11(String Highest_fat_food){
        System.out.println("The food with the highest amount of fat you have eaten today is:"+ Highest_fat_food);

    }

    public static void giveOutput10(int Total_fat){
        System.out.println("Your total fat intake for the day is:" + Total_fat + "grams.");


    }

    public static void giveOutputRight(){
        System.out.println("Incorrect! Please enter proper input to choose options");

    }

    public static void giveOutput12(){
        System.out.println("File Saved Successfully");

    }
    public static void giveOutput13(){
        System.out.println("File Loaded Successfully");

    }

    public static void giveOutput0(){
        System.out.println("Thank you for using the Object Oriented Calorie Tracker By Rezwan Ahmed and Raizan Ahmed! \n Have a nice day! \n Program Terminating.");

    }
}



