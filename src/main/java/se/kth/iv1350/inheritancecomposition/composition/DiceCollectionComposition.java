package se.kth.iv1350.inheritancecomposition.composition;

import java.lang.*;
import java.util.Random;

/**
 * Contains different dice types with functionalities to roll a die.
 * The available dice are D4, D6, D8, D10, D12, D20.
 */
public class DiceCollectionComposition{
    private Random rng;

    private final int d4Bound = 4;
    private final int d6Bound = 6;
    private final int d8Bound = 8;

    private final int d10Bound = 10;
    private final int d12Bound = 12;
    private final int d20Bound = 20;
    
    /**
     * An enum representing available die types.
     */
    enum DiceType{
        D4,
        D6,
        D8,
        D10,
        D12,
        D20
    }

    /**
     * Insitantiates an object of the DiceCollection
     */
    public DiceCollectionComposition(){
        this.rng = new Random();
    }
    
    /**
     * The function of rolling a die.
     * @param diceType A string selecting the dice type to be rolled.
     */
    public void rollTheDice(String diceType){
        int bound = 0;
        boolean isDiceRightType = this.isDiceTypeValid(diceType);
        if(isDiceRightType){
            DiceType type = DiceType.valueOf(diceType.toUpperCase());
            switch(type){ 
                case D4:
                    bound = d4Bound;
                    break;
                case D6:
                    bound = d6Bound;
                    break;
                case D8:
                    bound = d8Bound;
                    break;
                case D10:
                    bound = d10Bound;
                    break;
                case D12:
                    bound = d12Bound;
                    break;
                case D20:
                    bound = d20Bound;
                    break;
            }
            int result = rng.nextInt(bound);  

            if(result == 0){
                result = bound;
            }
            System.out.println("The die shows a: " + result);
        }else{
            System.out.println("Dice type not available!" + "Available dice types are currently: D4, D6, D8, D10, D12, D20");
        }
    }

    private boolean isDiceTypeValid(String diceType){
        try{
            DiceType.valueOf(diceType.toUpperCase()); 
            return true;
        }catch(IllegalArgumentException e){
            return false;
        }
    }

}
