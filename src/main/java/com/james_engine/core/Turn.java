package com.james_engine.core;

import com.james_engine.core.events.EventHandler;

/**
 * Turn
 */

public class Turn {

    private Player activePlayer;
    private EventHandler eventHandler;

    public Turn() {

    }

    public STEP nextStep() {

        return null;

    }

    public enum STEP {
        UNTAP, UPKEEP, DRAW, PRE_COMBAT_MAIN, BEGINNING_OF_COMBAT, DECLARE_ATTACKERS, DECLARE_BLOCKERS, COMBAT_DAMAGE,
        END_OF_COMBAT, POST_COMBAT_MAIN, END, CLEANUP
    }

}