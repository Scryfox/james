package com.james_engine.core;

import static org.mockito.Mockito.mock;

import com.james_engine.core.events.EventHandler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class GameTest {

    Game mockGame;
    EventHandler mockHandler;

    @BeforeEach
    public void setUpMockEventHandler() {

        mockHandler = mock(EventHandler.class);
    }

    @BeforeEach
    public void setUpMockGame() {
        mockGame = mock(Game.class);
    }

    @Nested
    public class setUp {

        @Test
        void shouldAllowOpeningGameActions() {

            // TODO: Players should be able to take opening game actions (such as playing
            // leylines)
        }

        @Test
        void shouldAllowMulliganDecisions() {
            // TODO: Players should be prompted to decide whether to mulligan
        }

    }

    @Nested
    public class begin {

        @Test
        void shouldEndInUnTapStepOfActivePlayer() {
            // TODO: The active player should begin with their untap step
        }

    }

    @Nested
    public class end {

        @Test
        void shouldReturnWinnerWhenAPlayerWins() {
            // TODO: The game should return a winner when a a win/loss
            // condition is met
        }

        void shouldReturnDrawWhenGameDraws() {
            // TODO: Game should return a draw when a draw condition is met
        }

    }

    @Nested
    public class nextTurn {

        @Test
        void shouldMakeNextPlayerActive() {
            // TODO: Next player in line should become active player
        }

        @Test
        void shouldIncrimentTheCurrentTurnCounter() {
            // TODO: The current turn counter should be incremented
        }

    }

}