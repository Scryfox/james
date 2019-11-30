package com.james_engine.core;

import java.util.LinkedList;

public class Match {

    private LinkedList<Game> games;

    public Match() {

    }

    public void begin() {

    }

    /*
     * Returns the winner of the game, or no player if a draw is reached
     * 
     * @return winner The player that won the game
     */
    public Player end() {
        return null;
    }

    public enum Format {
        COMMANDER, STANDARD, PIONEER, LEGACY, MODERN, BRAWL, VINTAGE, HISTORIC, LIMITED
    }

}