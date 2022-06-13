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
public class Game {
    public static void main(String[] args){
        
        Game game =  new Game();
        
        System.out.println("hello players");
        game.createBoard();
        
    }
    
    public void createBoard(){
        //create gui for game
    }
    
    //game starts with an arraylist of cards so have a method to reset 
    //the deck arraylist attribute.
    //Make arraylist of deck - add all cards to it at start 
    //When card drawn from deck, remove from the deck and add to the player"s hand.
}
