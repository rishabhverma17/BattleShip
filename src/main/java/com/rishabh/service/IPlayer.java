package com.rishabh.service;

import com.rishabh.model.GameState;

public interface IPlayer {
    void playNextTurn(GameState gameState, int X, int y);
}
