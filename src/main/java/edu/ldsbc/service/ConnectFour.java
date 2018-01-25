package edu.ldsbc.service;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Craig Smith
 *
 *
 * Cs 115 - Assignment 1a
 Package Name: cs115
 Class Name: connect4
 Objective: Designing Classes
 Create the Classes and methods for the game connect-four. The rules for the game and
 an animation can be found at http://mathworld.wolfram.com/Connect-Four.html. Do not
 create a user interface. Create jUnit tests to test that your classes and methods work.
 Consider carefully all the Classes you would need to create for other programmers to
 use where they would use your classes to hook a UI up. Use the commenting and
 coding standards found under the Program tab in the LMS.
 */
public class ConnectFour {
    private String[][] grid = new String[7][6];


    public void addToken(int x, String playerColor){

        int y = findOpenSlot(x);
        grid[x][y] = playerColor;

    }

    int findOpenSlot(int x) {
        String[] yArray = grid[x];
        boolean done = false;
        int result = 6;
        while (!done){
            result --;
            if (result == -1 || (yArray[result] == null) ) {
               done = true;
            }
        }
        return result ;
    }

    //do we have a winner
    public boolean haveWinner(String color)
    {
        return checkHorizontal(color) || checkVertical(color) || checkDiagonal(color);
    }

    boolean checkDiagonal(String color) {
        return false;
    }

    boolean checkVertical(String color) {
        return false;
    }

    boolean checkHorizontal(String color) {
        boolean result = checkOneColumn(0, color);
                result = result | checkOneColumn(1, color);
                result = result | checkOneColumn(2, color);
                result = result | checkOneColumn(3, color);
                result = result | checkOneColumn(4, color);
                result = result | checkOneColumn(5, color);

        return result;
    }

    boolean checkOneColumn(int columnNumber, String color) {
        String[] column = grabColumn(columnNumber);
        String columnStr = convertToString(column);
        return columnStr.contains(color + ", " + color + ", " + color + ", " + color);
    }

    String convertToString(String[] column) {
        return  Arrays.toString(column);
    }

    String[] grabColumn(int columnNumber) {
        if(columnNumber>6) {
            return new String[0];
        }
        return grid[columnNumber];
    }


    public void print(){

    }

}
