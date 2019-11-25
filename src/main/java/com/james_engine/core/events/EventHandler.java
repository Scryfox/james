package com.james_engine.core.events;

import java.util.LinkedList;

import com.james_engine.core.Effect;

/**
 * EventHandler is a singleton that other objects can call to obtain possible
 * actions they can take and execute them. This centralizes events in a single
 * place that allows outside classes to not worry about event hierarchy and what
 * kinds of events can be generated under what circumstances.
 */
public class EventHandler {

    private LinkedList<Event> registeredEvents;
    private LinkedList<Event> possibleEvents;
    private static EventHandler eventHandler = null;

    private EventHandler() {

    }

    /*
     * EventHandler should be a singleton, handles all effects that are generated
     * throughout the game
     */
    public static EventHandler EventHandler() {
        if (eventHandler == null) {
            eventHandler = new EventHandler();
        }

        return eventHandler;
    }

    public Event getEvent(String name) {
        return null;
    }

    public void triggerEvent(Event event) {

    }

    public void registerEffectWithEvent(Event event, Effect effect) {

    }

    public void removeEffect(Effect effect) {

    }

    public void removeEvent(Event event) {

    }

}