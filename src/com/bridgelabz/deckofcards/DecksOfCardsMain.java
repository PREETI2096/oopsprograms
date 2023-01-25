package com.bridgelabz.deckofcards;

public class DecksOfCardsMain {
	public static void main(String[] args) {
		System.out.println("Welcome to Decks of Cards program");
		DecksOfCards deck = new DecksOfCards();
		deck.createDeck();
		System.out.println("Shuffled Deck is :");
		deck.shuffle();
	}
}
