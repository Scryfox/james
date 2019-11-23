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

    public Turn nextTurn() {

        return null;

    }

    public void begin() {

    }

}