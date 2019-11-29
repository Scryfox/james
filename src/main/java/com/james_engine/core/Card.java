package com.james_engine.core;

import java.util.LinkedList;
import java.util.Optional;
import java.util.UUID;

import com.james_engine.core.events.EventHandler;

public class Card {

    private UUID id;
    private String name;
    private Optional<LinkedList<ManaType>> manaCost;
    private Optional<SuperType> superType;
    private Type type;
    private String text;
    private Player owner;
    private Optional<Player> controller;
    private Optional<Integer> power;
    private Optional<Integer> toughness;
    private Optional<Integer> loyalty;

    private EventHandler eventHandler;

    private LinkedList<Effect> appliedEffects;

    Card() {

    }

    public void applyEffect(Effect effect) {

    }

    public void removeEffect(Effect effect) {

    }

    public enum Type {
        CREATURE, LAND, INSTANT, SORCERY, ENCHANTMENT, PLANESWALKER, ARTIFACT, TRIBAL
    }

    public enum SuperType {
        LEGENDARY, SNOW, BASIC, WORLD
    }

    public enum Color {
        BLUE, GREEN, WHITE, RED, BLACK
    }

    public enum ManaType {
        BLUE, GREEN, WHITE, RED, BLACK, COLORLESS, GENERIC
    }

}