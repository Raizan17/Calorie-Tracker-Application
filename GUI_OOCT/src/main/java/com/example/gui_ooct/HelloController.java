/**
 * Name: Raizan Ahmed
 * UCID: 30134334
 * Name: Rezwan Ahmed
 * UCID: 30134609
 * Course: CPSC 233
 * Professor: Jonathan Hudson
 * Tutorial: T10
 * Name of Program: Calorie tracker
 * Program details: It is  an object-oriented program with event-driven GUI layer on top that allows the user
 * to track his calorie and food data accordingly.
 */

package com.example.gui_ooct;

import com.Classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class HelloController {

    private boolean error = false;

    private int selected_nutrient = 0;
    private final int option_1 = 1;
    private final int option_2 = 2;
    private final int option_3 = 3;
    private final int option_4 = 4;
    private final int option_5 = 5;
    private final int option_6 = 6;
    private final int option_7 = 7;

    private int certain_carb = 0;
    private int certain_fat = 0;
    private int certain_protein = 0;

    @FXML
    private TextArea output;

    @FXML
    private TextField option;


    @FXML
    private TextField foodN;

    @FXML
    private TextField nutrient;

    @FXML
    private TextField calorie;

    @FXML
    private TextField food;

    @FXML
    private TextField height;

    @FXML
    private TextField weight;

    @FXML
    private TextField age;

    @FXML
    private Label Status;

    @FXML
    private Label internal;

    /**
     *Action bound to About button that causes an alert pop up to show up with details about program
     */
    @FXML
    void AboutAction(ActionEvent event) {
        internal.setText("(No internal issues)");                        // clearing setting internal issues Label to default
        Alert alert= new Alert(Alert.AlertType.INFORMATION,              // creating new alert pop up type information and entering details
                "Program Name and Version: CalorieTracker v1.0 \n"+"Authors: Rezwan Ahmed and Raizan Ahmed \n Contact: rezwan.ahmed@ucalgary.ca \n raizan.ahmed@ucalgary.ca \n"+"Program Details: A program that calculates"+"\n the calorie of the user. " );
        alert.setTitle("About");          // setting title of the alert popup
        alert.show();                     // showing pop up alert

        Status.setText("Successfully shown about page");              // Updating status
    }


    /**
     *Action bound to Quit button that causes the program to terminate.
     */
    @FXML
    void QuitAction(ActionEvent event) {
        internal.setText("(No internal issues)");                 // clearing setting internal issues Label to default
        System.out.println("Quit Action");
        Status.setText("Terminating program");
        System.exit(0);                                     // terminating program


    }

    /**
     * Function which loads a file selected by user upon click of load button on top left
     */
    @FXML
    void LoadAction(ActionEvent event) {
        internal.setText("(No internal issues)");                // clearing setting internal issues Label to default
        FileChooser fc = new FileChooser();                      // using filechooser to choose a file from user
        File file = fc.showOpenDialog(new Stage());              // using the openDialog since we are loading one file
        if (file != null) {                                      // checking if file returned is null in case user closes window before choosing file
            if (file.exists() && file.isFile() && file.canRead()) {    // checking if file exists, is a file and can be written to
                Reader.ReadFile(file);                   // using Reader class loadWorld function to read from chosen file

            } else {
                Status.setText("Failed to load file.");                           // Updating status to show failure of task
                internal.setText("Error! File is not of correct specifications"); // Updating internal issue label to show details
            }
            Status.setText("Successfully loaded file.");       // Updating Status
        }
        else{
            Status.setText("Failed to load file.");                     // Updating status to show failure of task
            internal.setText("Error! User did not select a file!");     // Updating internal issue label to show details
        }
    }


    /**
     * Action bound to clicking Save button which allows the user to choose a file to save to.
    */
    @FXML
    void SaveAction(ActionEvent event) {
        int errorcheck = 0;                                 // using a variable as an error checker as to where the program should continue while errorcheck is not 1.
        internal.setText("(No internal issues)");           // clearing setting internal issues Label to default
        FileChooser fc = new FileChooser();                 // using filechooser to allow user to choose a file to save to
        fc.setInitialFileName("save.txt");                 // setting initial name of file to world.txt
        File file = fc.showSaveDialog(new Stage());         // using SaveDialog since we are saving the file
        if (file != null) {                                  // checking if file returned is null in case user closes window before choosing file
            if (file.exists() && file.isFile() && file.canWrite()) {
                String final_string = String.valueOf(User.GetHeight()) + "\n";
                final_string = final_string + String.valueOf(User.GetWeight()) + "\n";
                final_string = final_string + String.valueOf(User.GetAge()) + "\n";
                HashMap<Food, int[]> hmap = Food.getMap();
                for (Food key : hmap.keySet()) {
                    String current_food = key.toString();
                    int food_index = Food.foodArrayList.indexOf(key);
                    Calorie calorie_of_food = Calorie.calorieList.get(food_index);
                    int final_calorie = calorie_of_food.getFoodCalorie();
                    final_string = final_string + current_food + "," + final_calorie + "\n";
                    int[] array_nutri = hmap.get(key);
                    final_string = final_string + current_food + "," + String.valueOf(array_nutri[0]) + "\n";
                    final_string = final_string + current_food + "," + String.valueOf(array_nutri[1]) + "\n";
                    final_string = final_string + current_food + "," + String.valueOf(array_nutri[2]) + "\n";
                }
                try {
                    FileWriter file_writer = new FileWriter(file);                             // creating a file writer
                    BufferedWriter buffered_writer = new BufferedWriter(file_writer);         // creating a buffered writer
                    buffered_writer.write(final_string);                                   // using bufferred writer to write the string to the chosen file
                    buffered_writer.flush();                                               // flushing to ensure that the file is written to
                } catch (IOException e) {                                                 // catching IO exception
                    Status.setText("Failed to save file.");                              // Updating status to show failure of task
                    internal.setText("Error! file can not be written to!");             // Updating internal issue label to show details
                    errorcheck = 1;                                                    // setting errorcheck to 1 so that the program doesn't carry our rest of code
                }

            }
                if (errorcheck != 1)                                    // checking if error has occured or not
                {
                    Status.setText("Successfully saved file.");
                } else {
                    Status.setText("Failed to save file.");
                }

            }
        else{
            Status.setText("Failed to save file.");                     // Updating status to show failure of task
            internal.setText("Error! User did not select a file!");     // Updating internal issue label to show details
        }
        }
    /**
     *Action bound to add user button that adds a user's information.
     */
    @FXML
    void AddUserAction(ActionEvent event) {
        error = false;
        internal.setText("(No internal issues)");
        int user_height = 0;
        int user_weight= 0;
        int user_age= 0;
        try {
            user_height = Integer.parseInt(height.getText());

        } catch (Exception e) {
            internal.setText("Could not parse integer of height.");
            Status.setText("Failed to add user");
            error = true;
        }


        try {
            user_weight = Integer.parseInt(weight.getText());
        } catch (NumberFormatException e) {
            internal.setText("Could not parse integer of weight.");
            Status.setText("Failed to add user");
            error = true;
        }


        try {
            user_age = Integer.parseInt(age.getText());
        } catch (NumberFormatException e) {
            internal.setText("Could not parse integer of age.");
            Status.setText("Failed to add user");
            error = true;
        }
        if(!error) {
            User u = new User(user_height, user_weight, user_age);
            Status.setText("Added User.");
        }
    }

        /**
         *Action bound to add food button that adds a specific food as data.
         */
        @FXML
        void AddFoodAction (ActionEvent event) {
            error = false;
            internal.setText("(No internal issues)");
            String food_a = food.getText();
            String real_food = null;
            try {                                         // try except block used in case user inputs invalid entry.
                int test_food = Integer.parseInt(food_a);
                error = true;
                internal.setText("Incorrect food name provided.");
                Status.setText("Failed to add food");
            } catch (Exception e) {
                real_food = food_a;

            }
            if (!error) {
                Food f = new Food(real_food);
                f.addFood(f);
                int calorie_amount = 0;
                try {
                    calorie_amount = Integer.parseInt(calorie.getText());
                } catch (NumberFormatException e) {
                    internal.setText("Could not parse integer of calorie.");
                    Status.setText("Failed to add food");
                    error = true;
                }

                if(!error) {
                    Calorie c = new Calorie(calorie_amount);
                    c.addCalorie(c);
                    Status.setText("Added Food");
                }
            }
        }

// selects type of nutrient upon clicking of button
        @FXML
        void SelectCarbAction (ActionEvent event){
            selected_nutrient = 1;  // carbohydrate
            Status.setText("Selected Carbohydrate");

        }
    // selects type of nutrient upon clicking of button
        @FXML
        void SelectFatAction (ActionEvent event){
            selected_nutrient = 3;  // protein
            Status.setText("Selected Fat");
        }
    // selects type of nutrient upon clicking of button
        @FXML
        void SelectProteinAction (ActionEvent event){
            selected_nutrient = 2;  // fat
            Status.setText("Selected Protein");
        }

        /**
         * Action bound to add nutrient button that adds a specific amount of nutrient to a food.
         */
        @FXML
        void AddNutrientAction (ActionEvent event){
            error = false;
            internal.setText("(No internal issues)");
            if (selected_nutrient == 1) {
                String certain_food = foodN.getText();
                try {                                                 // try except block used in case user inputs invalid entry.
                    certain_carb = Integer.parseInt(nutrient.getText());
                } catch (NumberFormatException e) {
                    internal.setText("Could not parse integer of carb nutrient.");
                    Status.setText("Failed to add nutrient");
                    error = true;
                }
                Food lfood = new Food("Error! This food has not been added yet");
                HashMap<Food, int[]> hmap = Food.getMap();
                for (Food key : hmap.keySet()) {
                    String current_food = key.toString();
                    if (current_food.equals(certain_food)) {
                        lfood = key;

                    }
                }
                try {
                    int[] array_dict = hmap.get(lfood);

                    array_dict[1] = certain_carb;
                    hmap.put(lfood, array_dict);
                    Status.setText("Added carb Nutrient.");
                } catch (Exception e) {
                    internal.setText(lfood.toString());
                    error = true;
                }
            }

            else if (selected_nutrient == 2) {

                String certain_food = foodN.getText();
                try {                                                  // try except block used in case user inputs invalid entry.
                     certain_protein = Integer.parseInt(nutrient.getText());
                } catch (NumberFormatException e) {
                    internal.setText("Could not parse integer of protein nutrient.");
                    Status.setText("Failed to add nutrient");
                    error = true;
                }
                Food lfood = new Food("Error! This food has not been added yet");
                HashMap<Food, int[]> hmap = Food.getMap();
                for (Food key : hmap.keySet()) {
                    String current_food = key.toString();
                    if (current_food.equals(certain_food)) {
                        lfood = key;
                    }
                }
                try {
                    int[] array_dict = hmap.get(lfood);

                    array_dict[0] = certain_protein;
                    hmap.put(lfood, array_dict);
                    Status.setText("Added protein Nutrient.");
                } catch (Exception e) {
                    internal.setText(lfood.toString());
                    Status.setText("Failed to add nutrient");
                    error = true;
                }
            }

            else if (selected_nutrient == 3) {

                String certain_food = foodN.getText();
                try {                                                   // try except block used in case user inputs invalid entry.
                     certain_fat = Integer.parseInt(nutrient.getText());
                } catch (NumberFormatException e) {
                    internal.setText("Could not parse integer of fat nutrient.");
                    Status.setText("Failed to add nutrient");
                }
                Food lfood = new Food("Error! This food has not been added yet");
                HashMap<Food, int[]> hmap = Food.getMap();
                for (Food key : hmap.keySet()) {
                    String current_food = key.toString();
                    if (current_food.equals(certain_food)) {
                        lfood = key;
                    }
                }
                try {
                    int[] array_dict = hmap.get(lfood);

                    array_dict[2] = certain_fat;
                    hmap.put(lfood, array_dict);
                    Status.setText("Added fat Nutrient.");
                } catch (Exception e) {
                    internal.setText(lfood.toString());
                    Status.setText("Failed to add nutrient");
                    error = true;
                }

            }
            else{
                internal.setText("No nutrients were selected!");
                Status.setText("Failed to add nutrient");
            }

        }

    /**
     * method which chooses the option typed in by the user upon clicking of button.
     */
        @FXML
        void ChooseOptionAction (ActionEvent event){
            internal.setText("(No internal issues)");
            String option_s = option.getText();
            if (option_s.equals("")) {
                internal.setText("Error no option selected!");
            Status.setText("Failed to choose option");}

                else{
                int option_chosen = Integer.parseInt(option_s);

                if (option_chosen == option_1) {
                    Status.setText("Chosen Option 1");
                    double expected_v = Calorie.expectedCalorie();
                    int total_mycalorie_v = Calorie.myCalorie();

                    output.setText(("Your total calorie requirement for the day is \n " + expected_v + " kcal.\n " +
                            "Your total calorie intake for the day is \n " + total_mycalorie_v + "kcal."));
                } else if (option_chosen == option_2) {
                    Status.setText("Chosen Option 2");
                    int Total_protein = Protein.totalProtein();
                    output.setText("Your total protein intake for the day is \n " + Total_protein + " grams.");
                    System.out.println(Food.map.toString());
                } else if (option_chosen == option_3) {
                    Status.setText("Chosen Option 3");
                    String highest_protein_food = Protein.highestProtein();
                    output.setText("The food with the highest amount of protein you \n have eaten today is:" + highest_protein_food);
                } else if (option_chosen == option_4) {
                    Status.setText("Chosen Option 4");
                    int Total_carbohydrate = Carbohydrate.totalCarb();
                    output.setText("Your total carbohydrate intake for the day \n is:" + Total_carbohydrate + "grams.");
                } else if (option_chosen == option_5) {
                    Status.setText("Chosen Option 5");
                    String highest_carbohydrate_food = Carbohydrate.highest_carb();
                    output.setText("The food with the highest amount of carbohydrate you \n have eaten  today is: " + highest_carbohydrate_food);
                } else if (option_chosen == option_6) {
                    Status.setText("Chosen Option 6");
                    int Total_fat = Fat.totalFat();
                    output.setText("Your total fat intake for the day \n is: " + Total_fat + "grams.");
                } else if (option_chosen == option_7) {
                    Status.setText("Chosen Option 7");
                    String highest_fat_food = Fat.highestFat();
                    output.setText("The food with the highest amount of fat you have eaten\n  today is: " + highest_fat_food);
                } else {
                    internal.setText("No correct options were chosen.");
                    Status.setText("Failed to choose option.");
                    System.out.println("HERE");
                }
            }
        }


    }