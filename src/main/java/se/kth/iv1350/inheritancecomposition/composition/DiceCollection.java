package se.kth.iv1350.inheritancecomposition.composition;

import java.lang.*;
import java.util.Random;

public class DiceCollection implements Roll{
    private Random rng;

    private final int d4Bound = 5;
    private final int d6Bound = 7;
    private final int d8Bound = 9;

    private final int d10Bound = 11;
    private final int d12Bound = 12;
    private final int d20Bound = 21;
    
    
    enum DiceType{
        D4,
        D6,
        D8,
        D10,
        D12,
        D20
    }
    
    @Override
    public void rollTheDice(String diceType){
        
        int bound;
        DiceType type = DiceType.valueOf(diceType.toUpperCase());

        boolean isDiceRightType = this.isDiceTypeValid(diceType);
        if(isDiceRightType){
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
                default:
                    break
            }
            int result = rng.nextInt(bound);
            boolean decided = false;

            while (!decided){
                if(result == 0){
                    result = rng.nextInt(bound);
                }
                if(result != 0){
                    decided = true;
                }

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


    public DiceCollection(){
        this.rng = new Random();
    }
    
    public void roll(int numberofDice, String typeofDice){


    }
    // Alla tärningar ska bli privata metoder anropade av metoden roll
    public void d4(){
        

        
    }


   

    public void d6(){
        final int bound = 7;

        int result = rng.nextInt(bound);
        boolean decided = false;

        while (!decided){
            if(result == 0){
                result = rng.nextInt(bound);
            }
            if(result != 0){
                decided = true;
            }

        }
        System.out.println("The die shows a: " + result);
    }


    


}
