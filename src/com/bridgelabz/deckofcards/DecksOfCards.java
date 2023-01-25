package com.bridgelabz.deckofcards;

public class DecksOfCards {
	private final String[] value = new String[] {"K","Q","J","10","9","8","7","6","5","4","3","2","A"};
	private final Cards[] deck = new Cards[52];
	
		 public void createDeck() {
		int i =0;
		/*
		 * for each => used to iterate through ArrayList
		 */
		for(Suit suit :Suit.values()) {
			for(String value :value) {
				deck[i++]= new Cards(suit, value);
			}
			}
		for (Cards card :deck) {
			System.out.println(card.getValue() + " of "+ card.getSuit());
		}	
 }

 public void shuffle() {
	 int i =0;
	 for(Suit suit : Suit.values()) {
		 int r = i + (int)(Math.random()* (deck.length-i));
		 Cards temp = deck [i];
		 deck[i] = deck[r];
		 deck[r] = temp;
		 }
	 for (Cards card :deck) {
			System.out.println(card.getValue() + " of "+ card.getSuit());
	 
	 }
 }
 
}
