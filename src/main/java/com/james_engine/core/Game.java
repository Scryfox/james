package com.james_engine.core;

import java.util.LinkedList;

public class Game {

    private LinkedList<Player> players;
    private Zone battlefield;
    private Zone exile;

    public Game() {

    }

    public enum Format {
        COMMANDER, STANDARD, PIONEER, LEGACY, MODERN, BRAWL, VINTAGE, HISTORIC, LIMITED
    }

}