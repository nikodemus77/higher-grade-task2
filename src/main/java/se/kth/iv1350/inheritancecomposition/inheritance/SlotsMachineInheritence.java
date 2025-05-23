package se.kth.iv1350.inheritancecomposition.inheritance;
import java.util.Random;


public class SlotsMachineInheritence extends Random {
    private final int BOUND = 100;

    public SlotsMachineInheritence(){

    }


    public int playSlots(int bet){
        int spin1 = nextInt(BOUND);
        int spin2 = nextInt(BOUND);
        int spin3 = nextInt(BOUND);

        if(spin1 == spin2 && spin2 == spin3){
            System.out.println("Haleluja JACKPOT!");
            return bet*10000;
        }else if(spin1 == spin2 || spin1 == spin3 || spin2 == spin3){
            System.out.println("Gongratulation! you won!");
            return bet*100;
        }else{
            return 0;
        }


    }


}
