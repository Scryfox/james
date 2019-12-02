package com.james_engine.core;

import java.util.LinkedList;

public class Match {

    private LinkedList<Game> games;
    private EventHandler eventHandler;

    public Match() {

    }

    public void begin() {

    }

    public enum Format {
        COMMANDER, STANDARD, PIONEER, LEGACY, MODERN, BRAWL, VINTAGE, HISTORIC, LIMITED
    }

}