package lsg.helpers;
import java.util.Random;

public class Dice {
    private int faces;
    private Random random;

    public Dice(int face){
        this.random = new Random(5340);
        this.faces = face;
    }

    public int roll (){
        return random.nextInt(this.faces);
    }
}
