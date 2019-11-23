package com.james_engine.core.events;

import java.util.LinkedList;

import com.james_engine.core.Effect;

/**
 * EventTrigger
 */
public class EventHandler {

    private LinkedList<Event> registeredEvents;
    private LinkedList<Event> possibleEvents;
    private static EventHandler eventHandler = null;

    private EventHandler() {

    }

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

    public void removeEvent(Event event) {

    }

}