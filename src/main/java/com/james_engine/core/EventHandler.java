package com.james_engine.core;

import java.util.LinkedList;
import java.util.Observable;

/**
 * EventHandler is a singleton that other objects can call to obtain possible
 * actions they can take and execute them. This centralizes events in a single
 * place that allows outside classes to not worry about event hierarchy and what
 * kinds of events can be generated under what circumstances.
 */
class EventHandler extends Observable {

    private LinkedList<Event> registeredEvents;
    private LinkedList<Event> possibleEvents;

    public EventHandler() {

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

    public void reset() {

    }

}