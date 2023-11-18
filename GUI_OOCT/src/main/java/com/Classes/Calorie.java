package com.Classes;

import java.util.ArrayList;

public class Calorie {
    private int foodCalorie;
    // constants used in formula to calculate required calorie of user
    private static final int FORMULA_CONSTANT1 = 864;
    private static final double FORMULA_CONSTANT2 = 9.72;
    private static final double FORMULA_CONSTANT3 = 14.2;
    private static final int FORMULA_CONSTANT4 = 503;
    //average exercise rate used
    private static final int AVE_EXERCISE_RATE=1;
    private static final int CONV_RATE = 100;

    public static ArrayList<Calorie> calorieList = new ArrayList<Calorie>();
    public Calorie(int foodCalorie) {
        super();
        this.foodCalorie = foodCalorie;
    }

    /**
     * This function adds the calorie of foods to an empty arraylist
     */
    public void addCalorie(Calorie c){
        calorieList.add(c);
    }

    /**
     * This function calculates the expected calorie of the user using a formula.
     * @return double expected_value: the expected calorie intake of the user according to their weight, heght and age.
     */
    public static double expectedCalorie(){

        double expected_value =((FORMULA_CONSTANT1 -(FORMULA_CONSTANT2 * User.GetAge()))+AVE_EXERCISE_RATE*((FORMULA_CONSTANT3*User.GetWeight())+(FORMULA_CONSTANT4*(User.GetHeight())/CONV_RATE)));
        return expected_value;

    }

    /**
     * calculates total calorie of all foods.
     * @return totalMycalorie:total calorie of type Calorie.
     */
    public static int myCalorie(){
        int c_arrayLength = calorieList.size();
        int totalMycalorie = 0;
        for (int i = 0; i < c_arrayLength ; i++) {
                Calorie c = calorieList.get(i) ;
                totalMycalorie = totalMycalorie + c.getFoodCalorie();
            }
        return totalMycalorie;
        }


    /**
     * gets the integer calorie value of the food.
     * @return foodCalorie:integer
     */
    public int getFoodCalorie() {
        return foodCalorie;
    }
}
