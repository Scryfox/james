package com.james_engine.core.events;

import java.util.LinkedList;

/**
 * CompositeEvent
 */
class CompositeEvent extends Event {

    private LinkedList<Event> composingEvents;

    CompositeEvent() {

    }

}