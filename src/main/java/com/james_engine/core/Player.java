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

    /*
     * Used by Game to poll a Player object for a game action once that player has
     * priority. If the player activates/plays a card, it is responsible for dealing
     * with the events (via the EventHandler).
     * 
     * @return An Action enum indicating what the player decided to do
     */
    public Action takeAction() {
        // TODO: Poll Input for a decision on what to do
        return null;
    }

    public void play(Card card) {

    }

    public void activate(Ability ability) {

    }

    /*
     * Represents the expected methods for a system to provide to create a link
     * between an outside "player" and the Player class
     */
    public interface Input {
        public Action selectAction();
    }

    /*
     * Possible actions a player can take when given priority
     */
    public enum Action {
        PASS, ACTIVATE, PLAY
    }

}