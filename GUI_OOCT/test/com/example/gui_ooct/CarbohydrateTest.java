package com.example.gui_ooct;

import com.Classes.Carbohydrate;
import com.Classes.Food;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarbohydrateTest {
    /**
     * Testing total carbohydrate function by passing in two foods of amount 100g carbohydrate to see if received total carb equals 200
     */
    @Test
    void totalCarb200() {
        Food f1 = new Food("Rice");
        f1.addFood(f1);
        int f1c = 100;
        Carbohydrate rice = new Carbohydrate(f1c);
        rice.addNutrient(f1);
        int f2c = 100;
        Food f2 = new Food("Bread");
        Carbohydrate bread = new Carbohydrate(f2c);
        bread.addNutrient(f2);
        f2.addFood(f2);
        int providedtotalc = f1c+f2c;
        int receivedtotalc = Carbohydrate.totalCarb();

        assertEquals(providedtotalc,receivedtotalc);

        Food.getMap().clear();

    }

    /**
     * Testing total carbohydrae function by passing in two foods of amount 10g and 90g carbohydrates to see if received total carbohydrate equals 100.
     */
    @Test
    void totalCarb100() {
        Food f1 = new Food("Rice");
        f1.addFood(f1);
        int f1c = 10;
        Carbohydrate Rice = new Carbohydrate(f1c);
        Rice.addNutrient(f1);
        int f2c = 90;
        Food f2 = new Food("bread");
        Carbohydrate bread = new Carbohydrate(f2c);
        bread.addNutrient(f2);
        f2.addFood(f2);
        int providedtotalc = f1c+f2c;
        int receivedtotalc = Carbohydrate.totalCarb();
        assertEquals(providedtotalc,receivedtotalc);

        Food.getMap().clear();
    }

    /**
     * Testing total carbohydrate function by passing in two foods of amount 0g proteins to see if received total carbohydrate equals 0.
     */
    @Test
    void totalCarb00() {
        Food f1 = new Food("Rice");
        f1.addFood(f1);
        int f1c = 0;
        Carbohydrate chicken = new Carbohydrate(f1c);
        chicken.addNutrient(f1);
        int f2c = 0;
        Food f2 = new Food("Bread");
        Carbohydrate fish = new Carbohydrate(f2c);
        fish.addNutrient(f2);
        f2.addFood(f2);
        int providedtotalc = f1c+f2c;
        int receivedtotalc = Carbohydrate.totalCarb();

        assertEquals(providedtotalc,receivedtotalc);

        Food.getMap().clear();

    }

    /**
     * testing highest carb function by passing in Rice with 100g carb and bread with 20 g and seeing if highest cabohydrate returned is equal to Rice
     */
    @Test
    void highestCarbRice() {

        Food f1 = new Food("Rice");
        f1.addFood(f1);
        int f1c = 100;
        Carbohydrate Rice = new Carbohydrate(f1c);
        Rice.addNutrient(f1);
        int f2c = 20;
        Food f2 = new Food("Bread");
        Carbohydrate Bread = new Carbohydrate(f2c);
        Bread.addNutrient(f2);
        f2.addFood(f2);
        String highestprovided = f1.getfoodName();
        String highestreceived = Carbohydrate.highest_carb();

        assertEquals(highestreceived,highestprovided);

        Food.getMap().clear();
    }


    /**
     * testing highest carb function by passing in Rice with 11g protein and bread with 10 g and seeing if highest carb returned is equal to Rice.
     */
    @Test
    void highestCarbRice2() {

        Food f1 = new Food("Rice");
        f1.addFood(f1);
        int f1c = 11;
        Carbohydrate Rice = new Carbohydrate(f1c);
        Rice.addNutrient(f1);
        int f2c = 10;
        Food f2 = new Food("Bread");
        Carbohydrate Bread = new Carbohydrate(f2c);
        Bread.addNutrient(f2);
        f2.addFood(f2);
        String highestprovided = f1.getfoodName();
        String highestreceived = Carbohydrate.highest_carb();

        assertEquals(highestreceived,highestprovided);

        Food.getMap().clear();
    }

    /**
     * testing highest carb function by passing in Rice with 10g carbohydrate and bread with 50 g and seeing if highest carbohydrate returned is equal to bread
     */
    @Test
    void highestCarbBread() {

        Food f1 = new Food("Rice");
        f1.addFood(f1);
        int f1c = 10;
        Carbohydrate Rice = new Carbohydrate(f1c);
        Rice.addNutrient(f1);
        int f2c = 50;
        Food f2 = new Food("Bread");
        Carbohydrate Bread = new Carbohydrate(f2c);
        Bread.addNutrient(f2);
        f2.addFood(f2);
        String highestprovided = f2.getfoodName();
        String highestreceived = Carbohydrate.highest_carb();

        assertEquals(highestreceived,highestprovided);

        Food.getMap().clear();
    }
}