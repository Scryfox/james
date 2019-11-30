package com.james_engine.core;

import java.util.LinkedList;

import com.james_engine.core.events.EventHandler;

public class Game {

    private LinkedList<Player> players;
    private Zone battlefield;
    private Zone exile;
    private int turnNumber;
    private LinkedList<Turn> turns;
    private LinkedList<Ability> abilities;

    private EventHandler eventHandler = EventHandler.EventHandler();

    public Game() {

    }

    public void setUp() {

    }

    public void begin() {

        /*
         * Scan cards involved in game for possible events that could take place.
         * Development of system to scan cards for events should be created. Scanner
         * could run statically over cards or dynamically as they are loaded
         */

    }

    /*
     * Returns the winner of the game, or no player if a draw is reached
     * 
     * @return winner The player that won the game
     */
    public Player end() {
        return null;
    }

    public void addPlayer() {

    }

    public void removePlayer() {

    }

    public Turn nextTurn() {

        return null;

    }

}