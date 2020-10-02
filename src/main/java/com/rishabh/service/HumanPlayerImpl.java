package com.rishabh.service;

import com.rishabh.model.GameState;
import com.rishabh.model.IPlayer;

public class HumanPlayerImpl implements IPlayer {
    public void playNextTurn(GameState gameState, int X, int Y) {
        if(gameState.isBattleShipPresent(X,Y,'B')){
            gameState.updateHit(X,Y,'X');
        } else {
            gameState.updateMiss(X,Y,'O');
        }
    }
}
