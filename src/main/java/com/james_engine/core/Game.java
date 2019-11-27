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

    private EventHandler eventHandler;

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

    public void end() {

    }

    public Turn nextTurn() {

        return null;

    }

}