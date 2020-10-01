package com.rishabh.service;

import com.rishabh.model.GameState;

public class GameManager {
    private GameState gameState;

    public GameManager(GameState gameState){
        this.gameState = gameState;
    }

    public void playGame(IPlayer player){
        for(int i=0; i<gameState.getTotalMissiles(); i++){
            String[] coordinates = gameState.getMoves()[i].split(",");
            int xAxis = Integer.parseInt(coordinates[0]);
            int yAxis = Integer.parseInt(coordinates[1]);
            player.playNextTurn(gameState,xAxis,yAxis);
        }

        Show show = new Show();
        show.print(gameState);
    }
}
