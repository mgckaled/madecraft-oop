package examples;

import java.util.Random;

public class ExtraRandom extends Random {

    public String nextLetter(){
        int letterStart = 97;
        int randomInt = new Random().nextInt(26) + letterStart;
        return ""+ (char) randomInt;
    }
}
