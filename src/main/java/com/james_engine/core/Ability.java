package com.james_engine.core;

import java.util.LinkedList;

/**
 * Ability
 */
public class Ability {

    private Card owner;
    private LinkedList<Effect> effects;

    Ability() {

    }

    public enum Type {
        STATIC, ACTIVATED, TRIGGERED
    }

}