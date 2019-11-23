package com.james_engine.core;

import java.util.LinkedList;
import java.util.Optional;
import java.util.UUID;

import com.james_engine.core.events.EventHandler;

public class Card {

    private UUID id;
    private String name;
    Optional<Integer> power;
    Optional<Integer> toughness;
    LinkedList<Color> manaCost;
    Optional<Integer> cmc;
    String text;
    private EventHandler eventHandler;

    private LinkedList<Effect> appliedEffects;

    Card() {

    }

    public enum Type {
        CREATURE, LAND, INSTANT, SORCERY, ENCHANTMENT, PLANESWALKER, ARTIFACT, TRIBAL
    }

    public enum SuperType {
        LEGENDARY, SNOW, BASIC, WORLD
    }

    public enum Color {
        BLUE, GREEN, WHITE, RED, BLACK, COLORLESS, GENERIC
    }

}