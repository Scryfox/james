package com.james_engine.core;

import java.util.LinkedList;

public class Match {

    private LinkedList<Game> games;

    public Match() {

    }

    public enum Format {
        COMMANDER, STANDARD, PIONEER, LEGACY, MODERN, BRAWL, VINTAGE, HISTORIC, LIMITED
    }

}