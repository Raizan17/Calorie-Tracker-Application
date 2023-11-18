package com.Classes;

import java.util.ArrayList;
import java.util.HashMap;
// Food Classw
public class Food {
    public static ArrayList<Food> foodArrayList = new ArrayList<Food>();
    private String foodName;
    private int[] FoodArray = new int[3];
    public static final HashMap<Food, int[] > map = new HashMap<Food,int[]>();


    /**
     *Food constructor for String Food input.
     */
    public Food(String foodName) {
        this.foodName = foodName;
    }

    /**
     *Food constructor for child classes.
     */
    public Food() {

    }

    /**
     *Getter function that gets the name of certain Food.
     * @return food name
     */
    public String getfoodName(){
        return this.foodName;
    }

    /**
     *Function that adds food to the food dictionary.
     */
    public void addFood(Food foodName){

        map.put(foodName,FoodArray);
        foodArrayList.add(foodName);
    }

    /**
     * Static HashMap that stores food and Array of size 3 that includes Protein,Carbohydrate and Fat.
     */

    public static HashMap<Food, int[]> getMap() {
        return map;
    }


    /**
     *Getter function that gets the ArrayList storing Foods
     * @return Food array list
     */
    public int[] getFoodArray() {
        return FoodArray;
    }

    /**
     * Overriding To String to return name of food.
     * @return Food name
     */
    @Override
    public String toString() {
        return foodName;
    }
}