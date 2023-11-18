package com.example.gui_ooct;

import com.Classes.Calorie;
import com.Classes.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CalorieTest {

    @Test
    /**
     * test to check if the calorie being added is the same as given, 200.
     */
    void addCalorie1() {
        Calorie c = new Calorie(200);
        c.addCalorie(c);
        Calorie test_c = Calorie.calorieList.get(0);
        assertEquals(c, test_c);

        ArrayList<Calorie> calarray = Calorie.calorieList;
        calarray.clear();
    }

    @Test
    /**
     * test to check if both the calories being added are the same as given, 500 and 1000.
     */
    void addCalorie2() {
        Calorie c = new Calorie(500);
        Calorie c_2 = new Calorie(1000);
        c.addCalorie(c);
        c.addCalorie(c_2);
        Calorie test_c = Calorie.calorieList.get(0);
        Calorie test_c2 = Calorie.calorieList.get(1);
        assertEquals(c, test_c);
        assertEquals(c_2, test_c2);

        ArrayList<Calorie> calarray = Calorie.calorieList;
        calarray.clear();
    }

    @Test
    /**
     * testing if expectd caloric intake for given user information is correct with output of method expectedCalorie().
     */
    void expectedCalorie1() {

        User user = new User(160, 60, 20);
        int PA = 1;
        double expected_test = ((864 - (9.72 * User.GetAge()) + PA * ((14.2 * User.GetWeight()) + (503 * (User.GetHeight()) / 100))));
        assertEquals(expected_test, Calorie.expectedCalorie());

        ArrayList<Calorie> calarray = Calorie.calorieList;
        calarray.clear();
    }

    @Test
    /**
     * testing if expectd caloric intake for given user information is correct with output of method expectedCalorie().
     */
    void expectedCalorie2() {

        User user = new User(180, 70, 30);
        int PA = 1;
        double expected_test = ((864 - (9.72 * User.GetAge()) + PA * ((14.2 * User.GetWeight()) + (503 * (User.GetHeight()) / 100))));
        assertEquals(expected_test, Calorie.expectedCalorie());

        ArrayList<Calorie> calarray = Calorie.calorieList;
        calarray.clear();
    }


    @Test
    /**
     * Checking if the total calorie calculated is correct to the one provided below which adds up to 600.
     */
    void myCalorie() {
        ArrayList<Calorie> test_list = new ArrayList<Calorie>();
        Calorie cal = new Calorie(200);
        Calorie cal2 = new Calorie(400);

        test_list.add(cal);
        test_list.add(cal2);

        int total_test = cal.getFoodCalorie() + cal2.getFoodCalorie();
        cal.addCalorie(cal);
        cal2.addCalorie(cal2);
        int total = Calorie.myCalorie();

        assertEquals(total_test, total);

        ArrayList<Calorie> calarray = Calorie.calorieList;
        calarray.clear();


    }
}

