# Calorie-Tracker-Application
An Object Oriented Java Application that tracks users Calorie. Also implemented GUI using JavaFx to help user enter their required information.
# Final Code Submission ReadME file containing Demo3 material
# Authors: Rezwan Ahmed (UCID: 30134609) & Raizan Ahmed (UCID: 30134334)
         
# Project name: Calorie Tracker
// Proper way to interact with the program using GUI:

After starting the program please stretch the screens to show the full size and other buttons available to the user.

The menu has 2 options:
1)File: File has 3 options:
       1) Load : Clicking this button enables you to choose a file to load from
       You can load from any file that is of type .txt and contains information inside in the correct format that the program is designed to intake.
       One example of such a load.txt file is provided in the GUI_OOCT Folder.

       2) Save : clicking this button enables you to choose a file to save to

       TO BE ABLE TO RUN THE PROGRAM FROM TERMINAL USING .JAR FILE AND IDE BY USING PREVIOUSLY SAVED DATA:

       If you are using the terminal and .jar file to run the program then you must overwrite the save.txt file that is in the same directory as the .jar file being run from.
       If you are using the IDE to run the file then you must overwrite the save.txt file that is in the same directory as the src folder.
       Initially the save.txt files mentioned above are set to zeroes, but after doing what is mentioned above
       the program will have the ability to run the next time using previously saved data straight from the terminal and IDE too.
       To start the program fresh or anew with no previously stored data once you have overwritten initial save.txt files you have to set the save.txt files to contain only three zeroes on three different lines.

       3) Quit: terminates the program

Provide User Information:
1) Height: there is one text field that requires you to provide the height of the user in integer.
2) Weight: there is one text field that requires you to provide the weight of the user in integer.
3) Age: there is one text field that requires you to provide the age of the user in integer.
4) Add User: click this button to add the information of the user after all three text fields mentioned above are filled.

Failing to provide information or correct type of information will lead to failure in task and errors accordingly.

Add Food:
1) Name of Food: there is one text field to provide the name of the food.
2) Calorie of Food: there is one text field to provide the calorie of the food.
3) Add Food: click this button to add the food data after the two text fields mentioned above are filled. 

Failing to provide information or correct type of information will lead to failure in task and errors accordingly.

Add Nutrient:
1) Carbohydrate: press this button to select carbohydrate as the nutrient you are adding to a food.
2) Protein: press this button to select protein as the nutrient you are adding to a food.
3) Fat: press this button to select fat as the nutrient you are adding to a food.
4) Name of Food: there is one text field to provide the name of the food that you want to add nutrient amount to. The food mentioned here must already be added in the Add Food section above.
5) Amount of Nutrient: there is one text field to provide the amount of nutrient to be added in the food mentioned above.
The bottom left of the window shows a Status label which will update you on the task success or failure.
6) Add Nutrient: press this button to add the amount of nutrient to the food. 

Output Menu:
1)Enter option number: there is one text field that requires you to provide the integer number of the option you wish to select from the Menu displayed underneath.
2)Select Option: Press this button to select a button.

Output Details:
Text Area that displays the details of the option you have chosen. 

The bottom right of the window shows a Internal issues label which will update and give you details in red on internal issues if they take place.

// How to run the jar file for this project:

When running from terminal, first you should change the directory of the terminal to the directory of where the .jar file is located. 
Then you should write the following :
java --module-path "C:\Program Files\Java\javafx-sdk-18\lib" --add-modules javafx.controls,javafx.fxml -jar GUI_OOCT.jar save.txt

where the part in the apostrophes should be replaced by your own location of javafx sdk library.

you must run it using one argument which is save.txt, this is the default save file that is initially set to contain only three zeroes on three different lines. 
The program takes this save.txt file as argument so that when the save file is overwritten the program can be run from terminal using .jar file using the previously saved data.

That is all you are required to know to run this program.

Thank you.

