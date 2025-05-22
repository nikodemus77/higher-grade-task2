package se.kth.iv1350.inheritancecomposition.composition;

import java.util.Random; 

public class DiceCollection {
    private Random rng;

    


    public DiceCollection(){
        this.rng = new Random();
    }
    
    public void roll(int numberofDice, String typeofDice){


    }
    // Alla tärningar ska bli privata metoder anropade av metoden roll
    public void d4(){
        final int bound = 5;

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

    public void d8(){
        final int bound = 9;

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

    public void d10(){
        
        final int bound = 11;

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

    public void d12(){
        
        final int bound = 13;

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

    public void d20(){
        
        final int bound = 21;

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
