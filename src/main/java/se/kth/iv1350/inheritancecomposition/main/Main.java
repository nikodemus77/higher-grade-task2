package se.kth.iv1350.inheritancecomposition.main; 

import se.kth.iv1350.inheritancecomposition.composition.*;
import se.kth.iv1350.inheritancecomposition.inheritance.*;

/**
 * The entry point of the program containing the main method
 */
public class Main {
    public static void main(String[] args){
        DiceCollectionComposition diceCol = new DiceCollectionComposition();

        System.out.println("Welcome to the Dice Roller!");
        diceCol.rollTheDice("D4");
        diceCol.rollTheDice("D6");
        diceCol.rollTheDice("D8");
        diceCol.rollTheDice("D10");
        diceCol.rollTheDice("D12");
        diceCol.rollTheDice("D20");


        CheatRandom cheatRandom = new CheatRandom();
        System.out.println("Welcome to the cheat random generator!");
        for(int i = 0; i < 21; i++){
            System.out.println("The generated number is: " +  cheatRandom.nextInt(100)); 

        }
    }
}