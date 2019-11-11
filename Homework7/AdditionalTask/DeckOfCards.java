package com.epam.task1;

public class DeckOfCards {
    private Card[][] deckOfCards;

    public DeckOfCards() {
        this.deckOfCards = new Card[0][0];
    }

    public void addCards() throws ValidatorException {
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();
        int countOfSuits = suits.length;
        int countOfRanks = ranks.length;
        if (countOfSuits + countOfRanks == 0) throw new ValidatorException("The suits and ranks are empty.");
        if (countOfSuits == 0) throw new ValidatorException("The suits are empty.");
        if (countOfRanks == 0) throw new ValidatorException("The ranks are empty.");
        this.deckOfCards = new Card[countOfSuits][countOfRanks];
        for (Suit suit : Suit.values())
            for (Rank rank : Rank.values())
                this.deckOfCards[suit.ordinal()][rank.ordinal()] = new Card(suit, rank);
    }

    public void view() {
        if (this.deckOfCards != null)
            for (Card[] cardsOfTheSameSuit : this.deckOfCards)
                if (cardsOfTheSameSuit != null)
                    for (Card card : cardsOfTheSameSuit)
                        if (card != null)
                            System.out.println(card);
    }
}
