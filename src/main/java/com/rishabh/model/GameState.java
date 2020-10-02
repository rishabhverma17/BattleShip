package com.rishabh.model;

import lombok.Setter;

import java.util.List;

@Setter
public class GameState {
    private List<String> input;
    private char[][] gameBoard;
    private int boardLength;
    private int totalShips;
    private String[] shipPositions;
    private int totalMissiles;
    private String[] moves;

    public GameState(List<String> input){
        this.input = input;
        boardLength = Integer.parseInt(input.get(0));
        gameBoard = new char[boardLength][boardLength];
        totalShips = Integer.parseInt(input.get(1));
        shipPositions = input.get(2).split(":");
        totalMissiles = Integer.parseInt(input.get(3));
        moves = input.get(4).split(":");
        init();
    }

    private void init(){
        for(int i=0; i<boardLength; i++){
            for(int j=0; j<boardLength; j++){
                gameBoard[i][j] = '_';
            }
        }

        for(int i=0; i<totalShips; i++){
            String[] coordinates = shipPositions[i].split(",");
            gameBoard[Integer.parseInt(coordinates[0])][Integer.parseInt(coordinates[1])] = 'B';
        }
    }

    public void updateHit(int X, int Y, char hitChar){
        gameBoard[X][Y] = hitChar;
    }

    public void updateMiss(int X, int Y, char missChar){
        gameBoard[X][Y] = missChar;
    }

    public boolean isBattleShipPresent(int X, int Y, char battleShip){
        if(gameBoard[X][Y] == battleShip){
            return true;
        }
        return false;
    }

    public char[][] getBoard(){
        return gameBoard;
    }

    public int getBoardLength() {
        return boardLength;
    }

    public int getTotalShips() {
        return totalShips;
    }

    public String[] getShipPositions() {
        return shipPositions;
    }

    public int getTotalMissiles() {
        return totalMissiles;
    }

    public String[] getMoves() {
        return moves;
    }
}
