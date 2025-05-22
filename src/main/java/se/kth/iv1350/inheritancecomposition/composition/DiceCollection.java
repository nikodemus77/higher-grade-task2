package se.kth.iv1350.inheritancecomposition.composition;

import java.util.Random; 

public class DiceCollection {
    private Random rng;

    


    public DiceCollection(){
        this.rng = new Random();
    }

    public void dSixDie(){
        System.out.println(rng.ints(1,6));
    }

    


}
