package com.james_engine.core.unit;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * PlayerTest
 */
public class PlayerTest {

    @Nested
    public class takeAction {

        @Test
        public void shouldReturnPassIfPlayerPassesPriority() {

        }

        @Test
        public void shouldReturnPlayIfPlayerPlaysACard() {

        }

        @Test
        public void shouldReturnActivateIfPlayerActivatesAnAbility() {

        }

    }

    @Nested
    public class choose {

    }

    @Nested
    class canPayCost {

        @Test
        public void shouldReturnTrueIfSpellCosts0() {

        }

    }

    @Nested
    public class play {

        @Test
        public void shouldThrowExceptionIfCardCantBePlayed() {

        }

        @Test
        public void shouldMoveCardToStackIfNonLand() {

        }

        @Test
        public void shouldMoveCardToBattlefieldIfLand() {

        }

    }

    @Nested
    public class activate {

    }

    @Nested
    public class mulligan {

    }

    @Nested
    public class concede {

    }
}