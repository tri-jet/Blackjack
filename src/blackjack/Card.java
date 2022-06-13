/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Trijit
 */
public class Card {
    //each card has a rank and suit -  but in blackjack the suit is kind of irrelevant apart from
    //determining how many of the same rank are left.
    //each card also has a value:
    //2-10 - are worth 2-10
    //J,Q,K - worth 10
    //A - worth 1 or 11.
    private String rank;
    private String suit;
    private int value;
    
    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
        this.value = getValue();
    }
    
    public int getValue(){
        int val = 0;
        switch(rank){
            case "2":
                val = 2;
                break;
            case "3":
                val = 3;
                break;
            case "4":
                val = 4;
                break;
            case "5":
                val = 5;
                break;
            case "6":
                val = 6;
                break;
            case "7":
                val = 7;
                break;
            case "8":
                val = 8;
                break;
            case "9":
                val = 9;
                break;
            case "10":
                val = 10;
                break;
        }
        return val;
    }
}
