package com.james_engine.core;

import java.util.LinkedList;

import com.james_engine.core.Turn.Step;

public class Game {

    private LinkedList<Player> players;
    private Zone battlefield;
    private Zone exile;
    private int turnNumber;
    private LinkedList<Turn> turns;
    private LinkedList<Ability> abilities;
    private LinkedList<Player> passingPlayers;

    private EventHandler eventHandler;
    private Step currentStep;

    public Game() {

    }

    public void setUp() {

    }

    public void begin() {

        /*
         * Scan cards involved in game for possible events that could take place.
         * Development of system to scan cards for events should be created. Scanner
         * could run statically over cards or dynamically as they are loaded
         */

    }

    public void run() {

        // While no player is a winner or a draw has been declared
        // TODO: Make is to a player winning ends the game
        while (true) {

            Turn currentTurn = nextTurn();

            conductTurn(currentTurn);

        }

    }

    public void conductTurn(Turn turn) {
        currentStep = turn.nextStep();
        while (currentStep != null) {

            switch (currentStep) {
            // Each case calls the event that signifies the start of that phase

            case UNTAP:
                break;
            case UPKEEP:
                break;
            case DRAW:
                break;
            case PRE_COMBAT_MAIN:
                break;
            case BEGINNING_OF_COMBAT:
                break;
            case DECLARE_ATTACKERS:
                break;
            case DECLARE_BLOCKERS:
                break;
            case COMBAT_DAMAGE:
                break;
            case END_OF_COMBAT:
                break;
            case POST_COMBAT_MAIN:
                break;
            case END:
                break;
            case CLEANUP:
                break;
            default:
                break;

            }

        }

    }

    /*
     * Returns the winner of the game, or no player if a draw is reached
     * 
     * @return winner The player that won the game
     */
    public Player end() {
        return null;
    }

    public void addPlayer() {

    }

    public void removePlayer() {

    }

    public Turn nextTurn() {

        return null;

    }

    public Player needsPriority() {

        return null;

    }

}