package com.Classes;

import java.util.HashMap;

public class Carbohydrate extends Nutrients {
    private int carbohydrate;

    public Carbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    @Override
    /**
     * overrided method from Nutrients which adds carb to the food by searching the food in the dictionary
     * and adding carb to the second index of the array which is the key value of the food.
     * @param: foodName(Food) name of food in dictionary which will contain the carb value in its array.
     */
    public void addNutrient(Food foodName) {
        int AddedCarbohydrate = this.carbohydrate;
        HashMap<Food, int[]> fmap = Food.getMap();
        int[] c_array = foodName.getFoodArray();
        c_array[1] = AddedCarbohydrate;
        fmap.put(foodName, c_array);
    }

    /**method that loops through the Hashmap and searches through the arrays for each key food
     * and if it contains carb adds it up to an int variable.
     * @return: TotalCarb(int) variable that stores the summation of all carbs.
     */
    public static int totalCarb(){

        int Total_carbohydrate = 0;
        for (Food key : Food.getMap().keySet()) {
            int[] array_c = Food.getMap().get(key);
            Total_carbohydrate = Total_carbohydrate + array_c[1];
        }
        return Total_carbohydrate;
    }
    /**method that loops through dictionary and looks for highest carb in each array of each key food and stores it in a variable.
     *
     * @return: h_c(String) string food with the highest amount of carb stored for it.
     */
    public static String highest_carb() {
        HashMap<Food, int[]> food_dict = Food.getMap();
        int highest_carb = 0;
        for (Food key : food_dict.keySet()) {                      // looping through the keySet of the ArrayList
            int[] array_x = (int[]) food_dict.get(key);                  // getting value of certain key
            int carb = array_x[1];                                       // getting the amount of carbohydrate in that food by accessing index 1
            if (carb == 0 && highest_carb == 0) {
                highest_carb = 0;
            }
            if (carb > highest_carb) {
                highest_carb = carb;
            }
        }

        Food highest_carb_food = new Food("none");

        for (Food key : food_dict.keySet()) {                       // looping through the keySet of the ArrayList
            int[] array_y = (int[]) food_dict.get(key);
            int carb2 = array_y[1];
            if (carb2 == highest_carb) {
                highest_carb_food = key;
            }
        }
        String h_c = highest_carb_food.getfoodName();
        return h_c;

    }

}
