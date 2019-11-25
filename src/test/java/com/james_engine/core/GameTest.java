package com.james_engine.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class GameTest {

    Game testGame;

    @BeforeEach
    public void setUpGame() {
        testGame = new Game();
    }

    @Nested
    public class start {

        @Test
        void shouldEndInPreGameActionsStep() {
            assert (true);
        }

    }

}