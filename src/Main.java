/********************************************************************************/
/* This code and its associated files were created at the instruction of        */
/* professors at the University of Texas at San Antonio during my time as a     */
/* student at the university. I, as a student, was not responsible for the idea */
/* behind this code (i.e. project guidelines, functionality, and end purpose),  */
/* but I, Matthew Thomas Beck, can confirm that myself and any project partners */
/* (if applicable) were the ones responsible for writing it.                    */
/********************************************************************************/





/************************************************************/
/*************** IMPORT / CREATE DEPENDENCIES ***************/
/************************************************************/


/********** IMPORT UTILITIES **********/

import java.util.*; // import utilities for scanner or anything else that may be useful


/******************************************************/
/*************** MOVEMENT PRIMARY CLASS ***************/
/******************************************************/

public class Main {


    /********** DECLARE GLOBAL CONSTANTS **********/

    /***** declare global constant to remain unchanged *****/

    public static Scanner scnr = new Scanner(System.in); // used to get user input
    public static int SHAPE_POPULATION = 0; // used to set maximum shapes
    public static int MAX_MOVES = 0; // used to set maximum moves
    public static String[] SHAPE_TYPES = {"circle", "square"}; // used to set shape types
    public static int[] SIZES; // used to set shape sizes
    public static String[] COLORS = { // used to set shape colors

            "Red", "Blue", "Pink", "Yellow", "Green", "Magenta", "Orange", "Dark_gray", "Light_gray", "Gray"
    };
    public static int[] DIRECTIONS = {0, 2, 4, 6}; // used to set shape directions
    public static int[] SPEEDS = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // used to set shape speeds
    public static int[] X_POSITIONS; // used to set shape x positions
    public static int[] Y_POSITIONS; // used to set shape y positions


    /********** MAIN FUNCTION **********/

    // "will show basic information and obtain basic information of the execution"
    public static void main(String[] args) {

        // print programmer identity, other stuff
        System.out.println("UTSA - Spring 2024 - CS1083 - Project 3 – Movement - written by MATTHEW BECK\n");

        System.out.println( // prompt user to enter information

                "Please input width, height of the panel, # of shapes, # of times to move followed by the shape," +
                "size, color, direction, and speed of every shape:\n"
        );


    }


    /********** SHAPE INFO FUNCTION **********/

    public static void getShapeInformation() { // "will get the information for all the shapes from the user"


    }


    /********** INITIAL POSITION FUNCTION **********/

    // "will calculate the top left position of every shape at the beginning of the program's execution"
    public static void initialPosition() {


    }


    /********** SHOW SHAPES MOVING FUNCTION **********/

    public static void showShapesMoving() { // "will emulate the movement of the shapes"


    }


    /********** CHANGE POSITION FUNCTION **********/

    // "will calculate the new x and y positions of the top left corner of all the shapes"
    public static void changePositions() {


    }


    /********** SHOW SHAPES FUNCTION **********/

    public static void showShapes() { // "will call methods to change color and show the specific forms"


    }


    /********** SET NO COLOR FUNCTION **********/

    // "will set the color similar to the background (aka. WHITE), used to emulate the movement"
    public static void setNoColor(String color) {


    }


    /********** SET GRAPHICS COLOR FUNCTION **********/

    public static void graphicsSetColor(String color) { // "will set the color of the i-th shape to be printed"


    }


    /********** SHOW SQUARE FUNCTION **********/

    // "will show the filled i-th shape as a square with BLACK border"
    public static void showSquare(int x, int y, int size, String color) {


    }


    /********** SHOW CIRCLE FUNCTION **********/

    // "will show the filled i-th shape as a circle with BLACK border"
    public static void showCircle(int x, int y, int size, String color) {


    }
}