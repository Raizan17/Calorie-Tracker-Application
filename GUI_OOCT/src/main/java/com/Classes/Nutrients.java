package com.Classes;

import com.Classes.Food;

import java.util.HashMap;

public abstract class Nutrients {
    private int nutrient;
    public Nutrients() {
    }

    public void addNutrient(Food foodName){
        int AddedNutrient = this.nutrient;
        HashMap<Food, int[]> fmap = Food.getMap();
        int[] n_array = foodName.getFoodArray();
        n_array[0] = AddedNutrient;
        fmap.put(foodName, n_array);
    }
}
