package com.Classes;

import java.util.HashMap;

public class Fat extends Nutrients {
    private int fat;
    public Fat(int fat) {
        this.fat = fat;
    }

    @Override
    /**
     * overrided method from Nutrients which adds fat to the food by searching the food in the dictionary
     * and adding fat to the third index of the array which is the key value of the food.
     * @param: foodName(Food) name of food in dictionary which will contain the fat value in its array.
     */
    public void addNutrient(Food foodName){
        int AddedFat = this.fat;
        HashMap<Food, int[]> fmap = Food.getMap();
        int[] f_array = foodName.getFoodArray();
        f_array[2] = AddedFat;
        fmap.put(foodName, f_array);
    }


    /**method that loops through the Hashmap and searches through the arrays for each key food
     * and if it contains fat adds it up to an int variable.
     * @return: TotalFat(int) variable that stores the summation of all fats.
     */
    public static int totalFat(){
        int Total_fat = 0;
        for (Food key : Food.getMap().keySet()) {                    //loop through hashmap by key
            int[] array_f = Food.getMap().get(key);
            Total_fat = Total_fat + array_f[2];
        }
        return Total_fat;
    }
    /**method that loops through dictionary and looks for highest fat in each array of each key food and stores it in a variable.
     *
     * @return: h_f(String) string food with the highest amount of fat stored for it.
     */
    public static String highestFat() {
        HashMap<Food, int[]> food_dict = Food.getMap();
        // Finding highest Fat:
        int highest_fat = 0;
        for (Food key : food_dict.keySet()) {                         // looping through the keySet of the ArrayList
            int[] array_x = (int[]) food_dict.get(key);                 // getting value of certain key
            int fat = array_x[2];                                      // getting the amount of carbohydrate in that food by accessing index 2
            if (fat == 0  && highest_fat==0 ) {
                highest_fat = 0;
            }
            if (fat > highest_fat) {
                highest_fat = fat;
            }
        }
        Food highest_fat_food = new Food("none") ;

        for (Food key : food_dict.keySet()) {                          // looping through the keySet of the ArrayList
            int[] array_y = (int[]) food_dict.get(key);
            int fat2 = array_y[2];
            if (fat2 == highest_fat) {
                highest_fat_food = key;
            }
        }
        String h_f = highest_fat_food.getfoodName();
        return h_f;

    }
}
