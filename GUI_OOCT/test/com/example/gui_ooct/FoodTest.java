package com.example.gui_ooct;

import com.Classes.Food;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodTest {

    /**
     * Testing function for getting name of food by giving Apple as food and comparing it with food name received.
     */

    @Test
    void getfoodNameApple() {
        String TestedFood = "Apple";
        Food testFood = new Food(TestedFood);
        String received_food = testFood.getfoodName();
        assertEquals(received_food, TestedFood);
    }

    /**
     * Testing function for getting name of food by giving Chicken as food and comparing it with food name received.
     */
    @Test
    void getfoodNameChicken() {
        String TestedFood = "Chicken";
        Food testFood = new Food(TestedFood);
        String received_food = testFood.getfoodName();
        assertEquals(received_food, TestedFood);
    }

    /**
     * Testing function for getting name of food by giving Fish as food and comparing it with food name received.
     */
    @Test
    void getfoodNameFish() {
        String TestedFood = "Fish";
        Food testFood = new Food(TestedFood);
        String received_food = testFood.getfoodName();
        assertEquals(received_food, TestedFood);
    }


    /**
     * Testing function for adding food by giving Apple as food and comparing it with the array returned at hash map.
     */
    @Test
    void addFoodApple() {
        String TestedFood = "Apple";
        Food testfood = new Food(TestedFood);
        testfood.addFood(testfood);
        int[] array_1 = new int[3];
        int[] received_array = Food.getMap().get(testfood);
        assertArrayEquals(array_1, received_array);
    }


    /**
     * Testing function for adding food by giving Chicken as food and comparing it with the array returned at hash map.
     */
    @Test
    void addFoodChicken() {
        String TestedFood = "Chicken";
        Food testfood = new Food(TestedFood);
        testfood.addFood(testfood);
        int[] array_1 = new int[3];
        int[] received_array = Food.getMap().get(testfood);
        assertArrayEquals(array_1, received_array);
    }

    /**
     * Testing function for adding food by giving Fish as food and comparing it with the array returned at hash map.
     */
    @Test
    void addFoodFish() {
        String TestedFood = "Fish";
        Food testfood = new Food(TestedFood);
        testfood.addFood(testfood);
        int[] array_1 = new int[3];
        int[] received_array = Food.getMap().get(testfood);
        assertArrayEquals(array_1, received_array);
    }
}
