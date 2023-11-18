package com.Classes;

public class User {



    private static  int height=0;
    private static  int weight = 0;
    private static  int age=0;

    public User(int Height, int Weight, int Age) {
        height = Height;
        weight = Weight;
        age = Age;
    }

    /**
     * Getter function that gets and returns Height of user
     * @return User height
     */

    public static int GetHeight(){
        return height;
    }

    /**
     * Getter function that gets and returns Weight of user
     * @return User weight
     */
    public static int GetWeight(){
        return weight;
    }

    /**
     * Getter function that gets and returns Age of user
     * @return User age
     */

    public static int GetAge(){
        return age;
    }


    public static void setHeight(int height) {
        User.height = height;
    }

    public static void setWeight(int weight) {
        User.weight = weight;
    }

    public static void setAge(int age) {
        User.age = age;
    }

}
