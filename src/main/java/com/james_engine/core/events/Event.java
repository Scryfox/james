package com.james_engine.core.events;

import java.util.LinkedList;

import com.james_engine.core.Effect;

/**
 * Events
 */
class Event {

    private String name;
    private Object owner;
    private LinkedList<Effect> registeredEffects;

}