package com.example.gui_ooct;

import com.Classes.Food;
import com.Classes.Protein;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProteinTest {

    /**
     * Testing total protein function by passing in two foods of amoount 100g proteins to see if received total protein equals 200
     */

    @Test
    void totalProtein200() {
        Food f1 = new Food("Chicken");
        f1.addFood(f1);
        int f1p = 100;
        Protein chicken = new Protein(f1p);
        chicken.addNutrient(f1);
        int f2p = 100;
        Food f2 = new Food("Fish");
        Protein fish = new Protein(f2p);
        fish.addNutrient(f2);
        f2.addFood(f2);
        int providedtotalp = f1p+f2p;
        int receivedtotalp = Protein.totalProtein();

        assertEquals(providedtotalp,receivedtotalp);

        Food.getMap().clear();

    }

    /**
     * Testing total protein function by passing in two foods of amount 10g and 90g proteins to see if received total protein equals 100.
     */
    @Test
    void totalProtein100() {
        Food f1 = new Food("Chicken");
        f1.addFood(f1);
        int f1p = 10;
        Protein chicken = new Protein(f1p);
        chicken.addNutrient(f1);
        int f2p = 90;
        Food f2 = new Food("Fish");
        Protein fish = new Protein(f2p);
        fish.addNutrient(f2);
        f2.addFood(f2);
        int providedtotalp = f1p+f2p;
        int receivedtotalp = Protein.totalProtein();

        assertEquals(providedtotalp,receivedtotalp);

        Food.getMap().clear();
    }

    /**
     * Testing total protein function by passing in two foods of amount 0g proteins to see if received total protein equals 0.
     */
    @Test
    void totalProtein00() {
        Food f1 = new Food("Chicken");
        f1.addFood(f1);
        int f1p = 0;
        Protein chicken = new Protein(f1p);
        chicken.addNutrient(f1);
        int f2p = 0;
        Food f2 = new Food("Fish");
        Protein fish = new Protein(f2p);
        fish.addNutrient(f2);
        f2.addFood(f2);
        int providedtotalp = f1p+f2p;
        int receivedtotalp = Protein.totalProtein();

        assertEquals(providedtotalp,receivedtotalp);

        Food.getMap().clear();
    }

    /**
     * testing highest protein function by passing in Chicken with 100g protein and Fish with 20 g and seeing if highest protein returned is equal to Chicken
     */
    @Test
    void highestProteinChicken() {

        Food f1 = new Food("Chicken");
        f1.addFood(f1);
        int f1p = 100;
        Protein chicken = new Protein(f1p);
        chicken.addNutrient(f1);
        int f2p = 20;
        Food f2 = new Food("Fish");
        Protein fish = new Protein(f2p);
        fish.addNutrient(f2);
        f2.addFood(f2);
        String highestprovided = f1.getfoodName();
        String highestreceived = Protein.highestProtein();

        assertEquals(highestreceived,highestprovided);

        Food.getMap().clear();
    }


    /**
     * testing highest protein function by passing in Chicken with 11g protein and Fish with 10 g and seeing if highest protein returned is equal to Chicken
     */
    @Test
    void highestProteinChicken2() {

        Food f1 = new Food("Chicken");
        f1.addFood(f1);
        int f1p = 11;
        Protein chicken = new Protein(f1p);
        chicken.addNutrient(f1);
        int f2p = 10;
        Food f2 = new Food("Fish");
        Protein fish = new Protein(f2p);
        fish.addNutrient(f2);
        f2.addFood(f2);
        String highestprovided = f1.getfoodName();
        String highestreceived = Protein.highestProtein();

        assertEquals(highestreceived,highestprovided);

        Food.getMap().clear();
    }

    /**
     * testing highest protein function by passing in Chicken with 10g protein and Fish with 50 g and seeing if highest protein returned is equal to Fish
     */
    @Test
    void highestProteinFish() {

        Food f1 = new Food("Chicken");
        f1.addFood(f1);
        int f1p = 10;
        Protein chicken = new Protein(f1p);
        chicken.addNutrient(f1);
        int f2p = 50;
        Food f2 = new Food("Fish");
        Protein fish = new Protein(f2p);
        fish.addNutrient(f2);
        f2.addFood(f2);
        String highestprovided = f2.getfoodName();
        String highestreceived = Protein.highestProtein();

        assertEquals(highestreceived,highestprovided);

        Food.getMap().clear();
    }
}

