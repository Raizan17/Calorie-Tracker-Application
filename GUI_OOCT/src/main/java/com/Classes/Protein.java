package com.Classes;

import java.util.HashMap;

public class Protein extends Nutrients {
    private int protein;

    public Protein(int protein) {
        super();
        this.protein = protein;
    }

    /**
     * overrided method from Nutrients which adds protein to the food by searching the food in the dictionary
     * and adding protein to the first index of the array which is the key value of the food.
     * @param: foodName(Food) name of food in dictionary which will contain the protein value in its array.
     */
    @Override
    public void addNutrient(Food foodName) {
        int AddedProtein = this.protein;
        HashMap<Food, int[]> fmap = Food.getMap();
        int[] p_array = foodName.getFoodArray();
        p_array[0] = AddedProtein;
        fmap.put(foodName, p_array);
    }


    /**method that loops through the Hashmap and searches through the arrays for each key food
     * and if it contains protein adds it up to an int variable.
     * @return: Total_protein(int) variable that stores the summation of all proteins.
     */

    public static int totalProtein(){
        int Total_protein = 0;
        for (Food key : Food.getMap().keySet()) {
            int[] array_p = Food.getMap().get(key);
            Total_protein = Total_protein + array_p[0];
        }
        return Total_protein;
    }

    /**method that loops through dictionary and looks for highest protein in each array of each key food and stores it in a variable.
     *
     * @return: h_p(String) string food with the highest amount of protein stored for it.
     */
    public static String highestProtein() {
        // Finding highest Protein:
        HashMap<Food, int[]> food_dict = Food.getMap();
        int highest_protein = 0;
        for (Food key : food_dict.keySet()) {                        // looping through the keySet of the ArrayList.
            int[] array_x = (int[]) food_dict.get(key);               // getting value of certain key.
            int protein = array_x[0];                                // getting the amount of protein in that food by accessing index 0
            if (protein == 0 && highest_protein == 0) {
                highest_protein = 0;
            } else if (protein > highest_protein) {
                ;
                highest_protein = protein;
            }
        }
        Food highest_protein_food = new Food("None");

        for (Food key : food_dict.keySet()) {                       // looping through the keySet of the ArrayList
            int[] array_y = (int[]) food_dict.get(key);
            int protein2 = array_y[0];
            if (protein2 == highest_protein) {
                highest_protein_food = key;
            }
        }
        String h_p = highest_protein_food.getfoodName();
        return h_p;

    }

}
