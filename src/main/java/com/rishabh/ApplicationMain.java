package com.rishabh;

import com.rishabh.model.GameState;
import com.rishabh.service.*;

import java.util.List;

public class ApplicationMain {
    public static void main(String[] args){
        System.out.println("==== Started Application ====");

        IPlayer player = new HumanPlayerImpl();
        SetupGame setupGame = new SetupGameImpl();
        List<String> input = setupGame.readInputFile("inputfile.txt");
        GameState gameState = new GameState(input);

        GameManager gameManager = new GameManager(gameState);
        gameManager.playGame(player);

    }
}
