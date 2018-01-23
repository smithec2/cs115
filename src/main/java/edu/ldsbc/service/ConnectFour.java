package edu.ldsbc.service;

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
    public boolean haveWinner()
    {
        return true;
    }

    public void print(){

    }

}
