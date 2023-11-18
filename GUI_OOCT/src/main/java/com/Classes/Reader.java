package com.Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Reader {

    public static void ReadFile(File LoadFile){
        if (LoadFile.exists() && LoadFile.isFile() && LoadFile.canRead()) {
            try {
                Scanner scanner = new Scanner(LoadFile);
                int tracker = 0;
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (tracker == 0) {
                        // height
                        User.setHeight(Integer.parseInt(line));
                        tracker++;
                    } else if (tracker == 1) {
                        // weight
                        User.setWeight(Integer.parseInt(line));
                        tracker++;
                    } else if (tracker == 2) {
                        //age
                        User.setAge(Integer.parseInt(line));
                        tracker++;
                    } else if (tracker == 3) {
                        // food and calorie of food
                        String[] food_calorie = line.split(",");
                        Food r_food = new Food(food_calorie[0]);
                        r_food.addFood(r_food);
                        Calorie c_food = new Calorie(Integer.parseInt(food_calorie[1]));
                        c_food.addCalorie(c_food);
                        tracker++;
                    } else if (tracker == 4) {
                        //food,protein
                        Food pfood = new Food("Null");
                        String[] food_protein = line.split(",");
                        for (Food key : Food.getMap().keySet()) {
                            String current_food = key.toString();
                            if (current_food.equals(food_protein[0])){
                                pfood = key;
                            }
                        }
                        int[] array_p = Food.getMap().get(pfood);
                        array_p[0] = Integer.parseInt(food_protein[1]);
                        Food.getMap().put(pfood, array_p);
                        tracker++;
                    } else if (tracker == 5) {
                        //food,carb

                        Food cfood = new Food("Null");
                        String[] food_carb = line.split(",");
                        for (Food key : Food.getMap().keySet()) {
                            String current_food = key.toString();
                            if (current_food.equals(food_carb[0])){
                                cfood = key;
                            }
                        }
                        int[] array_c = Food.getMap().get(cfood);
                        array_c[1] = Integer.parseInt(food_carb[1]);
                        Food.getMap().put(cfood, array_c);
                        tracker++;

                    } else if (tracker == 6) {
                        //food,fat

                        Food ffood = new Food("Null");
                        String[] food_fat = line.split(",");
                        for (Food key : Food.getMap().keySet()) {
                            String current_food = key.toString();
                            if (current_food.equals(food_fat[0])){
                                ffood = key;
                            }
                        }
                        int[] array_f = Food.getMap().get(ffood);
                        array_f[2] = Integer.parseInt(food_fat[1]);
                        Food.getMap().put(ffood, array_f);
                        tracker= 3;

                    }
                }
            } catch (FileNotFoundException e) {
                System.err.println("Unable to find file");
                System.exit(1);
            }

        }
            else{
                    System.err.println("Cannot access the file to read it!");
                    System.exit(1);
                }
            }
        }


