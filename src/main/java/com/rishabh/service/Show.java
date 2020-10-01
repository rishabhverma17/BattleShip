package com.rishabh.service;

import com.rishabh.model.GameState;

public class Show {

    // TODO 1) Extract Interface of Print and Implement in Console and File Writer Class
    public void print(GameState gameState){
        System.out.println("==== Printing Output ====");
        char[][] board = gameState.getBoard();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
