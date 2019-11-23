package com.james_engine.core;

import java.util.Optional;

import com.james_engine.core.events.EventHandler;

public class Player {

    private String name;
    private int lifeTotal;
    private Optional<Integer> maximumHandSize;
    private Zone library;
    private Zone sideboard;
    private Zone hand;
    private Zone graveyard;
    private int turnNumber;
    private EventHandler eventHandler;

    public Player() {

    }

}