package com.epam.task1;

public class Main {

    public static void main(String[] args) throws ValidatorException {
        try {
            DeckOfCards deckOfCards = new DeckOfCards();
            deckOfCards.addCards();
            deckOfCards.view();
        } catch (ValidatorException e) {
            System.err.println(e.getMessage());
        }
    }
}
