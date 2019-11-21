package com.james_engine.core;

import java.util.Optional;

public class Player {

    private String name;
    private int lifeTotal;
    private Optional<Integer> maximumHandSize;
    private Zone library;
    private Zone hand;
    private Zone graveyard;

    public Player() {

    }

}