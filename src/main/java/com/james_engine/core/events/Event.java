package com.james_engine.core.events;

import java.util.LinkedList;
import java.util.Map;

import com.james_engine.core.Effect;

/**
 * Events
 */
class Event {

    private String name;
    private Object caller;
    private LinkedList<Effect> registeredEffects;
    private Map<String, String> parameters;
    private LinkedList<Object> constraints;

}