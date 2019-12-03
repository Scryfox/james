package com.james_engine.core;

import java.util.LinkedList;
import java.util.Optional;
import java.util.UUID;

public class Card {

    private UUID id;

    private String name;
    private LinkedList<CardEffect<String>> nameEffects;

    private Optional<LinkedList<ManaType>> manaCost;
    private LinkedList<CardEffect<LinkedList<ManaType>>> manaCostEffects;

    private Optional<LinkedList<SuperType>> superType;
    private LinkedList<CardEffect<LinkedList<SuperType>>> superTypeEffects;

    private LinkedList<Type> type;
    private LinkedList<CardEffect<LinkedList<Type>>> typeEffects;

    private String text;
    private LinkedList<CardEffect<String>> textEffects;

    private Player owner;
    private LinkedList<CardEffect<Player>> ownerEffects;

    private Optional<Player> controller;
    private LinkedList<CardEffect<Player>> controllerEffects;

    private Optional<Integer> power;
    private LinkedList<CardEffect<Integer>> powerEffects;

    private Optional<Integer> toughness;
    private LinkedList<CardEffect<Integer>> toughnessEffects;

    private Optional<Integer> loyalty;
    private LinkedList<CardEffect<Integer>> loyaltyEffects;

    private EventHandler eventHandler;

    Card() {

    }

    public String getName() {
        String currentName = this.name;

        for (CardEffect<String> effect : nameEffects) {
            currentName = effect.change(currentName);
        }

        return currentName;
    }

    public LinkedList<ManaType> getManaCost() {
        LinkedList<ManaType> currentManaCost = this.manaCost.get();

        for (CardEffect<LinkedList<ManaType>> effect : manaCostEffects) {
            currentManaCost = effect.change(currentManaCost);
        }

        return currentManaCost;
    }

    public LinkedList<SuperType> getSuperType() {
        LinkedList<SuperType> currentSuperType = this.superType.get();

        for (CardEffect<LinkedList<SuperType>> effect : superTypeEffects) {
            currentSuperType = effect.change(currentSuperType);
        }

        return currentSuperType;
    }

    public LinkedList<Type> getType() {
        LinkedList<Type> currentType = this.type;

        for (CardEffect<LinkedList<Type>> effect : typeEffects) {
            currentType = effect.change(currentType);
        }

        return currentType;
    }

    public String getText() {
        String currentText = this.text;

        for (CardEffect<String> effect : textEffects) {
            currentText = effect.change(currentText);
        }

        return currentText;
    }

    public Player getOwner() {
        Player currentOwner = this.owner;

        for (CardEffect<Player> effect : ownerEffects) {
            currentOwner = effect.change(currentOwner);
        }

        return currentOwner;
    }

    public Player getController() {
        Player currentController = this.controller.get();

        for (CardEffect<Player> effect : controllerEffects) {
            currentController = effect.change(currentController);
        }

        return currentController;
    }

    public Integer getPower() {
        Integer currentPower = this.power.get();

        for (CardEffect<Integer> effect : powerEffects) {
            currentPower = effect.change(currentPower);
        }

        return currentPower;
    }

    public Integer getToughness() {
        Integer currentToughness = this.toughness.get();

        for (CardEffect<Integer> effect : toughnessEffects) {
            currentToughness = effect.change(currentToughness);
        }

        return currentToughness;
    }

    public Integer getLoyalty() {
        Integer currentLoyalty = this.loyalty.get();

        for (CardEffect<Integer> effect : loyaltyEffects) {
            currentLoyalty = effect.change(currentLoyalty);
        }

        return currentLoyalty;
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

    public interface CardEffect<T> {
        T change(T changed);
    }

}