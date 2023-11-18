package com.example.gui_ooct;

import com.Classes.Fat;
import com.Classes.Food;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FatTest {

    /**
     * Testing total fat function by passing in two foods of amoount 100g fat to see if received total fat equals 200
     */

    @Test
    void totalFat200() {
        Food f1 = new Food("Cheese");
        f1.addFood(f1);
        int f1f = 100;
        Fat cheese = new Fat(f1f);
        cheese.addNutrient(f1);
        int f2f = 100;
        Food f2 = new Food("Figs");
        Fat figs = new Fat(f2f);
        figs.addNutrient(f2);
        f2.addFood(f2);
        int providedtotalf = f1f+f2f;
        int receivedtotalf = Fat.totalFat();

        assertEquals(providedtotalf,receivedtotalf);

        Food.getMap().clear();

    }

    /**
     * Testing total fat function by passing in two foods of amount 10g and 90g proteins to see if received total fat equals 100.
     */
    @Test
    void totalFat100() {
        Food f1 = new Food("Cheese");
        f1.addFood(f1);
        int f1f = 10;
        Fat cheese = new Fat(f1f);
        cheese.addNutrient(f1);
        int f2f = 90;
        Food f2 = new Food("Figs");
        Fat figs = new Fat(f2f);
        figs.addNutrient(f2);
        f2.addFood(f2);
        int providedtotalf = f1f+f2f;
        int receivedtotalf = Fat.totalFat();

        assertEquals(providedtotalf,receivedtotalf);

        Food.getMap().clear();

    }

    /**
     * Testing total fat function by passing in two foods of amount 0g fat to see if received total protein equals 0.
     */
    @Test
    void totalFat00() {
        Food f1 = new Food("Cheese");
        f1.addFood(f1);
        int f1f = 0;
        Fat cheese = new Fat(f1f);
        cheese.addNutrient(f1);
        int f2f = 0;
        Food f2 = new Food("Figs");
        Fat figs = new Fat(f2f);
        figs.addNutrient(f2);
        f2.addFood(f2);
        int providedtotalf = f1f+f2f;
        int receivedtotalf = Fat.totalFat();

        assertEquals(providedtotalf,receivedtotalf);

        Food.getMap().clear();

    }

    /**
     * testing highest fat function by passing in Cheese with 100g protein and Fish with 20 g and seeing if highest protein returned is equal to Chicken
     */
    @Test
    void highestFatCheese() {

        Food f1 = new Food("Cheese");
        f1.addFood(f1);
        int f1f = 100;
        Fat cheese = new Fat(f1f);
        cheese.addNutrient(f1);
        int f2f = 20;
        Food f2 = new Food("Figs");
        Fat figs = new Fat(f2f);
        figs.addNutrient(f2);
        f2.addFood(f2);
        String highestprovided = f1.getfoodName();
        String highestreceived = Fat.highestFat();

        assertEquals(highestreceived,highestprovided);

        Food.getMap().clear();
    }


    /**
     * testing highest fat function by passing in Cheese with 11g fat and Figs with 10 g and seeing if highest fat returned is equal to Cheese
     */
    @Test
    void highestFatCheese2() {

        Food f1 = new Food("Cheese");
        f1.addFood(f1);
        int f1f = 100;
        Fat cheese = new Fat(f1f);
        cheese.addNutrient(f1);
        int f2f = 20;
        Food f2 = new Food("Figs");
        Fat figs = new Fat(f2f);
        figs.addNutrient(f2);
        f2.addFood(f2);
        String highestprovided = f1.getfoodName();
        String highestreceived = Fat.highestFat();

        assertEquals(highestreceived,highestprovided);

        Food.getMap().clear();
    }

    /**
     * testing highest fat function by passing in Cheese with 10g protein and Figs with 50 g and seeing if highest fat returned is equal to Figs
     */
    @Test
    void highestFatFigs() {

        Food f1 = new Food("Cheese");
        f1.addFood(f1);
        int f1f = 10;
        Fat cheese = new Fat(f1f);
        cheese.addNutrient(f1);
        int f2f = 50;
        Food f2 = new Food("Figs");
        Fat figs = new Fat(f2f);
        figs.addNutrient(f2);
        f2.addFood(f2);
        String highestprovided = f2.getfoodName();
        String highestreceived = Fat.highestFat();

        assertEquals(highestreceived,highestprovided);

        Food.getMap().clear();
    }
}